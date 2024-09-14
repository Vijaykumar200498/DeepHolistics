package stepsDefinition;

import java.net.MalformedURLException;

import driverConfig.SetupDriver;
import io.cucumber.java.Before;

public class BaseMethods extends SetupDriver {

	@Before
	public void appLaunch() throws MalformedURLException {
		setup();
	}
	
}
