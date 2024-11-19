package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganisationsPage;

public class TC_005 extends BaseClass
{
	
	@Test(groups = "regression")
	public void ORG_01() throws Exception
	{
		int rand = jUtil.getRandomNumber(1000);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganisationsPage orp = new OrganisationsPage(driver);
		orp.clickOncreateNewOrganizationIcon();
		CreatingNewOrganizationPage corp = new CreatingNewOrganizationPage(driver);
		String orgName = eUtil.getDataFromExcel("Organisations", 2, 1);
		String website = eUtil.getDataFromExcel("Organisations", 2, 2);
		String emp = eUtil.getDataFromExcel("Organisations", 2, 3);
		corp.createNewOrganization(orgName+rand, website, emp);
//		Thread.sleep(3000);
		System.out.println("Test 5 executed ");
	}
}
