package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GoogleStepDefinition {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.id("L2AGLb")).click();
    }
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertEquals("Google",Driver.getDriver().getTitle());
        Driver.closeDriver();
    }
}
