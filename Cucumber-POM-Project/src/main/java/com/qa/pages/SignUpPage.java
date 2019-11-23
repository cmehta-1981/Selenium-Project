package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class SignUpPage extends TestBase{

	public SignUpPage() throws Exception {
		super();
		
		
		PageFactory.initElements(driver, this);
	}

	//Page factory or OR
	
	@FindBy (xpath = "//h2[@class='ui blue header']")
	WebElement signUpHeader;
	
	@FindBy (xpath = "//p[contains(text(),'Enter your email, phone and country below.')]")
	WebElement signUpMessage;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement signUpEmail;
	
	@FindBy(xpath  = "//div[@class='text'][contains(text(),'United Kingdom (+44)')]")
	WebElement signUpCountryCode;
	
	@FindBy(xpath = "//input[@id='phone_number']")
	WebElement signUpPhoneNumber;
	
	@FindBy(xpath = "//input[@id='terms']")
	WebElement signUpCheckBox;
	
	@FindBy(xpath = "//button[@name='action']")
	WebElement signUpButton;
	
	//Actions
	
	public String  validateSignUpHeader() {
		return signUpHeader.getText();
		
	}
	
	public String validateSignUpMessage() {
		return signUpMessage.getText();
	}
	
	public String validateCountryCode() {
		return signUpCountryCode.getText();
	}
	
	public void validateSignUpPhoneNumber(String phoneNumber) {
		signUpPhoneNumber.sendKeys(phoneNumber);
		
	}
	
	public void validateSignUpEmail(String signupemail) {
		signUpEmail.sendKeys(signupemail);
	}
	
	
	public void validateSignUpCheckBox() {
		signUpCheckBox.click();
		
	}
	
	

}
