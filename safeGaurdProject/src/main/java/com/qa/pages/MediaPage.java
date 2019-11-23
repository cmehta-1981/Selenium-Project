package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

public class MediaPage extends TestBase{
	
	@FindBy(xpath = "//strong[contains(text(),'Media')]")
	WebElement mediaHeader;
	
	@FindBy(xpath = "//h4[contains(text(),'Latest Release')]")
	WebElement latestRelease;

	public MediaPage() throws Exception {
		super();

		PageFactory.initElements(driver, this);
	}
	
	
	public String validateMediaHeader() {
		return mediaHeader.getText();
	}
	
	public String validateLatestRelease() {
		return latestRelease.getText();
	}

}
