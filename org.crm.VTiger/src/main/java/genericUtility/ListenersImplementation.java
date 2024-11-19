package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{
	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYY hh-mm-ss");
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Execution Started");
		
		//Create a test
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Execution Passed");
		
		test.log(Status.PASS, methodName + "Execution Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Execution Failed");
		
		test.log(Status.FAIL, methodName + "Execution Failed");
		
		//capturing the screenshot on test script getting failed
		
		SeleniumUtility sUtil = new SeleniumUtility();
		String screenshotName = methodName + dateTimeStamp;
		try {
			String path = sUtil.captureScreenshot(BaseClass.sDriver, screenshotName);
			
			test.addScreenCaptureFromPath(path);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Execution Skipped");
		
		test.log(Status.SKIP, methodName + "Execution Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Start");
		
		//Configuration of the Report
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\Report" + dateTimeStamp + ".html");
		reporter.config().setDocumentTitle("VTiger Testing Reports ");
		reporter.config().setReportName("VTiger");
		reporter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Reporter Name", "Kamal");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution Finished");
		
		report.flush();
	}
	
}
