package com.training.example;

import junit.framework.TestCase;

import com.training.rpn.RPNValidate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RPNTest extends TestCase{
	
	String inputA="";
	String inputB="";
	String inputC="";
	
	
	
	@Given("^when inputA is \"([^\"]*)\"$")
	public void when_inputA_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
		inputA = arg1;
	}

	@When("^data is validated$")
	public void data_is_validated() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Then("^error \"([^\"]*)\" is returned.$")
	public void error_is_returned(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
		RPNValidate validate = new RPNValidate(inputA);
		//Check for delimiter
		boolean statusFlag = validate.checkValidInputData();
		assertEquals(arg1, String.valueOf(statusFlag));
	}

	@Given("^when inputB is \"([^\"]*)\"$")
	public void when_inputB_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		inputB = arg1;
	}

	@Then("^message \"([^\"]*)\" is returned.$")
	public void message_is_returned(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		RPNValidate validate = new RPNValidate(inputB);
		//Check for delimiter
		boolean statusFlag = validate.checkValidInputData();
		assertEquals(arg1, String.valueOf(statusFlag));
	}

	@Given("^when inputC is \"([^\"]*)\"$")
	public void when_inputC_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		inputC = arg1;
	}

	@Then("^result -(\\d+) is returned.$")
	public void result_is_returned(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		RPNValidate validate = new RPNValidate(inputC);
		int result = validate.calculateValues();
		System.out.println("expected::"+arg1);
		System.out.println("actual::"+result);
		assertEquals(arg1, String.valueOf(result));
	}
	
	@Then("^result \"([^\"]*)\" is returned.$")
	public void result_is_returned(String arg1) throws Throwable {
		RPNValidate validate = new RPNValidate(inputC);
		int result = validate.calculateValues();
		System.out.println("expected::"+arg1);
		System.out.println("actual::"+result);
		assertEquals(arg1, String.valueOf(result));
	}


	
}
