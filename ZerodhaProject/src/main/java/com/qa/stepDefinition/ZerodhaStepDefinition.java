package com.qa.stepDefinition;

import org.openqa.selenium.By;

import com.qa.pages.ZerodhaLoginPage;
import com.qa.util.ZerodhaTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ZerodhaStepDefinition extends ZerodhaTestBase{
	
	ZerodhaLoginPage zerodhaLoginPage;

	public ZerodhaStepDefinition() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Given("^user opens zerodha browser$")
	public void user_opens_zerodha_browser() throws Throwable {
		initialization();
	    
	}

	@Then("^user is on zerodha login page$")
	public void user_is_on_zerodha_login_page() throws Throwable {
		zerodhaLoginPage = new ZerodhaLoginPage();
		Assert.assertEquals("Login to Kite", zerodhaLoginPage.ValidateLoginPageHeader());
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", zerodhaLoginPage.ValidateZerodhaTitile());
		
	    
	}

	@Then("^user login into zerodha application$")
	public void user_login_into_zerodha_application() throws Throwable {
		
				
	    try {
	    	zerodhaLoginPage.ValidateLogin(prop.getProperty("username"), prop.getProperty("password"));
	    	System.out.println("Something went wrong."+driver.findElement(By.xpath("//p[@class='error text-center']//span[@class='icon icon-alert-triangle']")).getText());
	    }catch(Exception e){
	    	//System.out.println("Something went wrong."+driver.findElement(By.xpath("//p[@class='error text-center']")).getText());
	    }
	    
	}

	@Then("^user validate zerodha homepage title$")
	public void user_validate_zerodha_homepage_title() throws Throwable {
	    
	}

	@Then("^user close the zerodha browser$")
	public void user_close_the_zerodha_browser() throws Throwable {
	   driver.quit();
	}


	

}
