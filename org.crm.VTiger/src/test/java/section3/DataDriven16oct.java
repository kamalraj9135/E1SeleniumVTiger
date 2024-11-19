package section3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class DataDriven16oct {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		PropertiesUtility p = new PropertiesUtility();
		String URL = p.getDataFromPropertiesFile("url");
		String UN = p.getDataFromPropertiesFile("username");
		String PASS = p.getDataFromPropertiesFile("password");
 		System.out.println(URL);
		System.out.println("Username is : " + UN);
		System.out.println("Password is : " + PASS);
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN, Keys.TAB, PASS, Keys.TAB, Keys.ENTER);

	}

}
