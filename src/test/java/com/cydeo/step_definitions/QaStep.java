package com.cydeo.step_definitions;

import com.cydeo.pages.QaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QaStep {
    @Given("User should be already qa dashboard page")
    public void user_should_be_already_qa_dashboard_page() {
        QaPage first = new QaPage();
        first.username.sendKeys("Employee91");
        first.password.sendKeys("Employee123");
    }
    @When("User click {string} button")
    public void user_click_button(String string) {



    }
    @When("User Click {string} button on {string}")
    public void user_click_button_on(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should display {string} files")
    public void user_should_display_files(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
