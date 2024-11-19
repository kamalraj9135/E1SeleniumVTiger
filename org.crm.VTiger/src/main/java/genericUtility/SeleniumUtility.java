package genericUtility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	/**
	 * This method is to give implicitWait to our script
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void navigateURL(WebDriver driver, String URL) 
	{
		driver.navigate().to(URL);
	}
	
	/**
	 * This is a generic method to capture the screenshot
	 * @param driver
	 * @param screenshotName
	 * @return 
	 * @throws Exception
	 */
	public String captureScreenshot(WebDriver driver, String screenshotName) throws Exception 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\Screenshot" + screenshotName + ".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();     //used in Extents Report
	}
	
	/**
	 * This method is use to accept the alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) 
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is use to cancel the alert
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is use to get the text from alert
	 * @param driver
	 * @return
	 */
	public String getTextAlert(WebDriver driver)
	{
		String value = driver.switchTo().alert().getText();
		return value;
	}
	
	/**
	 * This method is use to send value to the alert
	 * @param driver
	 * @param value
	 */
	public void sendAlertMessage(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	/**
	 * This method is use to select option by numbers
	 * @param dropDownElement
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropDownElement, int index)
	{
		Select s = new Select(dropDownElement);
		s.selectByIndex(index);
	}
	
	/**
	 * This method is use to select option by value
	 * @param dropDownElement
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropDownElement, String value)
	{
		Select s1 = new Select(dropDownElement);
		s1.selectByValue(value);
	}
	
	/**
	 * This method is use to select option by visible text
	 * @param dropDownElement
	 * @param Text
	 */
	public void selectOptionByVisibleText(WebElement dropDownElement, String Text)
	{
		Select s2 = new Select(dropDownElement);
		s2.selectByVisibleText(Text);
	}
}
