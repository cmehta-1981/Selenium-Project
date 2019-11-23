Feature: Free CRM Contacts Feature


Scenario Outline: Free CRM Contacts Test Scenario

Given user is already in login page
When title of login page is Free CRM
Then user enter "<username>" and "<password>"
Then user clicks on login button
And user on home page
Then user clicks on contacts button
Then user clciks on new button
Then user enter contacts details "<firstname>" and "<lastname>" and "<company>"
Then user clicks on save button
Then close the browser

Examples:
	|username					|password	|	firstname	| lastname	|	company	|
	|mobile.testing.c@gmail.com	|Mobile@123	|	CMtest		|	Mehta	|	CGtest	|
	|mobile.testing.c@gmail.com	|Mobile@123	|	MOM			|	GOD		|	PGtest	|