package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/features"},
		dryRun = !true,
		glue = {"steps","hooks"},
		snippets = SnippetType.CAMELCASE,
		
		plugin = {"pretty","html:reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = ""
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
