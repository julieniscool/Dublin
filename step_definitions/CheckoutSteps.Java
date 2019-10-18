package step_definitions;
import io.cucumber.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {
	
	@Given("the price of a {string} is {int}c")
	public void thePriceOfAIsC(String string, Integer price) {
		int bananaPrice = price;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}