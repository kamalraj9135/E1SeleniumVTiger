package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrganizationIcon;
	
	public OrganisationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewOrganization() {
		return createNewOrganizationIcon;
	}
	
	/**
	 * This is a business library to click on Create New Organization Icon in Organization Page
	 */
	public void clickOncreateNewOrganizationIcon()
	{
		getCreateNewOrganization().click();
	}
}
