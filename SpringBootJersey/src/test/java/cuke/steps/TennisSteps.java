package cuke.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TennisSteps {
    @Given("^有空闲场地情况下，在(\\d+)点到(\\d+)点$")
    public void 有空闲场地情况下在点到点(int arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^进行预订$")
    public void 进行预订() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^我预订成功$")
    public void 我预订成功() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^我预订失败$")
    public void 我预订失败() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}