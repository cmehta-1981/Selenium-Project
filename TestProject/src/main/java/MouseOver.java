import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MouseOver {

	
	
	@Test
	public static void MouseOverFeature() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo/");
		
		Actions actionFeature = new Actions(driver);
		WebElement mouseOverFeature = driver.findElement(By.xpath("//button[@type='button'and contains(text(),'Features') and @aria-describedby ='Popover1']"));
		actionFeature.moveToElement(mouseOverFeature).build().perform();
		
		List<WebElement> featureList = driver.findElements(By.xpath("//div[@id=\"Popover1\" and @class = 'popover popover--right']/div/ul[@class = 'popover-content__list']//li"));
	
		System.out.println(featureList.size());
		
		for(int i = 0; i<featureList.size();i++) {
			System.out.println(featureList.get(i).getText());
		}
		
				
		Actions actionMainFeature = new Actions(driver);
		WebElement mouseOverMainFeature = driver.findElement(By.xpath("//button[contains(text(),'Web App Features')]"));
		actionMainFeature.moveToElement(mouseOverMainFeature).build().perform();
		
		List<WebElement> mainFeatureList = driver.findElements(By.xpath("//div[@id=\"Popover2\"]/div//ul[@class = 'popover-content__list']//li"));
		System.out.println(mainFeatureList.size());
		
		for(int j = 0; j<mainFeatureList.size();j++) {
			System.out.println(mainFeatureList.get(j).getText());
		}
		
		driver.quit();
	}
	
	

}
