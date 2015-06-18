Feature: Search by Route
Scenario: search functionality for selected location
	Given when "OTP" selected as FROM and "ADYAR" is selected as TO
	When clicked on "SEARCH" button
	Then search result is displayed with 3 rows.
Scenario: search functionality for invalid data
	Given when "OTP" is selected in from and "ABC" is selected as TO
	When clicked on "SEARCH" button
	Then search result is empty i.e 0.


