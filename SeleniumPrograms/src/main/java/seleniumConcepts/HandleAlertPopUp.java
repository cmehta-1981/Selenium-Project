package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());

		if(alert.getText().equals("Please enter a valid user name1")){
			System.out.println("Correct alert message" );
			
		}else {
			System.out.println("In correct alert message" );
		}
		Thread.sleep(5000);
		alert.accept();
		
		driver.quit();

	}

}
