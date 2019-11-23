package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

public class AboutUsPage extends TestBase{
	
	
	//OR - Object repository
	
	@FindBy(xpath = "//strong[@class='avenir-bold text-uppercase']")
	WebElement  aboutUsText;
	
	@FindBy(linkText = "click here.")
	WebElement clickHereLink;
	

	//Class object initialization
	public AboutUsPage() throws Exception {
		super();

		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateAboutUsText() {
		return aboutUsText.getText();
	}
	
	public HowItsWorksPage validateClickHereLink() throws Exception {
		clickHereLink.click();
		return new HowItsWorksPage();
	}
	
	
	

}
