package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CalendarPage extends TestBase {

	//Page factory or OR
	
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement newButton;
	
	
	
	
	//Initialization page objects 
	public CalendarPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	public CreateNewEventPage validateNewButton() throws Exception {
		newButton.click();
		return new CreateNewEventPage();
	}

}
