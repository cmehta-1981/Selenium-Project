package launchBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launchBrowser {
	
	
	@BeforeMethod	
	public void beforeMethod() {
		
		System.out.println("Execute before method");
	}
	
	
	@Test(priority = 2)	
	public void testMethod() {
		
		System.out.println("Execute test method");
	}
	
	@Test(priority = 1)	
	public void testMethod1() {
		
		System.out.println("Execute test1 method");
	}
	
	@AfterMethod	
	public void afterMethod() {
		
		System.out.println("Execute after method");
	}
	

}
