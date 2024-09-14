package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/features"},
		dryRun = !true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:reports"}
		)





public class TestRunner extends AbstractTestNGCucumberTests{

}
