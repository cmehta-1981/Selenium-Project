Feature: PHP login page test

Scenario: PHP Landing Page test
	Given user is on PHP login page
	Then user verify the demo option
	Then user verify the pricing option
	Then user verify the features option
	Then user verify the product option
	Then user verify the hosting option
	Then user verify the services option
	Then user verify the company option
	Then user verify the login button


Scenario: PHP Main Features page  test
	Given user on main feature page
	Then user sees main features header
	And user sees the vacation packages image
	And user sees the demo link
	And user sees application features options
	And user sees submit requirement link
	And user sees subscribe button 
	
	
	
Scenario: PHP Hotels Module page test
	Given user on hotels module page
	Then user sees hotels module header
	And user sees the CALENDAR AVAILABILITY 
	And user sees the HOTEL FACILITIES
	
