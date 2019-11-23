Feature: Free CRM Login Feature


#without Examples keyword
#Scenario: Free CRM Login Test Scenario

#Given user is already in login page
#When title of login page is Free CRM
#Then user enter "mobile.testing.c@gmail.com" and "Mobile@123"
#Then user clicks on login button
#And user on home page
#Then close the browser

#with Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already in login page
When title of login page is Free CRM
Then user enter "<username>" and "<password>"
Then user clicks on login button
And user on home page
Then close the browser

Examples:
	|username|password|
	|mobile.testing.c@gmail.com|Mobile@123|
	|Tom|Test123|