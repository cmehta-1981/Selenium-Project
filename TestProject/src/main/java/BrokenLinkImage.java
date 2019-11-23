import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLinkImage {

	public static void main(String[] args) throws Exception, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.investmentsafeguard.com/howitworks");
		
		//find tag //a
		//find tag //img
		
		
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
				
				if (activeLink.get(k).getAttribute("href") == "https://www.investmentsafeguard.com/") {
					break;
				}
			}
			
			
			
		driver.quit();
	}
}
