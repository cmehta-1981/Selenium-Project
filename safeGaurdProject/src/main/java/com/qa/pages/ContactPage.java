package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

public class ContactPage extends TestBase {

	
	@FindBy(xpath = "//h3[text() = 'Contact us']")
	WebElement contactUsHeader;
	
	@FindBy(xpath = "//i[@class='icon-placeholder']")
	WebElement addressIcon;
	
	@FindBy(xpath = "//h4[text() = 'Address']")
	WebElement addressLebel;
	
	@FindBy(xpath = "//p[contains(text(),'S N 39/15,Sneh Building,')]")
	WebElement addressDetail;
	
	@FindBy(xpath = "//i[@class='icon-smartphone']")
	WebElement giveUsCallIcon;
	
	@FindBy(xpath = "//h4[text() = 'Give us a call']")
	WebElement giveUsCallLabel;
	
	@FindBy(xpath = "//p[contains(text(),'+91-7219137025')]")
	WebElement giveUsCallNumber;
	
	@FindBy(xpath = "//i[@class='icon-chat-1']")
	WebElement emailUsIcon;
	
	@FindBy(xpath = "//h4[text() = 'Email Us']")
	WebElement emailUsLabel;
	
	@FindBy(xpath = "//p[contains(text(),'info@investmentsafeguard.com')]")
	WebElement emailAddress;
	
	@FindBy(xpath = "//h3[text() = 'Contact Us']")
	WebElement contactUsLabel;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement contactName;
	
	@FindBy(xpath = "//input[@id='mobile']")
	WebElement contactMobile;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement contactEmail;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement contactCity;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement contactMessage;
	
	@FindBy(xpath = "//body[@id='page-top']")
	WebElement reCaptchaCheckBox;
	
	@FindBy(xpath = "//input[@id ='submit_btn']")
	WebElement submitButton;
	
	
	
	
	
	public ContactPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateContactUsHeader() {
		return contactUsHeader.getText();
	}
	
	public boolean ValidateAddressIcon() {
		return addressIcon.isDisplayed();
	}
	
	public String ValidateAddressLabel() {
		return addressLebel.getText();
	}
	
	
	public boolean   ValidateAddressDetails() {
		 return addressDetail.getText().contains("S N 39/15,Sneh Building,Gujarnagar,Thergaon.Pune-411033 ");
	}
	
	public boolean ValidateCallUsIcon() {
		return giveUsCallIcon.isDisplayed();
	}
	
	public String ValidateCallUsLabel() {
		return giveUsCallLabel.getText();
	}
	
	public String ValidateCallUsNumber() {
		return giveUsCallNumber.getText();
	}
	
	
	public boolean ValidateEmailUsIcon() {
		return emailUsIcon.isDisplayed();
	}
	
	public String ValidateEmailUsLabel() {
		return emailUsLabel.getText();
	}
	
	public String ValidateEmailAddress() {
		return emailAddress.getText();
	}
	
	public String ValidateContactUsLabel() {
		return contactUsLabel.getText();
	}
	
	public void ValidateContactDetails(String sName , String sMobile , String sEmail ,  String sCity , String sMessage) {
		 contactName.sendKeys(sName);
		 contactMobile.sendKeys(sMobile);
		 contactEmail.sendKeys(sEmail);
		 contactCity.sendKeys(sCity);
		 contactMessage.sendKeys(sMessage);
	}
	
		
	public void ValidateContactCaptcha() {
		reCaptchaCheckBox.click();
	}
	
	public void ValidateContactSubmitButton() throws Exception {
		submitButton.click();
		Thread.sleep(5000);
	}

}
