Feature: FreeCRM test application

@End2EndTest
Scenario: FreeCRM login page scenario

When user on FreeCRM login page
Then user verify the FreeCRM title
Then user sees username and password input fields
And user sees login button 
And user sees Forgot your password? link
And user sees Classic CRM link
And user sees Sign Up link
Then user close the browser

@SanityTest
Scenario: FreeCRM Forgot Password page scenario

When user on Forgot my password page
Then user verify the Forgot my password title
Then user sees email address input field
And user enter email address 
Then user clicks on Reset password button
And user sees the forgot password confirmation message 
Then user close the browser

@RegressionTest
Scenario: FreeCRM login test scenario

When user on FreeCRM login page
Then user verify the FreeCRM title
And user enter username and password
And user clicks on login button
And user verify the FreeCRM title again
Then user close the browser