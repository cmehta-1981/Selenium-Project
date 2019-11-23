package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ZerodhaTestBase;

public class ZerodhaLoginPage extends ZerodhaTestBase{
	
	//OR
	
	@FindBy(xpath = "//h2[text() ='Login to Kite' ]")
	WebElement  loginPageHeader;
	
	@FindBy(xpath = "//input[@placeholder='User ID' and @type = 'text']")
	WebElement userID;
	

	@FindBy(xpath = "//input[@placeholder='Password' and @type = 'password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	//object initialization
	public ZerodhaLoginPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Action
	
	public String  ValidateZerodhaTitile() {
		return driver.getTitle();
	}
	
	
	public String ValidateLoginPageHeader() {
		return loginPageHeader.getText();
	}
	
	public void ValidateLogin(String username , String pwd) {
		userID.sendKeys(username);
		password.sendKeys(pwd);
		loginBtn.click();
		
	}

}
