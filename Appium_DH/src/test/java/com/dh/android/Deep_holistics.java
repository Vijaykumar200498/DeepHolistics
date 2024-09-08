package com.dh.android;

import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.AppiumServer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Deep_holistics {

	// static AndroidDriver driver;

	
	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub

		/*
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * 
		 * // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
		 * "UiAutomator2"); capabilities.setCapability("automationName",
		 * "UiAutomator2"); capabilities.setCapability("platformName", "Android");
		 * capabilities.setCapability("platformVersion", "15");
		 * capabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
		 * capabilities.setCapability("udid", "emulator-5554");
		 * capabilities.setCapability("app",
		 * "C:\\Users\\91860\\Desktop\\APK\\dh-staging_1.0.8.apk");
		 * capabilities.setCapability("appWaitPackage",
		 * "com.mysmitch.deepholistics.staging");
		 * capabilities.setCapability("appWaitActivity",
		 * "com.mysmitch.deepholistics.ui.user.htOnboarding.welcome.HtWelcomeActivity"
		 * ); //capabilities.setCapability("appWaitPackage",
		 * "com.mysmitch.deepholistics.staging");
		 * capabilities.setCapability("autoGrantPermissions", true);
		 * 
		 * 
		 */

		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2").setPlatformName("Android").setPlatformVersion("15")
				// .setPlatformVersion("15")
				//.setApp("C:\\Users\\91860\\Downloads\\DH-staging_1.0.8.apk")
				.setIgnoreHiddenApiPolicyError(true)
				//.setAppPackage("com.deepholistics.android.staging")
				
				//.setAppPackage("com.mysmitch.deepholistics.staging")
				
				//.setAppActivity("com.mysmitch.deepholistics.ui.htoken.HumanTokenMainActivity");
				
				 //.setAppActivity("com.mysmitch.deepholistics.ui.user.htOnboarding.welcome.HtWelcomeActivity")
				//.setAppActivity("com.mysmitch.deepholistics.ui.common.SplashActivity")
				// .setAppWaitActivity("com.mysmitch.deepholistics.ui.common.SplashActivity")
				//.setAppWaitActivity("com.mysmitch.deepholistics.ui.user.htOnboarding.welcome.HtWelcomeActivity")
				//.setNoReset(false)
				.setAutoGrantPermissions(true);

		URL url = new URL("http://127.0.0.1:4723/");

		AppiumServer.startAppiumServer();
		AndroidDriver driver = new AndroidDriver(url, options);

		System.out.println("App Installed Successfully");

		Thread.sleep(5000);
/*		
		WebElement learnMore = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/txt_no_account"));
		learnMore.click();
		
		Thread.sleep(5000);
		
		WebElement visitWebSite = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/btn_get_your_token"));
		visitWebSite.click();
		
		Thread.sleep(5000);
		
		Set<String> contexts = driver.getContextHandles();
		for(String contextName:contexts)
		{
			System.out.println(contextName);
		}
		//driver.context("WEBVIEW_chrome");
		System.out.println("Explore Our Deepholistics Website for more details");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(10000);

		WebElement clickBack = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/backArrow"));
		clickBack.click();
		
		Thread.sleep(5000);
		
//Login flow 
		
		WebElement login = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/btn_already_have_account"));
		login.click();

		Thread.sleep(5000);
		
		

//		WebElement editcountrycode = driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/country_code"));
//		editcountrycode.click();

//		WebElement searchcountry = driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/search_text"));
//		searchcountry.click();
//		searchcountry.sendKeys("india");

//		WebElement enternumber = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/etMobileNo"));
//		enternumber.sendKeys("7598928864");
		
		//driver.hideKeyboard();

//Check Enabled , Handle Incorrect Number	

/*		Thread.sleep(3000);

		WebElement getOtp = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/btn_get_otp"));
		getOtp.click();

		Thread.sleep(5000);

		WebElement enterOtp = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/pinField"));
		enterOtp.sendKeys("6789");

		
		WebElement continuebutton = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/btn_otp"));
		continuebutton.click();

		Thread.sleep(8000);

//		WebElement allowLocation = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
//		allowLocation.click();

		/*
		 * RemoteWebElement swipeDown = (RemoteWebElement) driver
		 * .findElement((AppiumBy.id("com.mysmitch.deepholistics.staging:id/view1")));
		 * 
		 * driver.executeScript("gesture: swipe",ImmutableMap.of("elementId",
		 * swipeDown.getId(), "percentage", 50, "direction", "down"));
		 * 
		 */

		
		
//		WebElement dismissBottomSheet = driver
//				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/container"));
//		dismissBottomSheet.click();

//		Thread.sleep(5000);

		WebElement clickFAB = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/iv_add_type"));
		clickFAB.click();

		Thread.sleep(5000);

		WebElement clickFood = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/food"));
		clickFood.click();

		Thread.sleep(5000);

		WebElement clickBF = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/txt_breakfast"));
		clickBF.click();

		Thread.sleep(5000);
		
		WebElement clickEdit = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/tv_edit_time"));
		clickEdit.click();
		
		Thread.sleep(5000);
//		
//		WebElement hourSpinner = driver.findElement(
//				By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\"])[1]"));
//		hourSpinner.sendKeys("12");
				
		
//		Thread.sleep(5000);
		
		WebElement DatePicker = driver
				.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.mysmitch.deepholistics.staging:id/design_bottom_sheet\"]/android.view.ViewGroup"));

	
		
