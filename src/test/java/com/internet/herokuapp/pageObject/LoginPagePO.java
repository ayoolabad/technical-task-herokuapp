package com.internet.herokuapp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {
    @FindBy(id = "username")
    public static WebElement usernameField;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(css = "#login > button > i")
    public static WebElement LoginButton;

    public LoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String Username){usernameField.sendKeys(Username);}
    public void enterPassword(String Password){passwordField.sendKeys(Password);}

    public void clickLoginButtton(){LoginButton.click();}










}
