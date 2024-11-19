package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganisationsPage;

public class TC_008 extends BaseClass 
{
	@Test
	public void ORG_04() throws Exception
	{
		int rand = jUtil.getRandomNumber(1000);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganisationsPage orp = new OrganisationsPage(driver);
		orp.clickOncreateNewOrganizationIcon();
		CreatingNewOrganizationPage corp = new CreatingNewOrganizationPage(driver);
		String orgName = eUtil.getDataFromExcel("Organisations", 11, 1);
		String website = eUtil.getDataFromExcel("Organisations", 11, 2);
		String emp = eUtil.getDataFromExcel("Organisations", 11, 3);
		String phNo = eUtil.getDataFromExcel("Organisations", 11, 4);
		String othPh = eUtil.getDataFromExcel("Organisations", 11, 5);
		String email = eUtil.getDataFromExcel("Organisations", 11, 6);
		String billAdd = eUtil.getDataFromExcel("Organisations", 11, 7);
		String billCity = eUtil.getDataFromExcel("Organisations", 11, 8);
		String billState = eUtil.getDataFromExcel("Organisations", 11, 9);
		corp.createNewOrganization(orgName+rand, website, emp, phNo, othPh, email, billAdd, billCity, billState);
		Thread.sleep(3000);
		System.out.println("Test 8 executed ");
		
	}
}
