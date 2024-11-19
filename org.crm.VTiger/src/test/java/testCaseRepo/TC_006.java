package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganisationsPage;

public class TC_006 extends BaseClass
{
	@Test(groups = "smoke")
	public void ORG_02() throws Exception 
	{
		int rand = jUtil.getRandomNumber(1000);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganisationsPage orp = new OrganisationsPage(driver);
		orp.clickOncreateNewOrganizationIcon();
		CreatingNewOrganizationPage corp = new CreatingNewOrganizationPage(driver);
		String orgName = eUtil.getDataFromExcel("Organisations", 5, 1);
		String website = eUtil.getDataFromExcel("Organisations", 5, 2);
		String employee = eUtil.getDataFromExcel("Organisations", 5, 3);
		String phNo = eUtil.getDataFromExcel("Organisations", 5, 4);
		String othPh = eUtil.getDataFromExcel("Organisations", 5, 5);
		String email = eUtil.getDataFromExcel("Organisations", 5, 6);
		corp.createNewOrganization(orgName+rand, website, employee, phNo, othPh, email);
		Thread.sleep(3000);
		System.out.println("Test 6 executed ");
	}
}
