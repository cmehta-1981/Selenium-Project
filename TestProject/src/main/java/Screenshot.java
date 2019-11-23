import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Screenshot {
	
	
	@Test
	public static void HowToWorkImageReadText() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/hotels-module-features/");
		Thread.sleep(7000);
		File howItWork = driver.findElement(By.xpath("//section[@class='styleblock']//img[@class='center-block img-responsive']")).getScreenshotAs(OutputType.FILE);
		String howItWorkImagePath = System.getProperty("user.dir")+"/screenshot/howtowork.png";
		FileHandler.copy(howItWork, new File(howItWorkImagePath));		
		ITesseract howItWorkImage = new Tesseract();
		String howItWorkImageText = howItWorkImage.doOCR(new File(howItWorkImagePath));
		System.out.println(howItWorkImageText);
		driver.quit();
		
	}
	
	@Test
	public static void ChatImageReadText() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/hotels-module-features/");
		Thread.sleep(7000);
		File chatImage = driver.findElement(By.xpath("//div[@id='livechat-eye-catcher-img']//img")).getScreenshotAs(OutputType.FILE);
		String chatImageImagePath = System.getProperty("user.dir")+"/screenshot/vacationPackage.png";
		FileHandler.copy(chatImage, new File(chatImageImagePath));		
		ITesseract chatImagePackageImage = new Tesseract();
		String chatImageImageText = chatImagePackageImage.doOCR(new File(chatImageImagePath));
		System.out.println(chatImageImageText);
		//if(chatImageImageText.contentEquals("chatting with us!"))
		Assert.assertEquals(chatImageImageText.contains("chatting with us!"), "chatting with us!");
		driver.quit();
	}
	
	@Test
	public static void VacationPackageImageReadText() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/features");
		Thread.sleep(7000);
		File vacationPackage = driver.findElement(By.xpath("//img[@class='wow fadeIn img-responsive animated']")).getScreenshotAs(OutputType.FILE);
		String vacationPackageImagePath = System.getProperty("user.dir")+"/screenshot/vacationPackage.png";
		FileHandler.copy(vacationPackage, new File(vacationPackageImagePath));		
		ITesseract vacationPackageImage = new Tesseract();
		String vacationPackageImageText = vacationPackageImage.doOCR(new File(vacationPackageImagePath));
		System.out.println(vacationPackageImageText);
		driver.quit();
	}
	


}
