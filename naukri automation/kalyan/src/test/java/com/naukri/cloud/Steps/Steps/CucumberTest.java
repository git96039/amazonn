package com.naukri.cloud.Steps.Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",monochrome = true, glue={"com.naukri.cloud.Steps"},plugin = {"pretty", "json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/cucumber.html"})
public class CucumberTest {
}