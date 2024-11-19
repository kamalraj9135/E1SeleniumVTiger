package section3;


import java.io.FileInputStream;
import java.util.Properties;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Selenium\\Section 3\\TestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("Type");
		System.out.println(value);

	}

}
