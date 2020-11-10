package com.internet.herokuapp.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"com.internet.herokuapp.stepDefinition"},
        format = {"pretty", "html:target/site/cucumber-pretty"},
        tags = {"@JavaScriptAlerts"}
)
public class TestRunner {
}
