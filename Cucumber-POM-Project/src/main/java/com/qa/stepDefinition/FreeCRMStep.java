package com.qa.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.CalendarPage;
import com.qa.pages.ClassicCRMPage;
import com.qa.pages.ContactPage;
import com.qa.pages.CreateNewEventPage;
import com.qa.pages.ForgotPasswordPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SignUpPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class FreeCRMStep extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ForgotPasswordPage forgotPasswordPage;
	ClassicCRMPage classicCRMPage;
	SignUpPage signUpPage;
	ContactPage contactPage;
	CalendarPage calendarPage;
	CreateNewEventPage createNewEventPage;
	
	
	public FreeCRMStep() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//****************************************Login Page *****************************************

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage = new LoginPage();
		String loginPageTitle  = loginPage.validateLoginPageTitle();
		Assert.assertEquals("CRM", loginPageTitle);
	    
	}

	@Then("^^user login into application$")
	public void user_login_into_application() throws Throwable {
		homePage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	    
	}
	    
	
	@Then("^user validate homepage title$")
	public void user_validate_homepage_title() throws Throwable {
		String homePageTitle = homePage.homePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals("CRM", homePageTitle);
	    
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.quit();
	    
	}
	
	
	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
		TestBase.initialization();
		String forgotPasswordTitle = driver.getTitle();
		Assert.assertEquals("CRM", forgotPasswordTitle);
	    
	}

	@Then("^user sees Forgot your password\\? link$")
	public void user_sees_Forgot_your_password_link() throws Throwable {
		loginPage = new LoginPage();
	    String forgotPasswordText = loginPage.ForgotPasswordPageLink();
	    Assert.assertEquals("Forgot your password?", forgotPasswordText);
	}

	@Then("^user sees Classic CRM link$")
	public void user_sees_Classic_CRM_link() throws Throwable {
		String CRMLinkText = loginPage.validateClassicCRMButtonLink();
		Assert.assertEquals("Classic CRM", CRMLinkText);
	    
	}

	@Then("^user sees Sign Up link$")
	public void user_sees_Sign_Up_link() throws Throwable {
		String signUpText = loginPage.validateSignUpOnLoginPageLink();
		Assert.assertEquals("Sign Up", signUpText);
	    
	}

	
	@Then("^user cliks on Forgot your password\\? link$")
	public void user_cliks_on_Forgot_your_password_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
	}

	@Then("^user reset password$")
	public void user_reset_password() throws Throwable {
		forgotPasswordPage = new ForgotPasswordPage();
		forgotPasswordPage.validatePasswordReset(prop.getProperty("resetemail"));
		
	    
	}
	
	
	@Then("^user sees the reset password success message$")
	public void user_sees_the_reset_password_success_message() throws Throwable {
		String forgotPasswordPageHeader = forgotPasswordPage.validateForgotPasswordHeader();
		Assert.assertEquals("Forgot my password", forgotPasswordPageHeader);
		
		String forgotPasswordPageText = forgotPasswordPage.validateForgotPasswordText();
		Assert.assertEquals("Thank you. If this email is registered you will receive an email with a password reset link.", forgotPasswordPageText);
	}


	//*****************************************ClassicCRM Page**************************************
	
	@Then("^user cliks on Classic CRM link$")
	public void user_cliks_on_Classic_CRM_link() throws Throwable {
		classicCRMPage = loginPage.validateClassicCRMLink();
	}

	@Then("^user navigates to Classic CRM page$")
	public void user_navigates_to_Classic_CRM_page() throws Throwable {
		String classicPageTitle = classicCRMPage.classicCRPTitle();
		Assert.assertEquals("CRMPRO Log In Screen", classicPageTitle);
		
		String privacyLinkText = classicCRMPage.validatePrivacyLink();
		Assert.assertEquals("Privacy Policy", privacyLinkText);
	    
	}

	//************************************************* SignUp page**********************************
	
	@Then("^user sees SignUp title$")
	public void user_sees_SignUp_title() throws Throwable {
		signUpPage = loginPage.validateSignUpLink();
		String signUpHeader = signUpPage.validateSignUpHeader();
		System.out.println(signUpHeader);
		Assert.assertEquals("Register", signUpHeader);
		
		String signUpMessage = signUpPage.validateSignUpMessage();
		Assert.assertEquals("Enter your email, phone and country below.", signUpMessage);
	}

	@Then("^user SignUp Free CRM application$")
	public void user_SignUp_Free_CRM_application() throws Throwable {
		signUpPage = new SignUpPage();
		
		//signUpPage= loginPage.validateSignUpLink();
		signUpPage.validateSignUpEmail(prop.getProperty("signupemail"));
		signUpPage.validateSignUpPhoneNumber(prop.getProperty("phoneNumber"));
		signUpPage.validateSignUpCheckBox();
		driver.findElement(By.xpath("//div[@class='g-recaptcha']")).click();
		
		Thread.sleep(5000);
	    
	}

	@Then("^user sees the SignUp success message$")
	public void user_sees_the_SignUp_success_message() throws Throwable {
	    
	}
	
	
	
	//************************************************Home page *********************************
	
	@Then("^user sees username label$")
	public void user_sees_username_label() throws Throwable {
		homePage = loginPage.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	    boolean flag = homePage.verifyUserLabel();
	    Assert.assertEquals(true, flag);
	}

	@Then("^user sees Home link$")
	public void user_sees_Home_link() throws Throwable {
	    boolean flag = homePage.validateHomeLink();
	    Assert.assertEquals(true, flag);
	    
	   String  homePageText =  homePage.verifyDealsSummaryText();
	   Assert.assertEquals("Deals Summary", homePageText);
	}
	
	@Then("^user verify Contacts activity stream list$")
	public void user_verify_Contacts_activity_stream_list() throws Throwable {
	   boolean flag = homePage.validateContactsActivityStreamSection();
	   Assert.assertEquals(true, flag);
	}


	@Then("^user sees Calendar link$")
	public void user_sees_Calendar_link() throws Throwable {
		calendarPage = new CalendarPage();
		calendarPage = homePage.verifyCalendarLink();
	}

	@Then("^user sees Contacts link$")
	public void user_sees_Contacts_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user sees Companies link$")
	public void user_sees_Companies_link() throws Throwable {
	    // Write code here that turns the phrase above into c
	}

	@Then("^user sees Deals link$")
	public void user_sees_Deals_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^user sees Tasks link$")
	public void user_sees_Tasks_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 	}

	@Then("^user sees Cases link$")
	public void user_sees_Cases_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^user sees Calls link$")
	public void user_sees_Calls_link() throws Throwable {
	 
	}

	@Then("^user sees Documents link$")
	public void user_sees_Documents_link() throws Throwable {
	}

	@Then("^user sees Email link$")
	public void user_sees_Email_link() throws Throwable {
	}

	@Then("^user sees Campaigns link$")
	public void user_sees_Campaigns_link() throws Throwable {
	}


