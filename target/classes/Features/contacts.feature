Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user hits on the login button
Then user enters "<email>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| email | password | firstname | lastname | position |
	| vineetbhatt2@gmail.com  | FreeCRM1234# | Tom 	  | Peter    | Manager  |
	| naveenk  | test@123 | David 	  | Dsouza   | Director |