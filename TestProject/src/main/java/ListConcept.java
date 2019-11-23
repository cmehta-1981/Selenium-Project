import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListConcept {
	
	@Test
	public void AllListConcept() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/features");
		List<WebElement> list = driver.findElements(By.xpath("//section[@id=\"process\"]//div//div[2]//div//div//h3//span"));
		list.size();
		System.out.println("testing  :-> " +list.get(0).getText() +"sizeof---->"  +list.size());
		//img[@class = 'center-block img-responsive' and @src = 'https://phptravels.com/assets/img/hero.png' ]
		
		System.out.println(list.get(4).getText());
		
		for (int i= 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
