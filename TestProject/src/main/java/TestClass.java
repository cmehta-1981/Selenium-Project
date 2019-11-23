import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class TestClass {
	
	

	public static void main(String[] args) throws Exception {
		
		TestClass.readImageText();
		
		
		
		
		

	}
	
	
	public void selectOption() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mobile.testing.c@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mobile@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@name='category']")).click();
		
		List<WebElement> categoryList = driver.findElements(By.xpath("//div[@name='category']//div//div"));
		System.out.println(categoryList.size());
		categoryList.get(1).click();
		System.out.println(categoryList.get(1).getText());
		
		driver.quit();
	}
	
	public static void readImageText() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.investmentsafeguard.com/");
				
		Thread.sleep(5000);
		File scr = driver.findElement(By.xpath("//a[@class='navbar-brand js-scroll-trigger']//img")).getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"/screenshot/captch.png";
		FileHandler.copy(scr, new File(imagePath));
		
		
		ITesseract image = new Tesseract();
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		if(imageText.contains("Investment")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		driver.quit();
	}
	
	

}


