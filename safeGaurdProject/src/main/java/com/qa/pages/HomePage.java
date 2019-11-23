package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

public class HomePage extends TestBase{

	//Define the page factory or OR
	
	@FindBy(xpath = "//a[@id='home_li']")
	WebElement homeLink;
	
	@FindBy(xpath = "//a[@id='about_li']")
	WebElement aboutUsLink;
	
	@FindBy(xpath = "//a[@id='howitworks_li']")
	WebElement howItWorks;
	
	@FindBy(xpath = "//a[@id='gallery_li']")
	WebElement galleryLink;
	
	@FindBy(linkText = "Media")
	WebElement mediaLink;
	
	@FindBy(xpath = "//a[@id='subscription_li']")
	WebElement subscriptionLink;
	
	@FindBy(linkText = "FAQ's")
	WebElement faqLink;
	
	@FindBy(id = "contact_li")
	WebElement contactLink;
	
	@FindBy(xpath = "//p[@class='mb-0 mt-3 text-white p-0']")
	WebElement copyRightsText;
	
	@FindBy(xpath = "//a[@class='navbar-brand js-scroll-trigger']//img")
	WebElement logoImage;
	
	@FindBy(xpath = "//div[contains(@class,'d-flex h-100')]")
	WebElement aboutUsImage;
	
	
	//Initialized the class objects
	public HomePage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateInvestmentSafeGaurdTitle() {
		return driver.getTitle();
	}
	
	
	public boolean validateInvestmentSafeGaurdLogo() {
		return logoImage.isDisplayed();
	}
	
	
	public AboutUsPage validateAboutUsPage() throws Exception {
		aboutUsLink.click();
		return new AboutUsPage();
	}
	
	
	public HowItsWorksPage validateHowItWorks() throws Exception {
		howItWorks.click();
		return new HowItsWorksPage();
	}
	
	
	public GalleryPage validateGalleryPage() throws Exception {
		galleryLink.click();
		return new GalleryPage();
	}
	
	
	
	public MediaPage validateMediaPage() throws Exception {
		mediaLink.click();
		return new MediaPage();
	}
	
	public SubscriptionPlanPage validateSubscriptionPage() throws Exception {
		subscriptionLink.click();
		return new SubscriptionPlanPage();
	}
	
	public ContactPage validateContactPage() throws Exception {
		contactLink.click();
		return new ContactPage();
	}

}
