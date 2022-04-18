package stepDefinations;

import io.cucumber.java.en.*;

public class Page1 {
	
	@Given("system is displaying {string} page")
	public void system_is_displaying_page(String string) {
	    System.out.println("given");
	}
	@When("user clicks on {string} link")
	public void user_clicks_on_link(String string) {
		System.out.println("when");
	}
	@Then("system should display {string} page")
	public void system_should_display_page(String string) {
		System.out.println("then");
	}
	
	
	@When("user enters {string} in {string} text field")
	public void user_enters_in_text_field(String string, String string2) {
	System.out.println("when when");
	}
	@Then("system should display {string} in {string} text field")
	public void system_should_display_in_text_field(String string, String string2) {
	System.out.println("then then");
	}

}
