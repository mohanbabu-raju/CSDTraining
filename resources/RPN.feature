Feature: Valid data format
Scenario: Check for Special characters - Invalid
	Given when inputA is "12,4,5,a,b,+"
	When data is validated
	Then error "false" is returned.
Scenario: Check for Special characters - Valid
	Given when inputB is "12,4,5,+,-"
	When data is validated
	Then message "true" is returned.
	
Scenario: Calculate the valid Data
	Given when inputC is "1,2,3,+,-"
	When data is validated
	Then result "-4" is returned.