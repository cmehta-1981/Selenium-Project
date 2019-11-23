package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class PHPLoginPage extends Base {

	// OR or Page factory

	@FindBy(xpath = "//input[@value = 'Login' and @type = 'submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//nav[@id='ShopifyMainNav']//img[@class='img-responsive']")
	WebElement pHPTravelImage;

	@FindBy(xpath = "//a[text() = 'Demo' and @href ='https://phptravels.com/demo/']")
	WebElement optionDemo;

	@FindBy(xpath = "//a[text() = 'Pricing' and @href ='https://phptravels.com/order/']")
	WebElement optionPricing;

	@FindBy(xpath = "//button[@type='button'and contains(text(),'Features') and @aria-describedby ='Popover1']")
	WebElement optionFeatures;
	
	@FindBy(xpath = "//a[contains(text(),'Main Features')]")
	WebElement  mainFeatures;
	
	
	@FindBy(xpath = "//button[contains(text(),'Web App Features')]")
	WebElement webAppFeatures;
	
	@FindBy(xpath = "//a[@class='marketing-nav__item marketing-nav__item--child'][contains(text(),'Hotels Module')]")
	WebElement hotelsModule;
	
	@FindBy(xpath = "//button[contains(text(),'Desktop App Features')]")
	WebElement desktopAppFeatures;
	
	@FindBy(xpath = "//a[@class='marketing-nav__item marketing-nav__item--child'][contains(text(),'Desktop App')]")
	WebElement desktopApp;
	
	@FindBy(xpath = "//button[contains(text(),'Mobile App Features')]")
	WebElement mobileAppFeatures;
	
	@FindBy(xpath = "//a[@class='marketing-nav__item marketing-nav__item--child'][contains(text(),'Desktop App')]")
	WebElement mobileApp;
	
	@FindBy(xpath = "//button[contains(text(),'Products')]")
	WebElement optionProduct;
	
	@FindBy(xpath = "//button[contains(text(),'Hosting') and @aria-describedby ='Popover8']")
	WebElement optionHosting;
	
	@FindBy(xpath = "//button[@aria-describedby='Popover9'and contains(text(),'Services')]")
	WebElement optionServices;
	
	@FindBy(xpath = "//button[contains(text(),'Company')]")
	WebElement optionCompany;

	// initialization of class object

	public PHPLoginPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public String ValidatePHPLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean ValidateLoginButtonEnable() {
		return loginBtn.isEnabled();
	}

	public boolean ValidateDemoOption() {
		return optionDemo.isEnabled();
	}

	public boolean ValidatePricingOption() {
		return optionPricing.isDisplayed();
	}


	public MainFeaturePage ValidateFeaturesOption() {
		
		Actions actionFeatures = new Actions(driver);
		WebElement mouseOverFeatures = optionFeatures;
		actionFeatures.moveToElement(mouseOverFeatures).build().perform();
		mainFeatures.click();
		return new MainFeaturePage();

	}
	
	
	public HotelsModulePage ValidateWebAppFeaturesOption() {
	try {
		Actions actionFeatures = new Actions(driver);
		WebElement mouseOverFeatures = optionFeatures;
		actionFeatures.moveToElement(mouseOverFeatures).build().perform();
		
		Actions actionWebAppFeature = new Actions(driver);
		WebElement mouseOverWebAppFeature = webAppFeatures;
		actionWebAppFeature.moveToElement(mouseOverWebAppFeature).build().perform();
		List<WebElement> mainFeatureList = driver.findElements(By.xpath("//div[@id=\"Popover2\"]/div//ul[@class = 'popover-content__list']//li"));
		System.out.println(mainFeatureList.size());
		
		for(int j = 0; j<mainFeatureList.size();j++) {
			System.out.println(mainFeatureList.get(j).getText());
			if(mainFeatureList.get(j).getText().contentEquals("Hotels Module")) {
				hotelsModule.click();
				break;
			}else{
				System.out.println("String <Hotels Module> not found");
				};
		}
	}catch(Exception e) {
			System.out.println("feature list not found");
		}
		return new HotelsModulePage();
	}
	
	
	public DesktopAppPage ValidateDesktopAppFeaturesOption() {
		Actions actionFeatures = new Actions(driver);
		WebElement mouseOverFeatures = optionFeatures;
		actionFeatures.moveToElement(mouseOverFeatures).build().perform();
		
		Actions actionOverDesktopAppFeatures = new Actions(driver);
		WebElement mouseOverDesktopAppFeatures = desktopAppFeatures;
		actionOverDesktopAppFeatures.moveToElement(mouseOverDesktopAppFeatures).build().perform();
		desktopApp.click();
		return new DesktopAppPage();
		
	}
	
	
	public MobileAppPage ValidateMobileAppPage() {
		Actions actionFeatures = new Actions(driver);
		WebElement mouseOverFeatures = optionFeatures;
		actionFeatures.moveToElement(mouseOverFeatures).build().perform();
		
		Actions actionMobileAppFeatures = new Actions(driver);
		WebElement mouseOverMobileAppFeatures = mobileAppFeatures;
		actionMobileAppFeatures.moveToElement(mouseOverMobileAppFeatures).build().perform();
		mobileApp.click();
		return new MobileAppPage();
		
	}
	
	
	
	
	public void ValidateProductOption() {
		Actions actionProduct = new Actions(driver);
		WebElement mouseOverProduct = optionProduct;
		actionProduct.moveToElement(mouseOverProduct).build().perform();

	}
		
	
	public void ValidateHostingOption() {
		Actions actionHosting = new Actions(driver);
		WebElement mouseOverHosting = optionHosting;
		actionHosting.moveToElement(mouseOverHosting).build().perform();

	}
	
	public void ValidateServicesOption() {
		Actions actionServices = new Actions(driver);
		WebElement mouseOverServices = optionServices;
		actionServices.moveToElement(mouseOverServices).build().perform();

	}
	
	public void ValidateCompanyOption() {
		Actions actionCompany = new Actions(driver);
		WebElement mouseOverCompany = optionCompany;
		actionCompany.moveToElement(mouseOverCompany).build().perform();

	}
	

}
