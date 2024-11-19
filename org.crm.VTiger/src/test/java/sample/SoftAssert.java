package sample;

import org.testng.annotations.Test;

public class SoftAssert 
{
	
	@Test
	public void strictComparisonSoftAssert()
	{
		String expectedValue = "Dragon";
		String actualValue = "dragon";
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		System.out.println("Strict comparison soft assertion completed");
		s.assertAll();
	}
	
	@Test
	private void containsComparisonSoftAssert() 
	{
		String expectedValue = "Blank";
		String actualValue = "Blanket";
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertFalse(actualValue.contains(expectedValue));
		System.out.println("Contains comparison soft assertion completed");
		s.assertAll();
	}
}
