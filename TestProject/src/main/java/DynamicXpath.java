import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.investmentsafeguard.com/subscription");
		
		System.out.println("*****************************Free offers*************************");
		
		List<WebElement> freeList = driver.findElements(By.xpath("//div[2]//div[1]//div[2]//table[1]//tbody[1]//tr"));
		
		for(int j=0;j<freeList.size();j++) {
			
			//System.out.println(freeList.get(j).getText());
				if (freeList.get(j).getText().contains("Investment 3") ||freeList.get(j).getText().contains("Family 1 member") || freeList.get(j).getText().contains("Reminder Default")||freeList.get(j).getText().contains("Validity 6 Months") || freeList.get(j).getText().contains("Price Free")) {
					if(freeList.get(j).getText().contains("Family 1 member")) {
						System.out.println(freeList.get(j).getText());
						break;						
					}
				}								
			}
		
		System.out.println("**************************premium offers*************************");
		List<WebElement> premiumList = driver.findElements(By.xpath("//div[3]//div[1]//div[2]//table[1]//tbody//tr"));
		
		System.out.println(premiumList.size());
		
		for(int i=0;i<premiumList.size();i++) {
			
		System.out.println(premiumList.get(i).getText());
		if (premiumList.get(i).getText().contains("Investment Unlimited") ||premiumList.get(i).getText().contains("Family Unlimited") || premiumList.get(i).getText().contains("Reminder Custom")||premiumList.get(i).getText().contains("Validity 12 Months") || premiumList.get(i).getText().contains("Price Rs.499/year")) {
			if(premiumList.get(i).getText().contains("Investment Unlimited")) {
				System.out.println(premiumList.get(i).getText());
				break;						
			}
		}
		
		
		}
		
			
		driver.quit();

	}

}
