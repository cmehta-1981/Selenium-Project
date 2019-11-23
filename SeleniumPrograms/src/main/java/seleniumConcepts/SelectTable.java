package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectDay = new Select(day);
		System.out.println(selectDay.getOptions().size()-1);
		selectDay.selectByVisibleText("10");
		
	
		
		for(int i=0;i<selectDay.getOptions().size()-1;i++){
			String getDayValue = selectDay.getOptions().get(i).getText();
			if(getDayValue.equals("15")) {
				selectDay.getOptions().get(i).click();
				break;
			}
		}
		
		driver.quit();

	}

}
