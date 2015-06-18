package com.training.example;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchCabTest extends TestCase{
	
	@Given("^when \"([^\"]*)\" selected as FROM and \"([^\"]*)\" is selected as TO$")
	public void when_selected_as_FROM_and_is_selected_as_TO(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^search result is displayed with (\\d+) rows.$")
	public void search_result_is_displayed_with_rows(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^when \"([^\"]*)\" is selected in from and \"([^\"]*)\" is selected as TO$")
	public void when_is_selected_in_from_and_is_selected_as_TO(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^search result is empty i.e (\\d+).$")
	public void search_result_is_empty_i_e_(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
