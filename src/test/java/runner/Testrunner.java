package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/java/features",
        glue = "seleniumgluecode",
        plugin = {"pretty",
                "html:target",
                "html:target/cucumber.xml",
                "json:target/cucumber.json"}
)

public class Testrunner {
}
