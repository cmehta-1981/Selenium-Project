package com.CRM.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.ContactPage;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LandingPage;
import com.CRM.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;

	public HomePageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		initialization();		
		landingPage = new LandingPage();		
		loginPage = landingPage.login();
		loginPage = new LoginPage();
		homePage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		contactPage = new ContactPage();
	}
	
	
	@Test(priority = 1)
	public void verifyUserNameLabelTest() {
		Assert.assertTrue(homePage.verifyUserLabel());
	}
	
	@Test(priority = 2)
	public void verifyDealsSummaryTextTest() {
		String dealsText = homePage.verifyDealsSummaryText();
		Assert.assertEquals(dealsText, "Deals Summary" , "Deals text are incorrect");
	}
	
	@Test(priority = 3)
	public void verifyContactsLinkTest() throws Exception {
		contactPage = homePage.verifyContactsLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
