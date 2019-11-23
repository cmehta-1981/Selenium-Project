package com.CRM.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LandingPage;
import com.CRM.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage ;
	HomePage homePage;
	

	public LoginPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		initialization();
		landingPage = new LandingPage();
		loginPage = landingPage.login();
	}
	
	
	@Test(priority = 1)
	public void validateLoginPageTitle() {
		String loginPageTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "CRM");
	}
	
	@Test(priority = 2)
	public void validateLoginCredential() throws Exception {
		homePage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
