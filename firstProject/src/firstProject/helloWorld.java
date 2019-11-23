package firstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");	
		
		driver.findElement(By.name("email")).sendKeys("mobile.testing.c@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mobile@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click(); 
		driver.findElement(By.name("title")).sendKeys("Mr");
		driver.findElement(By.name("description")).sendKeys("test");
		driver.findElement(By.name("commission")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();	
		    

	}

}
