package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganisationsPage;

public class TC_007 extends BaseClass
{
	@Test(groups = "smoke")
	public void ORG_03() throws Exception
	{
		int rand = jUtil.getRandomNumber(1000);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganisationsPage orp = new OrganisationsPage(driver);
		orp.clickOncreateNewOrganizationIcon();
		CreatingNewOrganizationPage corp = new CreatingNewOrganizationPage(driver);
		String orgName = eUtil.getDataFromExcel("Organisations", 8, 1);
		String website = eUtil.getDataFromExcel("Organisations", 8, 2);
		String billAdd = eUtil.getDataFromExcel("Organisations", 8, 3);
		String billCity = eUtil.getDataFromExcel("Organisations", 8, 4);
		String billState = eUtil.getDataFromExcel("Organisations", 8, 5);
		corp.createNewOrganization(orgName+rand, website, billAdd, billCity, billState);
		Thread.sleep(3000);
		System.out.println("Test 7 executed");
	}
}
