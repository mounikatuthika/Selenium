package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".//features//CreateBoard.feature",
        glue="stepdefinitions",
       monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/HTMLReports/cucumber.html"}
)
public class TestRunner {

}
