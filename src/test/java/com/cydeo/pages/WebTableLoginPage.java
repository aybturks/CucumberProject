package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * No parameters.
     * When we call this method, it will directly login using
     *
     * Username: Test
     * Password: Tester
     */
    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
        System.out.println("Hello");
    }

    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUsername.sendKeys(com.cydeo.utilities.ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(com.cydeo.utilities.ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }
}