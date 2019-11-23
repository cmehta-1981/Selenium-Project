package com.qa.stepDefinition;

import com.qa.pages.HotelsModulePage;
import com.qa.pages.MainFeaturePage;
import com.qa.pages.PHPLoginPage;
import com.qa.util.Base;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PHPStepDefinition extends Base{
	
	PHPLoginPage pHPLoginPage;
	MainFeaturePage mainFeaturePage;
	HotelsModulePage hotelsModulePage;
	
	//*****************Run this method before every test scenario*********************************//
	
	@Before()
	//@Given("^user is launch the PHP browser$")
	public void SetUp() throws Throwable {
		initialization();	    
	}
	
	//******************Run this method after every test scenario**********************************//
	
	@After()
	//@Then("^user close the browser$") 
	public void TearDown() throws Throwable { 
		driver.quit(); 
	  }
	
	//**********************************************************************************************//
	
//***********************************Verify the all buttons on landing page*****************************//
	@Given("^user is on PHP login page$")
	public void user_is_on_PHP_login_page() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidatePHPLoginPageTitle();
		Assert.assertEquals(pHPLoginPage.ValidatePHPLoginPageTitle(), "Demo Script Test drive - PHPTRAVELS");     
	}
	
	@Then("^user verify the login button$")
	public void user_verify_the_login_button() throws Throwable {
		pHPLoginPage.ValidateLoginButtonEnable();
		Assert.assertEquals(true, pHPLoginPage.ValidateLoginButtonEnable());	    
	}
	 
	@Then("^user verify the demo option$")
	public void user_verify_the_demo_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		Assert.assertEquals(true, pHPLoginPage.ValidateDemoOption());	    
	}

	@Then("^user verify the pricing option$")
	public void user_verify_the_pricing_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
	    Assert.assertEquals(true, pHPLoginPage.ValidatePricingOption());	    
	}
	
	@Then("^user verify the features option$")
	public void user_verify_the_features_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidateFeaturesOption();
	}

	@Then("^user verify the product option$")
	public void user_verify_the_product_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidateProductOption();	    
	}

	@Then("^user verify the hosting option$")
	public void user_verify_the_hosting_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidateHostingOption();	    
	}

	@Then("^user verify the services option$")
	public void user_verify_the_services_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidateServicesOption();	    
	}

	@Then("^user verify the company option$")
	public void user_verify_the_company_option() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		pHPLoginPage.ValidateCompanyOption();    
	}

	//***********************************Verify the Main Feature page*****************************//
	
	@Given("^user on main feature page$")
	public void user_on_main_feature_page() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		mainFeaturePage = new MainFeaturePage();
		mainFeaturePage = pHPLoginPage.ValidateFeaturesOption();
	}

	@Then("^user sees main features header$")
	public void user_sees_main_features_header() throws Throwable {
		System.out.println(mainFeaturePage.ValidateMainFeatureHeader());
		Assert.assertEquals("MAIN FEATURES", mainFeaturePage.ValidateMainFeatureHeader());
		
	    
	}

	@Then("^user sees the vacation packages image$")
	public void user_sees_the_vacation_packages_image() throws Throwable {
		mainFeaturePage.ValidateVacationPackageImageText();
	}

	@Then("^user sees the demo link$")
	public void user_sees_the_demo_link() throws Throwable {
	    
	}

	@Then("^user sees application features options$")
	public void user_sees_application_features_options() throws Throwable {
	    
	}

	@Then("^user sees submit requirement link$")
	public void user_sees_submit_requirement_link() throws Throwable {
	    
	}

	@Then("^user sees subscribe button$")
	public void user_sees_subscribe_button() throws Throwable {
	    
	}
	
	//***********************************Verify the Hotel Module page*****************************//
	
	@Given("^user on hotels module page$")
	public void user_on_hotels_module_page() throws Throwable {
		pHPLoginPage = new PHPLoginPage();
		hotelsModulePage = new HotelsModulePage();
		hotelsModulePage = pHPLoginPage.ValidateWebAppFeaturesOption();
		
	}

	@Then("^user sees hotels module header$")
	public void user_sees_hotels_module_header() throws Throwable {
	   
	}

	@Then("^user sees the CALENDAR AVAILABILITY$")
	public void user_sees_the_CALENDAR_AVAILABILITY() throws Throwable {
	    
	}

	@Then("^user sees the HOTEL FACILITIES$")
	public void user_sees_the_HOTEL_FACILITIES() throws Throwable {
	    
	}


	
}
