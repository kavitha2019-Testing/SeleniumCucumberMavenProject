package TestRunner;

import StepDefinitions.APStepdefinition;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "C:/Users/kavitha/IdeaProjects/SeleniumCucumberMavenProject/Feature/AP.feature",
        glue = "StepDefinitions",plugin = "html:target/Cucumber_html_TestReport")
// plugin is used to generate reports

public class testrunner {
}
