
/*
package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionDataDriven {
	
	
	WebDriver driver;
	  
	  @Given("^user is already in login page$") 
	  public void user_is_already_in_login_page(){
			System.setProperty("webdriver.chrome.driver","D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
			driver= new ChromeDriver(); driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://ui.freecrm.com/"); 
		}
	  
	  
	  @When("^title of login page is Free CRM$") 
	  public void title_of_login_page_is_Free_CRM() { String title = driver.getTitle();
	  		Assert.assertEquals("CRM", title); 
	  }
	  
	  @Then("^user enter username and password$")
	  public void user_enter_username_and_password(DataTable credential) {
		  for(Map<String,String> data : credential.asMaps(String.class, String.class)) {
		  driver.findElement(By.name("email")).sendKeys(data.get("username"));
		  driver.findElement(By.name("password")).sendKeys(data.get("password"));
		  }
	      
	  }
	  
	  @Then("^user clicks on login button$") 
	  public void user_clicks_on_login_button() throws Exception { 
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		  Thread.sleep(5000); 
	  }
	  
	  @Then("^user on home page$") 
	  public void user_on_home_page() {
		  String title = driver.getTitle(); Assert.assertEquals("CRM", title); 
	  }
	  
	  @Then("^user clicks on deals button$") 
	  public void user_clicks_on_deals_button() throws Exception{
		  driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		  Thread.sleep(5000); 
	  }
	  
	  @Then("^user clicks on new deals button$") 
	  public void user_clicks_on_new_deals_button() {
		  driver.findElement(By.xpath("//button[contains(text(),'New')]")).click(); 
	  }
	  
	  @Then("^user enter deals details$")
	  public void user_enter_deals_details(DataTable dealData){
		 for( Map<String,String> data : dealData.asMaps(String.class, String.class)) {
		  driver.findElement(By.name("title")).sendKeys(data.get("title"));
		  driver.findElement(By.name("description")).sendKeys(data.get("description"));
		  driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
		  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 }
	      
	  }

	  	  
	  @Then("^close the browser$") 
	  public void close_the_browser() { 
		  driver.quit();
	  }

}

*/
