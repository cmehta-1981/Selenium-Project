package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");		
		driver.findElement(By.id("fileupload")).sendKeys("D:\\Users\\cmehta\\Downloads\\37486_FS_chhotelal.mehta.pdf");
		
		driver.quit();
	}
}
