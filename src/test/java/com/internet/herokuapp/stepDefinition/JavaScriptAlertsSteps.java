package com.internet.herokuapp.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsSteps {
    WebDriver driver;
    @Given("^user is on that Welcome to the-internet page$")
    public void userIsOnThatWelcomeToTheInternetPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @When("^user clicks the JavaScript Alerts$")
    public void userClicksTheJavaScriptAlerts() {
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(29) > a")).click();
    }

    @And("^user clicks on Click for JS Confirm$")
    public void userClicksOnClickForJSConfirm() {
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
    }

    @And("^user clicks ok$")
    public void userClicksOk() {
        driver.switchTo().alert().accept();
    }

    @Then("^relevant message appears$")
    public void relevantMessageAppears() {
        String expectedMessage = driver.findElement(By.cssSelector("#result")).getText();
        Assert.assertEquals("You clicked: Ok",expectedMessage);
    }

}
