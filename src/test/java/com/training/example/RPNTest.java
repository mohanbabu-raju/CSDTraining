package com.training.example;

import com.training.rpn.RPNValidate;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RPNTest extends TestCase{
	
String input = "";
String actual = "";
String condition = "";
@Given("^input is \"([^\"]*)\"$")
public void input_is(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	this.input= arg1;
}

@When("^data is \"([^\"]*)\"$")
public void data_is(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	this.condition=arg1;
	
}

@Then("^result \"([^\"]*)\" is returned$")
public void result_is_returned(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	RPNValidate rpn = new RPNValidate(input);
	actual = rpn.checValues(this.input);
		 
	assertEquals(String.valueOf(arg1), String.valueOf(actual));
}

}
