package com.training.example;

import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest extends TestCase{
	
	int number1, number2,result;
	String operator=null;
	
	@Given("^the number (\\d+) and (\\d+)$")
	public void the_number_and(int arg1, int arg2) throws Throwable {
		number1 = arg1;
		number2 = arg2;
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^I select the \"([^\"]*)\" as option$")
	public void I_select_the_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		operator = arg1;
	    //throw new PendingException();
	}

	@Then("^the Result field should be (\\d+)$")
	public void the_Result_field_should_be(int arg1) throws Throwable {
		Calc calc = new Calc();
		if(operator.equals("Add")) {
			
			result = calc.add(number1, number2);
		}
		else if(operator.equals("Multiply"))
		{
			result = calc.multiply(number1, number2);
		}
		assertEquals(arg1, result);
	}



}
