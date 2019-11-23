package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class CreateNewEventPage extends TestBase{
	
	//Page factory or OR
	
	@FindBy(xpath = "//input[@name='title']")
	WebElement eventTitle;
	
	@FindBy(xpath = "//div[@name='category']")
	WebElement selectCategory;
	
	
	@FindBy(xpath = "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
	WebElement  selectStartDate;
	
	@FindBy(xpath = "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
	WebElement  selectEndDate;
	
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement eventDescription;
	
	@FindBy(xpath = "//textarea[@name='location']")
	WebElement eventLocation;
	
	@FindBy(xpath = "//div[contains(text(),'Minutes')]")
	WebElement eventAlertBefore;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	
	
	//Object initialization
	public CreateNewEventPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String createNewEventTitle() {
		return driver.getTitle();
	}
	
	public void newEventTitle(String titleName) {
		 eventTitle.sendKeys(titleName);
		
	}
	
	public void validateSaveNewEvent() {
		saveButton.click();
		
		
	}
	
	
	

}

//input[@class='calendarField react-datepicker-ignore-onclickoutside']