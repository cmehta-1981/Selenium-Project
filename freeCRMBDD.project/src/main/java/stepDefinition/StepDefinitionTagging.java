package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinitionTagging {
	WebDriver driver;
	
	@Given("^user is login page test$")
	public void user_is_login_page_test() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		driver= new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	    
	}
	
	@Then("^user sees username input field$")
	public void user_sees_username_input_field() throws Throwable {
	  boolean ebableUsername =   driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).isEnabled();
	  Assert.assertEquals(true, ebableUsername);
	}

	@Then("^user sees password input field$")
	public void user_sees_password_input_field() throws Throwable {
		boolean enablePassword = driver.findElement(By.name("password")).isEnabled();
		Assert.assertEquals(true, enablePassword);
	    
	}

	@Then("^user sees login button$")
	public void user_sees_login_button() throws Throwable {
		boolean loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed();
		Assert.assertEquals(true, loginBtn);
	}

	@Then("^user close the login page$")
	public void user_close_the_login_page() throws Throwable {
		driver.close();
	    
	}

	@Given("^this is SignUp link test$")
	public void this_is_SignUp_link_test() throws Throwable {
	   boolean enableSignUp = driver.findElement(By.linkText("Sign Up")).isEnabled();
	   Assert.assertEquals(true, enableSignUp);
	}
	
	@Then("^user sees SignUp link$")
	public void user_sees_SignUp_link() throws Throwable {
		boolean enableSignUp = driver.findElement(By.linkText("Sign Up")).isEnabled();
		   Assert.assertEquals(true, enableSignUp);
	}

	@Given("^this is Classic CRM test$")
	public void this_is_Classic_CRM_test() throws Throwable {
	    
	}

	@Given("^this is forgot password  test$")
	public void this_is_forgot_password_test() throws Throwable {
	    
	}

	@Given("^this is home page title test$")
	public void this_is_home_page_title_test() throws Throwable {
	    
	}

	@Given("^this is home page left pan test$")
	public void this_is_home_page_left_pan_test() throws Throwable {
	    
	}

	@Given("^this is username label test$")
	public void this_is_username_label_test() throws Throwable {
	   
	}

	@Given("^this is search placeholder test$")
	public void this_is_search_placeholder_test() throws Throwable {
	    
	}

	@Given("^this is delete button test$")
	public void this_is_delete_button_test() throws Throwable {
	    
	}

	@Given("^this is setting test$")
	public void this_is_setting_test() throws Throwable {
	    
	}

	@Given("^this is home link test$")
	public void this_is_home_link_test() throws Throwable {
	   
	}

	@Given("^this is Calendar test$")
	public void this_is_Calendar_test() throws Throwable {
	    
	}

	@Given("^this is contacts test$")
	public void this_is_contacts_test() throws Throwable {
	    
	}

	@Given("^this is Companies test$")
	public void this_is_Companies_test() throws Throwable {
	    
	}

	@Given("^this is Deals test$")
	public void this_is_Deals_test() throws Throwable {
	    
	}

	@Given("^this is Tasks test$")
	public void this_is_Tasks_test() throws Throwable {
	    
	}

	@Given("^this is Cases test$")
	public void this_is_Cases_test()  {
	   
	}

	@Given("^this is Calls test$")
	public void this_is_Calls_test() throws Throwable {
	    
	}

	@Given("^this is Documents test$")
	public void this_is_Documents_test() throws Throwable {
	   
	}

	@Given("^this is Email test$")
	public void this_is_Email_test() throws Throwable {
	    
	}

	@Given("^this is Campaign test$")
	public void this_is_Campaign_test() throws Throwable {
	    
	}
	
	@Given("^this is close browser test$")
	public void this_is_close_browser_test() throws Throwable {
	    
	}


}
