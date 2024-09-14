package dhTestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		dryRun = !true,
		glue = {"StepsDefinition"}
		//snippets = SnippetType.CAMELCASE
)

public class CucumberRunner1 extends AbstractTestNGCucumberTests{

	
}