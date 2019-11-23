/**
 * 
 */
package com.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

/**
 * @author cmehta
 *
 */
public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() throws InterruptedException {
		String loginPageTitle =page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Loginpage tile is :- " +loginPageTitle);
		Assert.assertEquals(loginPageTitle, "Checking browser");
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 2)
	public void verifyLoginPageHeader() throws Exception {
		Thread.sleep(10000);
		String loginPageHeader = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("Loginpage tile is :- " +loginPageHeader);
		
		Assert.assertEquals(loginPageHeader, "Sign up");
		
		Thread.sleep(10000);
	}
	
	@Test(priority = 3)
	public void doLoginPageTest() throws Exception {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("mobile.testing.c@gmail.com", "Mobile@123");
		String homePageHeader = homePage.getHomePageHeader();
		System.out.println("Home page heaser is :- " +homePageHeader);
		Assert.assertEquals(homePageHeader, "Take a closer look at how HubSpot works.");
		Thread.sleep(10000);
	}

}
