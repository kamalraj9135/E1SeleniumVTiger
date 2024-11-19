package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{

	@Test
	public void strictComparisonHardAssert()
	{
		String expectedValue = "Ball";
		String actualValue = "Ball";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Assertion completed");
	}
	
	@Test
	public void containsComparisonHardAssert() 
	{
		String expectedValue = "top";
		String actualValue = "Laptop";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains Comparison Completed");
	}
}
