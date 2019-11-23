import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zerodha {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//input[@placeholder='User ID' and @type = 'text']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@placeholder='Password' and @type = 'password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();

	}

}
