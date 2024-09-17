package hooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends DriverInstance {

	@Before
	public void beforeScenario(Scenario scenario) throws MalformedURLException { // Scenario is interface

		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2").setPlatformName("Android").setPlatformVersion("15")
				.setApp("C:\\Users\\91860\\Desktop\\APK\\dh_stg_1.0.9.apk")
				.setIgnoreHiddenApiPolicyError(true)
				.setAppPackage("com.deepholistics.android.staging")
				.setAppActivity("com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity")
//				.setAdbExecTimeout("6000")
				.setNoReset(true).setAutoGrantPermissions(true);

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		String name = scenario.getName();
//		System.out.println("Scenario name: " + name);

	}

	@After
	public void afterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println("Is Failed: " + failed);
		if (failed) {
			//driver.removeApp("com.deepholistics.android.staging");
			System.out.println("App Sucessfully Uninstalled");
		}
	}

//	public void beforeSteps() {
//		
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
//
//
//	}
//	
//	public void afterSteps() {
//
//	}

}
