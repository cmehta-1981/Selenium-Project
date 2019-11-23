import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.investmentsafeguard.com");
		System.out.println("IVSG home text---->" +driver.findElement(By.xpath("//strong[@class='avenir-bold']")).getText());
		System.out.println("IVSG home info text---->" +driver.findElement(By.xpath("//p[contains(text(),'Investment Safeguard is your reliable partner in p')]")).getText());

	}

}
