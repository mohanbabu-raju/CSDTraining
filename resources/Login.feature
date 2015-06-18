Feature: Login Feature
Scenario: Check for empty Username
	Given when User field is ""
	When clicked on "Login" button as option
	Then error-"Invalid Username" is returned.
Scenario: Check for empty Password
	Given when Password field is ""
	When clicked on "Login" button as option
	Then error-"Invalid Password" is returned.
Scenario: Check for valid Username and Passowrd
	Given when User field is "John"
	And when Password field is "Peter"
	When clicked on "Login" button as option
	Then "Logging Success" is returned.

