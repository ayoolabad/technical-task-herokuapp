package com.internet.herokuapp.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.HelloWorld;

public class DynamicLoadingSteps {
    WebDriver driver;
    @Given("^user is on the Welcome to the-internet page$")
    public void userIsOnTheWelcomeToTheInternetPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @When("^user clicks on Dynamic Loading$")
    public void userClicksOnDynamicLoading() {
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(14) > a")).click();
    }

    @And("^user  clicks on Example: Element rendered  after the fact$")
    public void userClicksOnExampleElementRenderedAfterTheFact() {
        driver.findElement(By.cssSelector("#content > div > a:nth-child(8)")).click();
    }

    @And("^user clicks on Start$")
    public void userClicksOnStart() {
        driver.findElement(By.cssSelector("#start > button")).click();
    }

    @Then("^Hello World! message appears\\.$")
    public void helloWorldMessageAppears() {
    }
}
