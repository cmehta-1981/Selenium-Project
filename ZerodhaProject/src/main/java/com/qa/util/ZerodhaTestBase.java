package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ZerodhaTestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public ZerodhaTestBase() throws Exception{
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\cmehta\\eclipse-workspace\\ZerodhaProject\\src\\main\\java\\com\\qa\\config\\zerodha.properties");
			prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\cmehta\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(ZerodhaUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(ZerodhaUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        
        driver.get(prop.getProperty("url"));
        
        
		
	}

}
