package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver driver;
	
	@When("^user on FreeCRM login page$")
	public void user_on_FreeCRM_login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe"); 
		driver= new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/"); 
	    
	}

	
	@SuppressWarnings("deprecation")
	@Then("^user verify the FreeCRM title$")
	public void user_verify_the_FreeCRM_title() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "CRM");
	}

	@And("^user enter username and password$")
	public void user_enter_username_and_password() {
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mobile.testing.c@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mobile@123");
	}

	
	  @And("^user clicks on login button$") public void
	  user_clicks_on_login_button() { driver.findElement(By.
	  xpath("//div[@class='ui fluid large blue submit button']")).click(); }
	 

	@SuppressWarnings("deprecation")
	@And("^user verify the FreeCRM title again$")
	public void user_verify_the_FreeCRM_title_again() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "CRM");
	}

	
	
	
	  @Then("^user close the browser$") public void user_close_the_browser() {
	  driver.quit(); }
	 
	 
	 
	
	@SuppressWarnings("deprecation")
	@Then("^user sees username and password input fields$")
	public void user_sees_username_and_password_input_fields() {
		boolean emailPlaceholder = driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).isDisplayed();
		Assert.assertEquals(emailPlaceholder, true);
		boolean passwordPlaceholder = driver.findElement(By.xpath("//input[@placeholder='Password']")).isDisplayed();
		Assert.assertEquals(passwordPlaceholder, true);
		
	}

	@And("^user sees login button$")
	public void user_sees_login_button() {
		boolean loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed();
		Assert.assertEquals(loginBtn, true);
	}

	@And("^user sees Forgot your password\\? link$")
	public void user_sees_Forgot_your_password_link() {
		boolean fogotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).isDisplayed();
		Assert.assertEquals(fogotPassword, true);
		
	}

	@And("^user sees Classic CRM link$")
	public void user_sees_Classic_CRM_link() {
		boolean classicCRM = driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).isDisplayed();
		Assert.assertEquals(classicCRM, true);
	}

	@Then("^user sees Sign Up link$")
	public void user_sees_Sign_Up_link() {
		boolean signUP = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).isDisplayed();
		Assert.assertEquals(signUP, true);
	}
	
	
	@When("^user on Forgot my password page$")
	public void user_on_Forgot_my_password_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe"); 
		driver= new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
	}

	@Then("^user verify the Forgot my password title$")
	public void user_verify_the_Forgot_my_password_title() {
		String getForgotPasswordTitle = driver.getTitle();
		Assert.assertEquals(getForgotPasswordTitle, "CRM Register");
	}

	@Then("^user sees email address input field$")
	public void user_sees_email_address_input_field() {
		driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
	}

	@Then("^user enter email address$")
	public void user_enter_email_address() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chhotelal.mehta.cm@gmail.com");
	}

	@Then("^user clicks on Reset password button$")
	public void user_clicks_on_Reset_password_button() {
		driver.findElement(By.xpath("//button[@name='action']")).click();
	}

	@Then("^user sees the forgot password confirmation message$")
	public void user_sees_the_forgot_password_confirmation_message() {
		String getText = driver.findElement(By.xpath("//div[contains(text(),'Thank you. If this email is registered you will re')]")).getText();
		System.out.println(getText);
		Assert.assertEquals(getText, "Thank you. If this email is registered you will receive an email with a password reset link.");
	}

	
	

}
