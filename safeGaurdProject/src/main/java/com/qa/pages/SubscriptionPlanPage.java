package com.qa.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ga.util.TestBase;

import junit.framework.Assert;

public class SubscriptionPlanPage extends TestBase{

	@FindBy(xpath = "//h3[contains(text(),'Subscription Plans')]")
	WebElement subscriptionPlanText;
	
	@FindBy(xpath = "//strong[contains(text(),'Free')]")
	WebElement freeHeader;
	
	@FindBy(xpath = "//div[@class='mt-4']//td[contains(text(),'Investment')]")
	WebElement freeInvestmentText;
	
	@FindBy(xpath = "//th[contains(text(),'3')]")
	WebElement freeMonthText;
	
	@FindBy(xpath = "//div[@class='mt-4']//td[contains(text(),'Family')]")
	WebElement freeFamilyText;
	
	@FindBy(xpath = "//th[contains(text(),'1 member')]")
	WebElement freeOneMenmber;
	
	
	@FindBy(xpath = "//div[@class='mt-4']//td[contains(text(),'Reminder')]")
	WebElement freeReminderText;
	
	
	@FindBy(xpath = "//th[contains(text(),'Default')]")
	WebElement defaultText;
	
	
	@FindBy(xpath = "//div[@class='mt-4']//td[contains(text(),'Validity')]")
	WebElement freeValidityText;
	
	@FindBy(xpath = "//th[contains(text(),'6 Months')]")
	WebElement sixMonthText;
	
	@FindBy(xpath = "//div[@class='mt-4']//td[contains(text(),'Price')]")
	WebElement priceText;
	
	@FindBy(xpath = "//th[contains(text(),'Free')]")
	WebElement freeText;
	
	@FindBy(xpath = "//button[@class='btn subscribe1']")
	WebElement freeDownloadAppBtn;
	
	@FindBy(xpath = "//strong[contains(text(),'Premium')]")
	WebElement premiumHeader;
	
	@FindBy(xpath = "//h3[contains(text(),'Download the app')]")
	WebElement downloadTheAppBtn;
	
	
	@FindBy(xpath = "//div[@class = 'pt-3 mb-2' ]//a[1]//img")
	WebElement appStoreLink;
	
	@FindBy(xpath = "//div[@class = 'pt-3 mb-2' ]//a[2]//img")
	WebElement googlePlayLink;
	
	
	
	
	public SubscriptionPlanPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public String  ValidateSubscriptionPlan() {
		return subscriptionPlanText.getText();
	}
	
	public String  ValidateFreeSection() {
		return freeHeader.getText();
	}
	
	public void ValidateFreeContents() {	
		System.out.println("*****************************Free offers*************************");
		
		List<WebElement> freeList = driver.findElements(By.xpath("//div[2]//div[1]//div[2]//table[1]//tbody[1]//tr"));
		
		for(int j=0;j<freeList.size();j++) {
			
			//System.out.println(freeList.get(j).getText());
				if (freeList.get(j).getText().contains("Investment 3") ||freeList.get(j).getText().contains("Family 1 member") || freeList.get(j).getText().contains("Reminder Default")||freeList.get(j).getText().contains("Validity 6 Months") || freeList.get(j).getText().contains("Price Free")) {
					if(freeList.get(j).getText().contains("Family 1 member")) {
						System.out.println(freeList.get(j).getText());
						Assert.assertEquals("Family 1 member", freeList.get(j).getText());
						break;						
					}
				}								
			}
		
		//Assert.assertEquals("Investment",  freeInvestmentText.getText());
		//Assert.assertEquals("3",  freeMonthText.getText());
		
		
	}
	
		
	public boolean  ValidateFreeDownlaodBtn() {
		return freeDownloadAppBtn.isEnabled();
	}
	
	
	public void validatePremiumContents() {
		System.out.println("**************************premium offers*************************");
		List<WebElement> premiumList = driver.findElements(By.xpath("//div[3]//div[1]//div[2]//table[1]//tbody//tr"));
		
		System.out.println(premiumList.size());
		
		for(int i=0;i<premiumList.size();i++) {
			
		System.out.println(premiumList.get(i).getText());
		if (premiumList.get(i).getText().contains("Investment Unlimited") ||premiumList.get(i).getText().contains("Family Unlimited") || premiumList.get(i).getText().contains("Reminder Custom")||premiumList.get(i).getText().contains("Validity 12 Months") || premiumList.get(i).getText().contains("Price Rs.499/year")) {
			if(premiumList.get(i).getText().contains("Investment Unlimited")) {
				System.out.println(premiumList.get(i).getText());
				Assert.assertEquals("Investment Unlimited", premiumList.get(i).getText());
				break;						
			}
		}
		
		
		}
	}
	
	public boolean  ValidateDownloadTheAppBtn() {
		return downloadTheAppBtn.isEnabled();
	}
	
	public void ValidateAppStorePage() {
		String parentWindowId  = driver.getWindowHandle();
		System.out.println("Parent window ID :--> "  +parentWindowId);
		appStoreLink.click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All windows count:--> " +allWindowsId.size());
		
		for(String childWindowId:allWindowsId ) {
			
			if(!childWindowId.equalsIgnoreCase(parentWindowId)) {
				driver.switchTo().window(childWindowId);
				System.out.println(driver.getTitle());
				//Assert.assertEquals("ISF Technologies Pvt. Ltd.", driver.findElement(By.linkText("ISF Technologies Pvt. Ltd.")).getText());
				//Assert.assertEquals("?Investment Safeguard on the App Store", driver.getTitle());
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		
	}
	
	
	public void ValidateGoogleStorePage() {
		String parentWindowId  = driver.getWindowHandle();
		//System.out.println("Parent window ID :--> "  +parentWindowId);
		googlePlayLink.click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		//System.out.println("All windows count:--> " +allWindowsId.size());
		
		for(String childWindowId:allWindowsId ) {
			
			if(!childWindowId.equalsIgnoreCase(parentWindowId)) {
				driver.switchTo().window(childWindowId);
				//System.out.println(driver.getTitle());
				//Assert.assertEquals("Investment Safeguard: ​Protect Investment Details - Apps on Google Play", driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
	}

}
