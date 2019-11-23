@FunctionalTest
Feature: Free CRM Login Pgae Feature

 @SanityTest @RegressionTest
Scenario: Free CRM Login Page Test
Given user is login page test
Then user sees username input field
And user sees password input field
And user sees login button
Then user close the login page

@RegressionTest
Scenario: Free CRM SignUp page test
Given user is login page test
Then user sees SignUp link
Then user close the login page 


@SanityTest @RegressionTest
Scenario: Free CRM Classic CRM link test
Given this is Classic CRM test

@SanityTest @RegressionTest
Scenario: Free CRM Forgot Password link test
Given this is forgot password  test

@SanityTest @RegressionTest 
Scenario: Free CRM Home page title test
Given this is home page title test

@SanityTest @RegressionTest @End2EndTest 
Scenario: Free CRM Home page left pan options test
Given this is home page left pan test

@SanityTest @RegressionTest @End2EndTest 
Scenario: Free CRM Home Page page username label test
Given this is username label test

@SanityTest @RegressionTest @End2EndTest  
Scenario: Free CRM Home page search placeholder test
Given this is search placeholder test

@SanityTest @RegressionTest @End2EndTest 
Scenario: Free CRM Home page delete button test
Given this is delete button test

@RegressionTest @End2EndTest 
Scenario: Free CRM Home page setting button test
Given this is setting test

@RegressionTest @End2EndTest
Scenario: Free CRM Home link test
Given this is home link test

@RegressionTest @End2EndTest
Scenario: Free CRM Calendar link test
Given this is Calendar test

@RegressionTest @End2EndTest
Scenario: Free CRM Contacts link test
Given this is contacts test

 @End2EndTest
Scenario: Free CRM Companies link test
Given this is Companies test

@End2EndTest
Scenario: Free CRM Deals link test
Given this is Deals test

@End2EndTest
Scenario: Free CRM Tasks link test
Given this is Tasks test

@End2EndTest
Scenario: Free CRM Cases link test
Given this is Cases test

@SanityTest
Scenario: Free CRM Calls link test
Given this is Calls test

@SanityTest
Scenario: Free CRM Documents link test
Given this is Documents test

@SanityTest
Scenario: Free CRM Email link test
Given this is Email test

@RegressionTest
Scenario: Free CRM Campaigns link test
Given this is Campaign test

Scenario: Free CRM close browser test
Given this is close browser test


