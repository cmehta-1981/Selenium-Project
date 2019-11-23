package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ClassicCRMPage extends TestBase {
	
	
	
	
	//Page factory or OR
	@FindBy (linkText = "Privacy Policy")
	WebElement privacyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
	WebElement forgotPasswordLink;
	
	
	//Object initialization
	public ClassicCRMPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	
	//Actions
	
	public String classicCRPTitle() {
		return driver.getTitle();
	}
	
	public String validatePrivacyLink() {
		return privacyLink.getText();
	}
	
	public String validateForgotPasswordLink() {
		return forgotPasswordLink.getText();
	}

}
