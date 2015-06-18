Feature: Add New Cab
Scenario: Add a new cab with all values
	Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "16/06/2015"
	And Name is "John"
	And Contact number is "90909090"
	And Email is "hello@hp.com"
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 1
Scenario: Add a new cab with invalid DATE
	Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "21/06/2014"
	And Name is "John"
	And Contact number is "90909090"
	And Email is "hello@hp.com"
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "Invalid date"
Scenario: Add a new cab with MISSING - TO & FROM DATA
Given when From is ""
	And TO is ""
	And datetime is "21/06/2014"
	And Name is "John"
	And Contact number is "90909090"
	And Email is "hello@hp.com"
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "To & From Locations are Mandatory."
Scenario: Add a new cab with MISSING - Name
Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "21/06/2014"
	And Name is ""
	And Contact number is "90909090"
	And Email is "hello@hp.com"
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "Name is Mandatory."
Scenario: Add a new cab with MISSING - Email
Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "21/06/2014"
	And Name is "Peter"
	And Contact number is "90909090"
	And Email is ""
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "Email is Mandatory."
Scenario: Add a new cab with MISSING - Contact Number
Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "21/06/2014"
	And Name is "Peter"
	And Contact number is "90909090"
	And Email is ""
	And Seat_Availability is 5
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "Contact Number is Mandatory."
Scenario: Add a new cab with MISSING - Invalid/No Seat No's are provided.
Given when From is "OTP"
	And TO is "PORUR"
	And datetime is "21/06/2014"
	And Name is "Peter"
	And Contact number is "90909090"
	And Email is ""
	And Seat_Availability is 
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "Seat No is Mandatory."
Scenario: Add a new cab with TO & From are same.
Given when From is "OTP"
	And TO is "OTP"
	And datetime is "21/06/2014"
	And Name is "Peter"
	And Contact number is "90909090"
	And Email is ""
	And Seat_Availability is 4
	When clicked on "ADD" button
	Then record inserted is 0.
	And errormessage is "TO & From should not be the same."
	


		
