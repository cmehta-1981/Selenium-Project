package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ForgotPasswordPage extends TestBase {

	
	
	
	//Page factory or OR
	
	@FindBy(xpath = "//h2[@class='ui blue header']")
	WebElement forgotPasswordHeader;
	
	@FindBy(xpath = "//div[contains(text(),'Thank you. If this email is registered you will re')]")
	WebElement forgotPasswordText;
	
	
	@FindBy(name = "email")
	WebElement forgotPasswordEmail;
	
	@FindBy(xpath = "//button[@name='action']")
	WebElement resetPassword;
	
	
	//Initialize the page objects
	public ForgotPasswordPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	
	
	
	
	public String validateForgotPasswordHeader() {
		return forgotPasswordHeader.getText();
	}
	
	
	public String validateForgotPasswordText() {
		return forgotPasswordText.getText();
	}
	
	
	public void validatePasswordReset(String resetEmail) {
		forgotPasswordEmail.sendKeys(resetEmail);
		resetPassword.click();
		
	}

}
