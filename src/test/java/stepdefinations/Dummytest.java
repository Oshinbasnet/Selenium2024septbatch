package stepdefinations;

import io.cucumber.java.en.*;

public class Dummytest {
    @Given("This is a dummy given")
    public void this_is_a_dummy_given() {
        System.out.println("apple");

    }
    @When("This is a dummy when")
    public void this_is_a_dummy_when() {
        System.out.println("apple");

    }
    @When("This is a dummy and")
    public void this_is_a_dummy_and() {
        System.out.println("apple");

    }
    @Then("This is a dummy then")
    public void this_is_a_dummy_then() {
        System.out.println("apple");
    }

}
