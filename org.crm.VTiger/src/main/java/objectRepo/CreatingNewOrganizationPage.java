package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	@FindBy(xpath = "//input[@id='employees']")
	private WebElement employees;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneNo;
	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherPhone;
	@FindBy(xpath = "//input[@name='email1']")
	private WebElement email;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddress;
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewOrganizationPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getOtherPhone() {
		return otherPhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new Organization based on Organization name, Website name and Employee name
	 * @param OrgName
	 * @param WebName
	 * @param EmpName
	 */
	public void createNewOrganization(String OrgName, String WebName, String EmpName) 
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(WebName);
		getEmployees().sendKeys(EmpName);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new Organization based on these
	 * @param OrgName
	 * @param WebName
	 * @param EmpName
	 * @param phNo
	 * @param othPh
	 * @param email
	 */
	public void createNewOrganization(String OrgName, String WebName, String EmpName, String phNo, String othPh, String email)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(WebName);
		getEmployees().sendKeys(EmpName);
		getPhoneNo().sendKeys(phNo);
		getOtherPhone().sendKeys(othPh);
		getEmail().sendKeys(email);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new Organization based on these
	 * @param OrgName
	 * @param WebName
	 * @param billAddress
	 * @param billCity
	 * @param billState
	 */
	public void createNewOrganization(String OrgName, String WebName, String billAddress, String billCity, String billState)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(WebName);
		getBillingAddress().sendKeys(billAddress);
		getBillingCity().sendKeys(billCity);
		getBillingState().sendKeys(billState);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new Organization based on these
	 * @param OrgName
	 * @param WebName
	 * @param EmpName
	 * @param phNo
	 * @param othPh
	 * @param email
	 * @param billAddress
	 * @param billCity
	 * @param billState
	 */
	public void createNewOrganization(String OrgName, String WebName, String EmpName, String phNo, 
			String othPh, String email, String billAddress, String billCity, String billState)
	{
		getOrgName().sendKeys(OrgName);
		getWebsite().sendKeys(WebName);
		getEmployees().sendKeys(EmpName);
		getPhoneNo().sendKeys(phNo);
		getOtherPhone().sendKeys(othPh);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billAddress);
		getBillingCity().sendKeys(billCity);
		getBillingState().sendKeys(billState);
		getSaveButton().click();
	}
}
