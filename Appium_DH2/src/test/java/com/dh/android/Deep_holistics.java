package com.dh.android;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.AppiumServer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Deep_holistics {

	static AndroidDriver driver;
	static WebDriverWait waitTime = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public static void main(String[] args) throws InterruptedException, Exception {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2")
				.setPlatformName("Android")
				.setPlatformVersion("15")
				.setApp("C:\\Users\\91860\\Desktop\\APK\\dh_stg_1.0.9.apk")
				.setIgnoreHiddenApiPolicyError(true)
				.setAppPackage("com.deepholistics.android.staging")		
				.setAppActivity("com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity")
				.setNoReset(false)
				.setAutoGrantPermissions(true);

		URL url = new URL("http://127.0.0.1:4723/");
		
		AppiumServer.startAppiumServer();
		AndroidDriver driver = new AndroidDriver(url, options);

		System.out.println("App Installed Successfully");

		/*		
		WebElement learnMore = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/txt_no_account"));
		waitTime.until(ExpectedConditions.visibilityOf(learnMore));
		learnMore.click();
		
					
		WebElement visitWebSite = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Visit Website\"]"));
		waitTime.until(ExpectedConditions.elementToBeClickable(visitWebSite));
		visitWebSite.click();
		
		
		Set<String> contexts = driver.getContextHandles();
		for(String contextName:contexts)
		{
			System.out.println(contextName);
		}
		driver.context("WEBVIEW_chrome");
		
		System.out.println("Explore Our Deepholistics Website for more details");
		
		Thread.sleep(5000);
		
		driver.navigate().back();

		Thread.sleep(5000);
		
		WebElement clickBack = driver
				.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Back Arrow\"]"));
		waitTime.until(ExpectedConditions.visibilityOf(clickBack));
		clickBack.click();

*/
		
//Login flow 
		System.out.println("Login Flow Started");
		
		WebElement login = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_already_have_account"));
		waitTime.until(ExpectedConditions.elementToBeClickable(login));
		login.click();

//		WebElement editcountrycode = driver.findElement(By.id("com.deepholistics.android.staging:id/country_code"));
//		editcountrycode.click();

//		WebElement searchcountry = driver.findElement(By.id("com.deepholistics.android.staging:id/search_text"));
//		searchcountry.click();
//		searchcountry.sendKeys("india");

		Thread.sleep(3000);

		
		WebElement enternumber = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/etMobileNo"));
		waitTime.until(ExpectedConditions.visibilityOf(enternumber));
		enternumber.sendKeys("7598928864");
		
		Thread.sleep(3000);
		
		WebElement getOtp = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_get_otp"));
		waitTime.until(ExpectedConditions.elementToBeClickable(getOtp));
		getOtp.click();

		Thread.sleep(3000);
		
		WebElement enterOtp = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/pinField"));
		waitTime.until(ExpectedConditions.visibilityOf(enterOtp));
		enterOtp.sendKeys("6789");
	
		WebElement continuebutton = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_otp"));
		waitTime.until(ExpectedConditions.elementToBeClickable(continuebutton));
		continuebutton.click();

		Thread.sleep(5000);
		
//Questionnaire 
		
		WebElement anthroQues=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.deepholistics.android.staging:id/iv_unlock\"])[2]"));
		waitTime.until(ExpectedConditions.elementToBeClickable(anthroQues));
		anthroQues.click();
		
		WebElement waistAns=driver.findElement(By.id("com.deepholistics.android.staging:id/answer"));
		waitTime.until(ExpectedConditions.visibilityOf(waistAns));
		waistAns.sendKeys("30");
		
		WebElement nxtQues=driver.findElement(By.id("com.deepholistics.android.staging:id/next_question"));
		waitTime.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		
		WebElement hipAns=driver.findElement(By.id("com.deepholistics.android.staging:id/answer"));
		waitTime.until(ExpectedConditions.visibilityOf(hipAns));
		hipAns.sendKeys("32");
		
//		WebElement com.deepholistics.android.staging:id/next_question
		waitTime.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		
		WebElement uChange=driver.findElement(By.id("com.deepholistics.android.staging:id/unit"));
		uChange.click();
		Thread.sleep(1000);
		
		WebElement neckkAns=driver.findElement(By.id("com.deepholistics.android.staging:id/answer"));
		waitTime.until(ExpectedConditions.elementToBeClickable(neckkAns));
		neckkAns.sendKeys("42");
		
		waitTime.until(ExpectedConditions.elementToBeClickable(nxtQues));
		nxtQues.click();
		
		WebElement subButton=driver.findElement(By.id("android:id/button1"));
		waitTime.until(ExpectedConditions.visibilityOf(subButton));
		subButton.click();

		Thread.sleep(5000);
		
		WebElement laterQuestionnaire=driver.findElement(By.id("com.deepholistics.android.staging:id/done_for_now"));
		waitTime.until(ExpectedConditions.visibilityOf(laterQuestionnaire));
		laterQuestionnaire.click();
	
		
//Food Log
		
		WebElement clickFAB = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/iv_add_type"));
		waitTime.until(ExpectedConditions.visibilityOf(clickFAB));
		clickFAB.click();

		Thread.sleep(3000);
		
		WebElement clickFood = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/food"));
		waitTime.until(ExpectedConditions.elementToBeClickable(clickFood));
		clickFood.click();

		WebElement clickBF = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/txt_lunch"));
		waitTime.until(ExpectedConditions.visibilityOf(clickBF));
		clickBF.click();
		
		WebElement clickEdit = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/tv_edit_time"));
		waitTime.until(ExpectedConditions.visibilityOf(clickEdit));
		clickEdit.click();
		
		WebElement numPickerHr=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"android:id/numberpicker_input\"))"));
		numPickerHr.click();
		numPickerHr.sendKeys("01");
		
	
//		String numTxt= numPickerHr.getText();
//		System.out.println(numTxt);
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		WebElement numPickerMin=driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"android:id/numberpicker_input\"])[2]"));
		numPickerMin.clear();
		numPickerMin.sendKeys("00");
		Thread.sleep(2000);

		
		System.out.println(numPickerMin.getText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
//		System.out.println(numPickerMin.getText());


		Thread.sleep(3000);
	
		WebElement upTime=driver.findElement(By.id("com.deepholistics.android.staging:id/btn_continue"));
		waitTime.until(ExpectedConditions.elementToBeClickable(upTime));
		upTime.click();
		
		System.out.println("Time Updated");
		
		WebElement backToHome=driver.findElement(By.id("com.deepholistics.android.staging:id/backArrow"));
		waitTime.until(ExpectedConditions.elementToBeClickable(backToHome));
		backToHome.click();
		
		

		
		
		
		
		
		
		WebElement clickProfile = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/exploreUserProfileSettingsFragment"));
		waitTime.until(ExpectedConditions.elementToBeClickable(clickProfile));
		clickProfile.click();

		Thread.sleep(3000);

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(1);"));
		
		WebElement clickLogout = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/logout"));
		waitTime.until(ExpectedConditions.elementToBeClickable(clickLogout));
		clickLogout.click();
		
		WebElement Logout = driver.findElement(AppiumBy.id("android:id/button1"));
		waitTime.until(ExpectedConditions.elementToBeClickable(Logout));
		Logout.click();

		System.out.println("Account Successfully Logged Out");

		Thread.sleep(2000);

		driver.removeApp("com.deepholistics.android.staging");

		System.out.println("App Uninstalled");

		AppiumServer.stopAppiumServer();
	}



}
