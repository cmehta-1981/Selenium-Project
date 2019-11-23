package com.ga.util;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import junit.framework.Assert;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class TestUtil extends TestBase{
	
	public TestUtil() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}



	static int PAGE_LOAD_TIMEOUT = 40;
	static int IMPLICIT_WAIT = 50;
	
	
	
	public static void readLogoImageText() throws Exception {
		
		File scr = driver.findElement(By.xpath("//a[@class='navbar-brand js-scroll-trigger']//img")).getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"/screenshot/logoImage.png";
		FileHandler.copy(scr, new File(imagePath));
		
		
		ITesseract image = new Tesseract();
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		if(imageText.contains("Investment")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
	
	
public static void readHowItWorksIamgeText() throws Exception {
		
		File scr = driver.findElement(By.xpath("//img[@class='w-100 desktopimg']")).getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"/screenshot/howItsWork.png";
		FileHandler.copy(scr, new File(imagePath));
		
		
		ITesseract image = new Tesseract();
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		if(imageText.contains("Registration")&& imageText.contains("Relax") && imageText.contains("Create Account") && imageText.contains("Manage Family")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
	
	
	public static void brokenLink() throws Exception, Exception {
		List<WebElement>  linkLists = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on page :--->" +linkLists.size());
		
		linkLists.addAll(driver.findElements(By.tagName("img")));
		//System.out.println("Total links and images on page :--->" +linkLists.size());
		
		List<WebElement> imageLists = driver.findElements(By.tagName("img"));
		System.out.println("Total images on page-->" +imageLists.size());
		
		List<WebElement> activeLink = new ArrayList<WebElement>();
		List<WebElement> activeImage = new ArrayList<WebElement>();
		
		//Iterate linklist : -  excludes all links does not have herf attributes 
		for(int i=0;i<linkLists.size();i++) {
			System.out.println(linkLists.get(i).getAttribute("href"));
			if(linkLists.get(i).getAttribute("href") != null && (!linkLists.get(i).getAttribute("href").contains("null"))) {
				activeLink.add(linkLists.get(i));
				
			}
		}
		
		//Get size of all active links 
			System.out.println("Total active links--->" +activeLink.size());
		
		//Iterate linklist : -  excludes all image does not have herf attributes 
		for(int j = 0;j<imageLists.size();j++) {
			
			if(imageLists.get(j).getAttribute("href") != null) {
				activeImage.add(imageLists.get(j));
			
		 }
				
	   }
		
		//Get size of all active image links 
			System.out.println("Total active image links--->" +activeImage.size());
		
		
			//check the href url with httpconnection api
			
			for(int k=0;k<activeLink.size();k++) {
				
				HttpURLConnection connection = (HttpURLConnection)new URL(activeLink.get(k).getAttribute("href")).openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activeLink.get(k).getAttribute("href") +"--->" +response);
				String linkText = activeLink.get(k).getAttribute("href");
				Assert.assertEquals(activeLink.get(k).getAttribute("href"), "https://www.investmentsafeguard.com/");
				
			}
	}
	

}
