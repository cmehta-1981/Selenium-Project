package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	//page factory or OR
	
	
	@FindBy(xpath = "//div[@class='rd-navbar-panel']//span[contains(text(),'free')]")
	WebElement crmLogo;
	
	@FindBy(xpath = "//h2[@class='txt-white']")
	WebElement signUpBtn;

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement landingloginBtn;
	
	//initializing the page objects
	public LandingPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public String validateCRMLandingPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {		
		return crmLogo.isDisplayed();
	}
	
	
	public LoginPage login() throws Exception {
		landingloginBtn.click();
		return new LoginPage();
	}
	

}
