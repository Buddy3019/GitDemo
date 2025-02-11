package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@BeforeTest

	public void lastexecution()
	{
		
		System.out.println("I will execute firstone");
		
	}
	
	
	@Test
	public void WebloginHomeloan()
	{
   // Selenium
		System.out.println("webloginhome");
		
}
	@Test
	
	public void MobileLoginhomeloan()
	{
		
		//Appium
		
		System.out.println("MobileLoginhome");
	}
	
	@AfterSuite

	public void afterexecution()
	{
		
		System.out.println("I am no 1 from last");
	}
	
	
	@Test
	
	public void LoginAPIhomeloan()
	
	{
		
		//Rest API automation
		
		System.out.println("APILoginhome");
	}
	
}