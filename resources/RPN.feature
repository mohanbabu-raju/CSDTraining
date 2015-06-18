Feature: Valid data format
Scenario Outline: RPN Calculator
	Given input is <input1>
	When data is <calculated>
	Then result <result> is returned
	
Examples:

| input1 | calculated | result |
| "1,2,3,+,-" | "calculated1" | "-4.0" |
| "6,2,*,3,/" | "calculated2" | "4.0" |
| "2,3,^,4,5,+,+" | "calculated3" | "17.0" |
