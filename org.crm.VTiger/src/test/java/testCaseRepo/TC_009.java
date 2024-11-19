package testCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_009 extends BaseClass 
{
	@Test
	public void CON_01() throws Exception 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnNewContactIcon();
		Assert.fail();
		CreatingNewContactPage cnp = new CreatingNewContactPage(driver);
		String fName = eUtil.getDataFromExcel("Contacts", 2, 1);
		String lName = eUtil.getDataFromExcel("Contacts", 2, 2);
		String title = eUtil.getDataFromExcel("Contacts", 2, 3);
		cnp.createNewContact(fName, lName, title);
		//Thread.sleep(3000);
		System.out.println("Test 9 executed");
	}
}
