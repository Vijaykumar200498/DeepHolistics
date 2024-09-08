package com.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseMethods {

	public static AndroidDriver driver;
	
	@Before
	public void setUp() throws MalformedURLException {
		
		File root = new File(System.getProperty("user.dir"));
		File app = new File(root, "/src/test/resources/AppApk/DH-staging_1.0.8.apk");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2")
				.setPlatformName("Android")
				.setPlatformVersion("15")
				.setApp(app.getAbsolutePath())
				.setAppPackage("com.mysmitch.deepholistics.staging")
				.setAppWaitActivity("com.mysmitch.deepholistics.ui.user.htOnboarding.welcome.HtWelcomeActivity")
				.setNoReset(false)
				.setAutoGrantPermissions(true);
		
		//URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		//return driver;
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		driver.close();
		
	}
	
}


