package dhTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features"}, 
		dryRun = false, // doesn't test actual test just check mapping is done or not 
		monochrome = true, // removes the junks characters
		glue = {"dhStepDefinition"} // point out where the step definitions are
		//plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class CucumberRunner {

}
