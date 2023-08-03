package com.naukri.cloud.Steps.Steps;

//import com.naukri.cloud.test.cache.Cache;
//import com.naukri.cloud.test.pageactions.loginpage;
import com.naukri.cloud.Steps.pageactions.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.devtools.v85.cachestorage.model.Cache;
import test.Common;
import test.Common;

import java.io.IOException;

public class StepDef extends Cache {
    Common common;
    public StepDef(){
        this.common=new Common(Common.driver);
    }
       loginpage l=super.getLoginPage();
    @Given("User fills the login details")
    public void user_fills_the_login_details () throws IOException {
                    l.loginToNaukari();
        System.out.println("frd");
    }

    @When("User fills emailid {string}")
    public void user_fills_emailid (String string){
        // Write code here that turns the phrase above into concrete actions
        System.out.println("frd");
    }

    @And("fills the password {string}")
    public void fills_the_password (String string){
        // Write code here that turns the phrase above into concrete actions
        System.out.println("frd");
    }

    @Then("User should be able to login to the naukri.")
    public void user_should_be_able_to_login_to_the_naukri () {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("frd");
    }

}