//		List<WebElement> time = DatePicker.findElements(
//				AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.NumberPicker\")"));
//		System.out.println(time);
		
		List<WebElement> time = DatePicker.findElements(
				AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.NumberPicker\")"));
		System.out.println(time);
		
		
		WebElement hourSpinner = driver.findElement(
				By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\"])[1]"));
		hourSpinner.clear();
		hourSpinner.sendKeys("08");
		
		
		
		
		
		
		
		
		
		

//		WebElement hour = time.get(2);
//		hour.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"08\"))"));
//		hour.click();

		WebElement minute = time.get(1);
		minute.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"00\"))"));
		//minute.click();
		
		WebElement amPm = time.get(0);
		amPm.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"PM\"))"));
		amPm.click();
		
/*
		try {
			WebElement clickEdit = driver
					.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/tv_edit_time"));
			clickEdit.click();

			// Interact with the hour spinner
			WebElement hourSpinner = driver.findElement(
					By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\"])[1]"));
			hourSpinner.clear();
			hourSpinner.sendKeys("12");

			Thread.sleep(3000);

			// Interact with the minute spinner
			WebElement minuteSpinner = driver.findElement(
					By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\"])[2]"));
			minuteSpinner.clear();
			minuteSpinner.sendKeys("15");

//            driver.findElement(
//    				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10);"));

			driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollintoview(text(\"Monks\"));"));

			Thread.sleep(3000);

			// Interact with the AM/PM spinner (if applicable)
			WebElement amPmSpinner = driver.findElement(
					By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\\\"])[3]"));

			// actions = TouchAction(driver)

			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

			// AndroidTouchAction touch = new AndroidTouchAction(driver);

			amPmSpinner.clear();
			amPmSpinner.sendKeys("AM");

			Thread.sleep(3000);

			// Confirm the time
			driver.findElement(By.id("com.mysmitch.deepholistics.staging:id/btn_continue")).click();

		} finally {
			System.out.println("Time updated");
		}


		Thread.sleep(5000);
*/
		WebElement clickProfile = driver
				.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/exploreUserProfileSettingsFragment"));
		clickProfile.click();

		Thread.sleep(5000);
		
		
//		Dimension size = driver.manage().window().getSize();
//		int x = size.getWidth()/2;
//		int startSwipe = (int) (size.getHeight() * 0.60) ;
//		int endSwipe = (int) (size.getHeight() * 0.10) ;
//		driver.swipe(x,startSwipe, x, endSwipe , 2000);
		
		
		
		
		
		
		

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(1);"));

//		driver.findElement(AppiumBy.androidUIAutomator(
//				"new UiScrollable(new UiSelector()).scrollintoview(text(\"Monks\"));"));
//		
//		driver.findElement(AppiumBy.androidUIAutomator
//				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Monks\"));"));
		
//		driver.findElement(AppiumBy.androidUIAutomator
//				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Monks\").instance(0));"));
		
		
		Thread.sleep(5000);
		
		//TapOptions 
		//LongPressOptions
		
/*		WebElement clickLogout = driver.findElement(AppiumBy.id("com.mysmitch.deepholistics.staging:id/logout"));
		clickLogout.click();

		Thread.sleep(3000);
		
		WebElement Logout = driver.findElement(AppiumBy.id("android:id/button1"));
		Logout.click();

		System.out.println("Account Successfully Logged Out");

		Thread.sleep(2000);

		driver.removeApp("com.mysmitch.deepholistics.staging");

		System.out.println("App Uninstalled");
*/
		AppiumServer.stopAppiumServer();
	}



}
