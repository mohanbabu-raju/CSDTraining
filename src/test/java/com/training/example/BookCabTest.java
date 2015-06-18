package com.training.example;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookCabTest extends TestCase{

	
	@Given("^when Username is \"([^\"]*)\"$")
	public void when_Username_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^MailId is \"([^\"]*)\"$")
	public void MailId_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^Number ofseats is (\\d+)$")
	public void Number_ofseats_is(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^clicked on \"([^\"]*)\" button$")
	public void clicked_on_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Status is \"([^\"]*)\"$")
	public void Status_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^no of records updates is (\\d+).$")
	public void no_of_records_updates_is_(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Error message \"([^\"]*)\" is displayed.$")
	public void Error_message_is_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
