package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement organisationsMenu;
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutOption;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrganisationsMenu() {
		return organisationsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}

	/**
	 * This is a business library to click on leads menu in the application
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on organizations menu in the application
	 */
	public void clickOnOrganisationsMenu()
	{
		getOrganisationsMenu().click();
	}
	
	/**
	 * This is a business library to click on Contacts menu in the application
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform Sign Out operation
	 * @param driver
	 */
	
	public void signOutOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getSignOutOption().click();
	}
}
