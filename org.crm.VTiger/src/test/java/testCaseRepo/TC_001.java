package testCaseRepo;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)

public class TC_001 extends BaseClass 
{
	@Test//(groups = "regression")
	public void LE_01() throws Exception
	{
	
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOncreateNewLeadIcon();
		Assert.fail();
		CreatingNewLeadPage clp = new CreatingNewLeadPage(driver);
		String fname = eUtil.getDataFromExcel("Leads", 2, 1);
		String lName = eUtil.getDataFromExcel("Leads", 2, 2);
		String company = eUtil.getDataFromExcel("Leads", 2, 3);
		clp.createNewLead(fname, lName, company);
		Thread.sleep(3000);
		System.out.println("Test 1 executed");
	}
}
