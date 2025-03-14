package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features", 
    glue = {"stepDefinition", "myHooks"} ,             
    plugin = {"pretty", "html:target/cucumber-reports.html"}, 
    monochrome = true                         
)
public class Runner extends AbstractTestNGCucumberTests {
}


