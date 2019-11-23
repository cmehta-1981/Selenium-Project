/**
 * 
 */
package com.MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.util.BasePage;
import com.qa.util.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author cmehta
 *
 */
public class BaseTest {
	
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value  = {"browser"})
	public void setUpTest(String browser) {
		if(browser.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}
		else {
			System.out.println("no browser defined in XML file ....");
		}
		
		driver.get("https://app.hubspot.com/login");
		
		page = new BasePage(driver);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
