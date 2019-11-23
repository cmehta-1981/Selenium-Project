package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStarpDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mobile.testing.c@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mobile@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		//driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@name='category']")).click();
		
		List<WebElement> categoryList = driver.findElements(By.xpath("//div[@name='category']//div//div"));
		System.out.println(categoryList.size());
		categoryList.get(1).click();
		System.out.println(categoryList.get(1).getText());
		
		driver.quit();
		

	}

}
