package com.internet.herokuapp.stepDefinition;

import com.internet.herokuapp.pageObject.LoginPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationSteps {
    WebDriver driver;
    @Given("^user is on Welcome to the-internet page$")
    public void userIsOnWelcomeToTheInternetPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @When("^user clicks on Form Authentication$")
    public void userClicksOnFormAuthentication() {
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a")).click();
    }

    @And("^user enters the \"([^\"]*)\"$")
    public void userEntersThe(String Username) throws Throwable {
        //driver.findElement(By.id("username")).sendKeys(Username);
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterUsername(Username);
    }

    @And("^user enters directed \"([^\"]*)\"$")
    public void userEntersDirected(String Password) throws Throwable {
        //driver.findElement(By.id("password")).sendKeys(Password);
        LoginPagePO logInPagePO = new LoginPagePO(driver);
        logInPagePO.enterPassword(Password);
    }

    @And("^user clicks on Login$")
    public void userClicksOnLogin() {
        //driver.findElement(By.cssSelector("#login > button > i")).click();
        LoginPagePO logInPagePO = new LoginPagePO(driver);
        logInPagePO.clickLoginButtton();
    }

    @Then("^user SecureArea page is displayed\\.$")
    public void userSecureAreaPageIsDisplayed() {
        String expectedResult = driver.findElement(By.cssSelector("#content > div > h2")).getText();
        Assert.assertEquals("Secure Area",expectedResult);
    }

}
