package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

public class GalleryPage extends TestBase {
	
	@FindBy(xpath = "//strong[contains(text(),'Gallery')]")
	WebElement galleryHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Gallery')]")
	WebElement galleryButton;
	
	@FindBy(xpath = "//a[contains(text(),'Video')]")
	WebElement videoButton;

	public GalleryPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String  validateGalleryHeader() {
		return galleryHeader.getText();
	}
	
	public boolean  validateGalleryButton() {
		return galleryButton.isEnabled();
	}
	
	public boolean  validateVideoButton() {
		return videoButton.isEnabled();
	}

}
