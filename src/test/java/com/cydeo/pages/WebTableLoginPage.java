package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement inputUserName;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * No parameters
     * when we call this method it will directly login using
     * UserName: Test
     * Password: Tester
     */
    public void login(){

        this.inputUserName.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This Method will accept 2 arguments and login
     * @param userName
     * @param password
     */
    public void login (String userName, String password){
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();


    }

    /**
     * This method will login using credentials from configuration.properties
     */
    public void loginWithConfig(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        loginButton.click();

    }

}
