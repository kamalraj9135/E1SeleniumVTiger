package genericUtility;




import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	
	/**
	 * This is a generic method to fetch the data from properties file
	 * @param key
	 * @return
	 * @throws Exception
	 */
	
	public String getDataFromPropertiesFile(String key) throws Exception
	{
		FileInputStream f = new FileInputStream(IPathConstant.propertiesPath);
		Properties p = new Properties();
		p.load(f);
		String value = p.getProperty(key);
		return value;
	}
}
