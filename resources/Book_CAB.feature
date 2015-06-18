Feature: Book a cab
Scenario: Book a cab with valid data
	Given when Username is "Kenny" 
	And Contact number is "9090909099"
	And MailId is "Kenny@hp.com"
	And Number ofseats is 2
	When clicked on "Book" button
	Then Status is "confirmed"
	And no of records updates is 1.
Scenario: Book a cab with invalid data
	Given when Username is "Kenny" 
	And Contact number is "9090909099"
	And MailId is "Kenny@hp.com"
	And Number ofseats is 200
	When clicked on "Book" button
	Then Status is "fail"
	And no of records updates is 0.
	And Error message "Invalid seats" is displayed.
