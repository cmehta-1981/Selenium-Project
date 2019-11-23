/**
 * 
 */
package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author cmehta
 *
 */
public abstract class Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver , 20);	
	}
	
	//define abstract methods 
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForTitlePresent(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageCalss) {
		try {
			return pageCalss.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

}
