package driverConfig;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SetupDriver {

	AndroidDriver driver;
	
	public void setup() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2")
				.setPlatformName("Android")
				.setPlatformVersion("14")
				.setApp("C:\\Users\\91860\\Desktop\\APK\\dh_stg_1.0.9.apk")
				.setIgnoreHiddenApiPolicyError(true)
				.setAppPackage("com.deepholistics.android.staging")
				.setAppActivity("com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity")
				.setNoReset(true)
				.setAutoGrantPermissions(false);

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, options);

	}
	
}
