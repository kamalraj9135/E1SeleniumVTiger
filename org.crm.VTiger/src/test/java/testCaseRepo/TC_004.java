package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_004 extends BaseClass
{
	
	@Test(groups = "smoke")
	public void LE_01() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOncreateNewLeadIcon();
		CreatingNewLeadPage clp = new CreatingNewLeadPage(driver);
		String fname = eUtil.getDataFromExcel("Leads", 11, 1);
		String lName = eUtil.getDataFromExcel("Leads", 11, 2);
		String company = eUtil.getDataFromExcel("Leads", 11, 3);
		String street = eUtil.getDataFromExcel("Leads", 11, 4);
		String poBox = eUtil.getDataFromExcel("Leads", 11, 5);
		String pCode = eUtil.getDataFromExcel("Leads", 11, 6);
		String city = eUtil.getDataFromExcel("Leads", 11, 7);
		String country = eUtil.getDataFromExcel("Leads", 11, 8);
		String state = eUtil.getDataFromExcel("Leads", 11, 9);
		clp.createNewLead(fname, lName, company, street, poBox, pCode, city, country, state);
		Thread.sleep(3000);
		System.out.println("Test 4 executed");
		
	}
}
