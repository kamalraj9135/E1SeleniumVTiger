package sample;

import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("User Created");
	}
	
//	@Ignore
	@Test(priority = -2, dependsOnMethods = {"createUser", "deleteUser"})
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	
//	@Ignore
	@Test(priority = 0)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
	
	@Test
	public void addUser() 
	{
		System.out.println("User Added");
	}
}
