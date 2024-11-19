package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='designation']")
	private WebElement title;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement street;
	@FindBy(xpath = "//input[@id='pobox']")
	private WebElement poBox;
	@FindBy(xpath = "//input[@name='code']")
	private WebElement postalCode;
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;
	@FindBy(xpath = "//input[@name='country']")
	private WebElement country;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new lead based on first name, last name and company
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void createNewLead(String fName, String lName, String company)
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompany().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead based on these
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param email
	 * @param nOfEmp
	 * @param street
	 * @param poBox
	 * @param pCode
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createNewLead(String fName, String lName, String company, String title, String mobile, 
			String email, String nOfEmp, String street, String poBox, String pCode, String city, 
			String country, String state) 
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(nOfEmp);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(pCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead based on these
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param email
	 * @param nOfEmp
	 */
	public void createNewLead(String fName, String lName, String company, String title, String mobile, 
			String email, String nOfEmp) 
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(nOfEmp);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead based on these
	 * @param fName
	 * @param lName
	 * @param company
	 * @param street
	 * @param poBox
	 * @param pCode
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createNewLead(String fName, String lName, String company, String street, 
			String poBox, String pCode, String city, String country, String state) 
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getCompany().sendKeys(company);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(pCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
	}
}
