package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinition {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("User is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUserName.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);

    }

    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLoginPage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_shoulr_see_url_contains_orders() {

        BrowserUtils.verifyURLContains("orders");

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String userName, String password) {
       webTableLoginPage.login(userName,password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
       /* webTableLoginPage.inputUserName.sendKeys(credentials.get("username"));
        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();*/

        // we will call our login utility method and pass values from Map
        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));

    }
}
