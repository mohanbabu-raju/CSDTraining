Feature: Calculator Add function
Scenario: Positive number Addition
	Given the number 7 and 8
	When I select the "Add" as option
	Then the Result field should be 15
Scenario: Positive number Multiplication
	Given the number 7 and 5
	When I select the "Multiply" as option
	Then the Result field should be 35

	