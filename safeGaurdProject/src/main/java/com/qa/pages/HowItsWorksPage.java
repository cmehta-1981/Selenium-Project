package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;
import com.ga.util.TestUtil;

public class HowItsWorksPage extends TestBase{

	
	@FindBy(xpath = "//h3[contains(text(),'How does our app work?')]")
	WebElement howItWorks;
	
	@FindBy(xpath = "//img[@class='w-100 desktopimg']")
	WebElement howItWorksImage;
	
		
	public HowItsWorksPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateHowItWorksText() throws Exception {
		return howItWorks.getText();
		
	}

	
	public void validateHowItWorksImage() throws Exception {
		TestUtil.readHowItWorksIamgeText();
		
	}

}
