package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = { "src/test/resources/features"}, 
		dryRun = false, // doesn't test actual test just check mapping is done or not
		snippets = SnippetType.CAMELCASE, 
		monochrome = true, // removes the junks characters
		glue = { "definitions","hooks" }, // point out where the step definitions are
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class Cst_Runner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
		return super.scenarios();
	}
}
