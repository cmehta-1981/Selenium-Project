/**
 * 
 */
package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.BasePage;

/**
 * @author cmehta
 *
 */
public class HomePage extends BasePage{

	//Page locator
	
	private By header = By.xpath("//i18n-string[contains(text(),'Take a closer look at how HubSpot works.')]");
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}



	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}

}
