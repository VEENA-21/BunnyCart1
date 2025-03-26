package com.BunnyCart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\subba\\BunnyCart\\src\\test\\resources\\com.BunnyCart.Feature\\Scenario5SignInAndSignOut.feature", 
    glue = {"com.BunnyCart.StepDefinition"},
    plugin = {"pretty", "html:target/cucumberreport/report5.html"}, 
    monochrome = true
)
public class TestRunner5 extends AbstractTestNGCucumberTests {
}
