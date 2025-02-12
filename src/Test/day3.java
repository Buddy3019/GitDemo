package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebloginCarloan()
	{
   // Selenium
		System.out.println("weblogincar");
		System.out.println("weblogincar2");
		System.out.println("weblogincar3");
}     
	@Test
	
	public void MobileLoginCarloan()
	{
		
		//Appium
		
		System.out.println("MobileLogincar");
	}
	
	
	@BeforeSuite

	public void Beforeexecution()
	{
		
		System.out.println("I am no 1");
	}
	
	@Test
	
	public void LoginAPIcarloan()
	
	{
		
		//Rest API automation
		
		System.out.println("APILogincar");
	}
	
}