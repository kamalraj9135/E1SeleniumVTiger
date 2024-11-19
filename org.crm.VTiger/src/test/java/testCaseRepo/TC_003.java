package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass 
{
	
	@Test(groups = {"smoke", "regression"})
	public void LE_03() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOncreateNewLeadIcon();
		CreatingNewLeadPage clp = new CreatingNewLeadPage(driver);
		String fname = eUtil.getDataFromExcel("Leads", 8, 1);
		String lName = eUtil.getDataFromExcel("Leads", 8, 2);
		String company = eUtil.getDataFromExcel("Leads", 8, 3);
		String title = eUtil.getDataFromExcel("Leads", 8, 4);
		String phNo = eUtil.getDataFromExcel("Leads", 8, 5);
		String email = eUtil.getDataFromExcel("Leads", 8, 6);
		String nOfEmp = eUtil.getDataFromExcel("Leads", 8, 7);
		clp.createNewLead(fname, lName, company, title, phNo, email, nOfEmp);
		System.out.println("Test 3 executed");
	}
}
