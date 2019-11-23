/*
  package stepDefinition;
  
  import java.util.List; 
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.chrome.ChromeDriver;
  
  import cucumber.api.DataTable; 
  import cucumber.api.java.en.Given; 
  import cucumber.api.java.en.Then; 
  import cucumber.api.java.en.When;
  import junit.framework.Assert;
  
  @SuppressWarnings("deprecation") 
  	public class StepDefinition { 
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
  
  // 1. \"([^\"]*)\" // 2. \"(.*)\" //Using Scenarios outline & Examples
  //concepts
  
  @Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$") 
  public void user_enter_username_and_password(String username , String password) {
	  driver.findElement(By.name("email")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password); 
	  }
  
  @Then("^user clicks on login button$") 
  public void user_clicks_on_login_button() throws Exception { 
	  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	  Thread.sleep(5000); }
  
  
  @Then("^user on home page$") 
  public void user_on_home_page() {
	  String title = driver.getTitle(); Assert.assertEquals("CRM", title); }
  
  
  @Then("^user clicks on contacts button$") 
  public void user_clicks_on_contacts_button() {
	  driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
  
  }
  
  @Then("^user clciks on new button$") 
  public void user_clciks_on_new_button(){ 
	  driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
  
  }
  
  @Then("^user enter contacts details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$") 
  public void user_enter_contacts_details_and_and(String firstname, String
	  lastname, String company){
	  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
	  driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
	  driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys(company); }

  
  @Then("^user clicks on save button$") 
  public void user_clicks_on_save_button(){
	  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click(); 
  }
  
  
  //Using data table concepts
  
  @Then("^user enter username and password$") 
  public void user_enter_username_and_password(DataTable deals) { List<List<String>>
	  userDetails = deals.raw();
	  driver.findElement(By.name("email")).sendKeys(userDetails.get(0).get(0));
	  driver.findElement(By.name("password")).sendKeys(userDetails.get(0).get(1));
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
  public void user_enter_deals_details(DataTable dealsInfo) { List<List<String>>
	  newDealDeatils = dealsInfo.raw();
	  driver.findElement(By.name("title")).sendKeys(newDealDeatils.get(0).get(0));
	  driver.findElement(By.name("description")).sendKeys(newDealDeatils.get(0).get(1));
	  driver.findElement(By.name("commission")).sendKeys(newDealDeatils.get(0).get(2));
	  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click(); 
	 }
  
  //
  
  @Then("^close the browser$") 
  public void close_the_browser() { 
	  driver.quit();
  }
  
  
  
  }*/
 