// *****************************************Create event page ****************************
	
	@Given("^user on calendar page$")
	public void user_on_calendar_page() throws Throwable {
		TestBase.initialization();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
		calendarPage = new CalendarPage();
		createNewEventPage  = new CreateNewEventPage();
		
		homePage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		calendarPage = homePage.verifyCalendarLink();
		createNewEventPage = calendarPage.validateNewButton();
		//Thread.sleep(5000);
	}

	@Then("^user veeify the create event page$")
	public void user_veeify_the_create_event_page() throws Throwable {
		String createEventText = driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
		//System.out.println(createEventText);
		Assert.assertEquals(createEventText, "Create new Event");
	    
	}

	@Then("^user fill the event form$")
	public void user_fill_the_event_form() throws Throwable {
		createNewEventPage.createNewEventTitle();
		createNewEventPage.newEventTitle(prop.getProperty("eventtile"));
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@name='category']")).click();
		
		List<WebElement> categoryList = driver.findElements(By.xpath("//div[@name='category']//div//div"));
		System.out.println(categoryList.size());
		categoryList.get(1).click();
		Thread.sleep(5000);
		
	    
	}

	@Then("^user save the event form$")
	public void user_save_the_event_form() throws Throwable {
		createNewEventPage.validateSaveNewEvent();
	    
	}





}
