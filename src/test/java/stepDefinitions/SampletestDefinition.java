package stepDefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.GoogleApplication;

public class SampletestDefinition {
	GoogleApplication googleApplication = new GoogleApplication();
	
	@Given("I navigate to google home page")
	public void i_navigate_to_google_home_page() {
	    googleApplication.driver.navigate().to("https://www.google.com");
	    googleApplication.homepage.clickgooglecookieagreement();
	}

	@Given("i enter the search creteria as {string}")
	public void i_enter_the_search_creteria_as(String searchText) {
	    // Write code here that turns the phrase above into concrete actions
		googleApplication.homepage.enterSearchCriteria(searchText);
		
	}

	@When("I click on search button")
	public void i_click_on_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		googleApplication.homepage.clickSearchButton();
	}

	@Then("I should see the results")
	public void i_should_see_the_results() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("results are not displayed",googleApplication.resultspage.resultOutput.isDisplayed());
	}

}
