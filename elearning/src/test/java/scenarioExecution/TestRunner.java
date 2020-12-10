package scenarioExecution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Feature/elearning.feature" , glue="stepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests {
}
