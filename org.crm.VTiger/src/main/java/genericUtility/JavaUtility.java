package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is an utility class to work with java related operations
 * @author Kamal Kumar
 * @version 24.20.10
 */
public class JavaUtility {
	
	/**
	 * This is a generic method to fetch calendar details in the provided pattern
	 * @param pattern
	 * @return
	 */

	public String getCalendarDetails(String pattern) 
	{
		Calendar cal = Calendar.getInstance();
		Date d  = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	
	/**
	 * This is a generic method to generate random number
	 * @param bound
	 * @return
	 */
	public int getRandomNumber(int bound)
	{
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
	}
}
