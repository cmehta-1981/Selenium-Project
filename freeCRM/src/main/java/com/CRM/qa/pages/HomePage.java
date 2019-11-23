package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page factory or OR
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//div[contains(text(),'Deals Summary')]")
	WebElement dealsSummary;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement companiesLink;	
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath = "//span[contains(text(),'Cases')]")
	WebElement casesLink;
	
	@FindBy(xpath = "//span[contains(text(),'Calls')]")
	WebElement callsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement emailLink;
	
	
	//Initialize the page objects
	public HomePage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public boolean verifyUserLabel() {
		return userNameLabel.isDisplayed();
		
	}
	
	
	public String verifyDealsSummaryText() {
		return dealsSummary.getText();
	}
	
	public ContactPage verifyContactsLink() throws Exception {
		contactsLink.click();
		return new ContactPage();
	}

}
