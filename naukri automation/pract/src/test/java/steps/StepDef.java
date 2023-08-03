package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
    @Given("User opens corporate {string} login page")
    public void user_opens_corporate_login_page(String string) {
        System.out.println("kal");
    }
    @When("User fills emailid {string}")
    public void user_fills_emailid(String string) {

    }
    @When("User fills the password {string}")
    public void user_fills_the_password(String string) {

    }
    @Then("User should be able to verify dashboard")
    public void user_should_be_able_to_verify_dashboard() {

    }

}
