package support;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "html:target/cucumberHtmlReport.html",
        "json:target/cucumber-report.json"
   }, 
    features = {
        "src/test/java/features"
    },
    glue = {
        "stepDefinitions"
    },
    tags = "@userexperience1"
    )
public class TestRunner {

}



