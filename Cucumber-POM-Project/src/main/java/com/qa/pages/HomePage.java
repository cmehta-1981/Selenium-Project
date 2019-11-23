package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	
	
	//Page factory or OR
	
		@FindBy(xpath = "//span[@class='user-display']")
		WebElement userNameLabel;
		
		@FindBy(xpath = "//span[contains(text(),'Home')]")
		WebElement homeLink;
		
		@FindBy(xpath = "//div[contains(text(),'Deals Summary')]")
		WebElement dealsSummary;
		
		@FindBy(xpath = "//div[@class='content card-header']//i[@class='right floated refresh icon color-gray']")
		WebElement contactsActivityStreamRefreshBtn;
		
		@FindBy(xpath = "//div[@class='content card-header']//i[@class='right floated setting icon color-gray']")
		WebElement contactsActivityStreamSettingBtn;
		
		@FindBy(xpath = "//div[@class='content card-header']//i[@class='right floated help circle icon color-gray']")
		WebElement contactsActivityStreamQuestionBtn;
		
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
		
		public boolean validateHomeLink() {
			return  homeLink.isDisplayed();
		}
		
		
		public boolean validateContactsActivityStreamSection() {
			 return contactsActivityStreamRefreshBtn.isEnabled();
			 //return contactsActivityStreamSettingBtn.isEnabled();  //multiple return statement are not allowed in single method 
			 //return contactsActivityStreamQuestionBtn.isEnabled();
		}
		
		public String  homePageTitle() {
			return driver.getTitle();
		}
		
		
		public String verifyDealsSummaryText() {
			return dealsSummary.getText();
		}
		
		public ContactPage verifyContactsLink() throws Exception {
			contactsLink.click();
			return new ContactPage();
		}
		
		public CalendarPage verifyCalendarLink() throws Exception {
			calendarLink.click();
			return new CalendarPage();
			
		}
		
		
		
		

}
