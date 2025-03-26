package com.BunnyCart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\subba\\BunnyCart\\src\\test\\resources\\com.BunnyCart.Feature\\AddProduct.feature", 
    glue = {"com.BunnyCart.StepDefinition"},
    plugin = {"pretty", "html:target/cucumberreport/report2.html"}, 
    monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
}
