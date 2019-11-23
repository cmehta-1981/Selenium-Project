Feature: Free CRM LoginPage test

Scenario: validate Free CRM Home Page test

Given user opens browser 
Then user is on login page
Then user login into application
Then user validate homepage title
Then user close the browser


Scenario: validate Free CRM links on Home Page

Given user on login page
Then user sees Forgot your password? link
And user sees Classic CRM link
And user sees Sign Up link
Then user close the browser