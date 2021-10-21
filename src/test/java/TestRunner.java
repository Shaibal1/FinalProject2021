import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Path to the feature files
        features = {"src/test/resources/features"},

        // Specify the step definition package name
        glue = {"StepDefinition", "DriverWrapper"},

        // Tags to be executed
        tags = {"@sanity"},

        // This creates a default cucumber report
        plugin = {"pretty", "html:Reports/Default/"}
)
public class TestRunner {
}
