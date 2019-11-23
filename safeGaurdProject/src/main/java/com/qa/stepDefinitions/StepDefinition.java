package com.qa.stepDefinitions;

import org.openqa.selenium.By;

import com.ga.util.TestBase;
import com.ga.util.TestUtil;
import com.qa.pages.AboutUsPage;
import com.qa.pages.ContactPage;
import com.qa.pages.GalleryPage;
import com.qa.pages.HomePage;
import com.qa.pages.HowItsWorksPage;
import com.qa.pages.MediaPage;
import com.qa.pages.SubscriptionPlanPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepDefinition extends TestBase{
	HomePage homePage;
	AboutUsPage aboutUsPage;
	HowItsWorksPage howItsWorksPage;
	GalleryPage galleryPage;
	MediaPage mediaPage;
	SubscriptionPlanPage subscriptionPlanPage;
	ContactPage contactPage;
	
	
	public StepDefinition() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user opens InvestmentSafeGaurd browser$")
	public void user_opens_InvestmentSafeGaurd_browser() throws Throwable {
		TestBase.initialization();
	    	}

	@SuppressWarnings("deprecation")
	@Then("^user validate InvestmentSafeGaurd home page title$")
	public void user_validate_InvestmentSafeGaurd_home_page_title() throws Throwable {
		homePage = new HomePage();
		String homepageTitle = homePage.validateInvestmentSafeGaurdTitle();
		Thread.sleep(5000);
		System.out.println(homepageTitle);
		Assert.assertEquals("Investment Safeguard App | Investment Tracker App", homepageTitle);
		
	    
	}
	
	@Then("^user validate InvestmentSafeGaurd logo on home page$")
	public void user_validate_InvestmentSafeGaurd_logo_on_home_page() throws Throwable {
		homePage = new HomePage();
		boolean logoImage = homePage.validateInvestmentSafeGaurdLogo();
		Assert.assertEquals(true, logoImage);
		if (logoImage = true) {
			TestUtil.readLogoImageText();
		}else {
			System.out.println("Company image logo is not dispalyed");
		}
		
	    
	}


	@Then("^user validate InvestmentSafeGaurd imagess on home page$")
	public void user_validate_InvestmentSafeGaurd_imagess_on_home_page() throws Throwable {
		homePage = new HomePage();
		TestUtil.brokenLink();
		
	}

	@Then("^user validate InvestmentSafeGaurd  links on home page$")
	public void user_validate_InvestmentSafeGaurd_links_on_home_page() throws Throwable {
	    
	}
	
	@Then("^user validate InvestmentSafeGaurd all rights copy on home page$")
	public void user_validate_InvestmentSafeGaurd_all_rights_copy_on_home_page() throws Throwable {
	    
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.quit();
	   
	}
	
	
	@Then("^user validate InvestmentSafeGaurd aboutus page$")
	public void user_validate_InvestmentSafeGaurd_aboutus_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateAboutUsPage();
		aboutUsPage = new AboutUsPage();
		String aboutUsText = aboutUsPage.validateAboutUsText();
		System.out.println(aboutUsText);
		Assert.assertEquals("ABOUT US", aboutUsText);
		
	}
	
	
	
	@Then("^user validate InvestmentSafeGaurd how its works page$")
	public void user_validate_InvestmentSafeGaurd_how_its_works_page() throws Throwable {
		 //TestUtil.initialization();
		 homePage = new HomePage();
		 homePage.validateHowItWorks();
		 howItsWorksPage = new HowItsWorksPage();
		 String howItWorksText = howItsWorksPage.validateHowItWorksText();
		 System.out.println(howItWorksText);
		 Assert.assertEquals("HOW DOES OUR APP WORK?", howItWorksText);
		 
		 
	    
	}

	@Then("^user validate registration image test$")
	public void user_validate_registration_image_test() throws Throwable {
		TestUtil.readHowItWorksIamgeText();
	    
	}

	@Then("^user validate relax image test$")
	public void user_validate_relax_image_test() throws Throwable {
	   
	    
	}

	@Then("^user validate manage family image test$")
	public void user_validate_manage_family_image_test() throws Throwable {
	   
	}

	@Then("^user validate family member login image test$")
	public void user_validate_family_member_login_image_test() throws Throwable {
	   
	}

	@Then("^user validate investment details image test$")
	public void user_validate_investment_details_image_test() throws Throwable {
	    
	}

	@Then("^user validate reminders image test$")
	public void user_validate_reminders_image_test() throws Throwable {
	    
	}

	
	@Then("^user validate InvestmentSafeGaurd gallery page$")
	public void user_validate_InvestmentSafeGaurd_gallery_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateGalleryPage();
		galleryPage = new GalleryPage();
		
		String galleryHeader = galleryPage.validateGalleryHeader();
		System.out.println(galleryHeader);
		Assert.assertEquals("GALLERY", galleryHeader);
		
		boolean galleryButton = galleryPage.validateGalleryButton();
		Assert.assertEquals(true, galleryButton);
		
		boolean videoButton = galleryPage.validateVideoButton();
		Assert.assertEquals(true, videoButton);
	    
	}




	@Then("^user validate InvestmentSafeGaurd media page$")
	public void user_validate_InvestmentSafeGaurd_media_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateMediaPage();
		
		mediaPage = new MediaPage();
		
		String mediaImage = mediaPage.validateMediaHeader();
		Assert.assertEquals("MEDIA", mediaImage);
		
		String latestRelease = mediaPage.validateLatestRelease();
		Assert.assertEquals("Latest Release", latestRelease);
		
	    
	}
	
	
	@Then("^user validate InvestmentSafeGaurd subscription plan page$")
	public void user_validate_InvestmentSafeGaurd_subscription_plan_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateSubscriptionPage();
		subscriptionPlanPage = new SubscriptionPlanPage();
		String subscriptionPlanPageText = subscriptionPlanPage.ValidateSubscriptionPlan();
		Assert.assertEquals("SUBSCRIPTION PLANS", subscriptionPlanPageText);
	}
	
	@Then("^user validate free section$")
	public void user_validate_free_section() throws Throwable {
		homePage = new HomePage();
		homePage.validateSubscriptionPage();
		subscriptionPlanPage = new SubscriptionPlanPage();
		subscriptionPlanPage.ValidateFreeContents();
	}

	@Then("^user validate premium section$")
	public void user_validate_premium_section() throws Throwable {
		subscriptionPlanPage.validatePremiumContents();
	    
	}

	@Then("^user validate Download the app section$")
	public void user_validate_Download_the_app_section() throws Throwable {
		
		Assert.assertEquals(true, subscriptionPlanPage.ValidateFreeDownlaodBtn());
		Assert.assertEquals(true, subscriptionPlanPage.ValidateDownloadTheAppBtn());
		subscriptionPlanPage.ValidateAppStorePage();
		Assert.assertEquals("ISF Technologies Pvt. Ltd.", driver.findElement(By.linkText("ISF Technologies Pvt. Ltd.")).getText());
		subscriptionPlanPage.ValidateGoogleStorePage();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Investment Safeguard", driver.getTitle());
		
	    
	}


	
	
	@Then("^user validate InvestmentSafeGaurd contact page$")
	public void user_validate_InvestmentSafeGaurd_contact_page() throws Throwable {
		homePage = new HomePage();
		homePage.validateContactPage();
		contactPage = new ContactPage();
		Assert.assertEquals("CONTACT US", contactPage.ValidateContactUsHeader());	    
	}

	@Then("^user validate InvestmentSafeGaurd address on contact page$")
	public void user_validate_InvestmentSafeGaurd_address_on_contact_page() throws Throwable {
		Assert.assertEquals(true, contactPage.ValidateAddressIcon());
		Assert.assertEquals("Address", contactPage.ValidateAddressLabel());
		//Assert.assertEquals("S N 39/15,Sneh Building,Gujarnagar,Thergaon.Pune-411033", contactPage.ValidateAddressDetails());
	    
	}

	@Then("^user validate InvestmentSafeGaurd give us a call on contact page$")
	public void user_validate_InvestmentSafeGaurd_give_us_a_call_on_contact_page() throws Throwable {
		Assert.assertEquals(true, contactPage.ValidateCallUsIcon());
		Assert.assertEquals("Give us a call", contactPage.ValidateCallUsLabel());
		Assert.assertEquals("+91-7219137025", contactPage.ValidateCallUsNumber());
	}

	@Then("^user validate InvestmentSafeGaurd email us  on contact page$")
	public void user_validate_InvestmentSafeGaurd_email_us_on_contact_page() throws Throwable {
		Assert.assertEquals(true, contactPage.ValidateEmailUsIcon());
		Assert.assertEquals("Email Us", contactPage.ValidateEmailUsLabel());
		Assert.assertEquals("info@investmentsafeguard.com", contactPage.ValidateEmailAddress());
	    
	}

	@Then("^user validate InvestmentSafeGaurd contact us on contact page$")
	public void user_validate_InvestmentSafeGaurd_contact_us_on_contact_page() throws Throwable {
		contactPage.ValidateContactDetails(prop.getProperty("name"), prop.getProperty("mobile"), prop.getProperty("email"), prop.getProperty("city"), prop.getProperty("message"));
		contactPage.ValidateContactCaptcha();
		contactPage.ValidateContactSubmitButton();
	    
	}


	
	
	

}
