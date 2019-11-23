Feature: Free CRM DealsDataDriven Feature


Scenario: Free CRM DealsDataDriven Test Scenario

Given user is already in login page
When title of login page is Free CRM
Then user enter username and password
|	username					|	password	|
| mobile.testing.c@gmail.com	|	Mobile@123	|

Then user clicks on login button
And user on home page
Then user clicks on deals button
Then user clicks on new deals button
Then user enter deals details
|	title	|	description			|	commission	|			 
|	Miss	|	second deal details	|	100			|

Then close the browser