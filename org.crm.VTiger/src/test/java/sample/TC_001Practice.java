package sample;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_001Practice extends BaseClass
{
	@Test
	public void TC_01() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOncreateNewLeadIcon();
		CreatingNewLeadPage clp = new CreatingNewLeadPage(driver);
		String fName = eUtil.getDataFromExcel("Leads", 2, 1);
		String lName = eUtil.getDataFromExcel("Leads", 2, 2);
		String company = eUtil.getDataFromExcel("Leads", 2, 3);
		clp.createNewLead(fName, lName, company);
		
		
	}
}
