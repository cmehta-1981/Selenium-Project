package com.CRM.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.LandingPage;
import com.CRM.qa.pages.LoginPage;

public class LandingPageTest extends TestBase {
	LandingPage landingPage;
	LoginPage loginPage;
	

	public LandingPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		landingPage = new LandingPage();
		
	}
	
	
	@Test(priority = 1)
	public void landingPageTitleTest() {
		String title= landingPage.validateCRMLandingPageTitle();
		Assert.assertEquals(title, "Free CRM software for any Business");		
	}
	
	@Test(priority = 2)
	public void landingPageLogoTest() {
		boolean logo = landingPage.validateCRMLogo();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority = 3)
	public void loginButtonTest() throws Exception {
		loginPage = landingPage.login();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
