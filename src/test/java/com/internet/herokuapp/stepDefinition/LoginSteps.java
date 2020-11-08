package com.internet.herokuapp.stepDefinition;

import com.internet.herokuapp.pageObject.LoginPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    @Given("^user is on Login page$")
    public void userIsOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        //driver.findElement(By.linkText("<i class=\"fa fa-2x fa-sign-in\"> Login</i>")).click();
    }

    @When("^user inputs the \"([^\"]*)\"$")
    public void userInputsThe(String Username) throws Throwable {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterUsername(Username);
    }

    @And("^user enters the \"([^\"]*)\" given$")
    public void userEntersTheGiven(String Password) throws Throwable {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterPassword(Password);
    }

    @Then("^user then clicks on Login$")
    public void userThenClicksOnLogin() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.clickLoginButtton();
    }
}
