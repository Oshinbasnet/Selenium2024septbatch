package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@dummy", features = {"src/test/resources"}, glue = {"stepdefinations"}, plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunnerTests extends AbstractTestNGCucumberTests {}
