package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Create page factory or Object Repository
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Classic CRM')]")
	WebElement classicCRMBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPWDBtn;
	
	@FindBy(name = "email")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	

	//initializing the page objects
	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public SignUpPage validateSignUpOnLoginPage() {
		signUpBtn.click();
		return new SignUpPage();
	}
	
	public ClassicCRMPage validateClassicCRMButton() throws Exception {
		classicCRMBtn.click();
		return new ClassicCRMPage();
	}
	
	public ForgotPasswordPage validateForgotPassword() throws Exception {
		forgotPWDBtn.click();
		return new ForgotPasswordPage();
		
	}
	
	public HomePage validateLogin(String un , String pwd) throws Exception {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
	}
	

}
