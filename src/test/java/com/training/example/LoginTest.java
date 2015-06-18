package com.training.example;

import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends TestCase {
	String username="";
	String password="";
	String operation="";
	String result="";
	
	@Given("^when User field is \"([^\"]*)\"$")
	public void when_User_field_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		username = arg1;
	}

	@Then("^error-\"([^\"]*)\" is returned.$")
	public void error_is_returned(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		result = arg1;
	}

	@Given("^when Password field is \"([^\"]*)\"$")
	public void when_Password_field_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		password =arg1;
	}

	@Then("^\"([^\"]*)\" is returned.$")
	public void is_returned(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		result = arg1;
		Login login = new Login();
		String actual = login.validateLogin(username, password);
		assertEquals(result, actual );
		
	}

	@When("^clicked on \"([^\"]*)\" button as option$")
	public void clicked_on_button_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		operation = arg1;
	}

}
