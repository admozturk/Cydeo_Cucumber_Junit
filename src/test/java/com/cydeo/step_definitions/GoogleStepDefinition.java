package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleStepDefinition {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {
        googleSearchPage.searchBox.sendKeys("apple"+Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }

    @Then("user sees {string} in the Google title")
    public void user_sees_in_the_google_title(String string) {

        String expectedTitle = string+" - Recherche Google";
        String actualTitle = Driver.getDriver().getTitle();
        // j unit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("user sees apple in the Google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Recherche Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    // Assert.assertEquals("apple - Recherche Google",Driver.getDriver().getTitle());

    }


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
