package com.BunnyCart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\subba\\BunnyCart\\src\\test\\resources\\com.BunnyCart.Feature\\Login.feature", // Updated path
    glue = {"com.BunnyCart.StepDefinition"},
    plugin = {"pretty", "html:target/cucumberreport/report1.html"},
    monochrome = true
)
public class TestRunner1 extends AbstractTestNGCucumberTests {
}