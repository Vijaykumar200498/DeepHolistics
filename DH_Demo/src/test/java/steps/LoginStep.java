package steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import drivers.DriverInstance;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep extends DriverInstance {

	// wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Given("Launching the app")
	public void launchingTheApp() throws InterruptedException, MalformedURLException {
		/*
		 * UiAutomator2Options options = new UiAutomator2Options();
		 * options.setAutomationName("UiAutomator2").setPlatformName("Android").
		 * setPlatformVersion("14")
		 * .setApp("C:\\Users\\91860\\Desktop\\APK\\dh_stg_1.0.9.apk").
		 * setIgnoreHiddenApiPolicyError(true)
		 * .setAppPackage("com.deepholistics.android.staging") .setAppActivity(
		 * "com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity")
		 * .setNoReset(true).setAutoGrantPermissions(false);
		 * 
		 * URL url = new URL("http://127.0.0.1:4723/"); driver = new AndroidDriver(url,
		 * options);
		 */
		System.out.println("App Launched Successfully");
		Thread.sleep(5000);
	}

	@Given("Verify the launch")
	public void verifyTheLaunch() {

		String currentActivity = driver.currentActivity();
		System.out.println("Current activity: " + currentActivity);

		String expectedActivity = "com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity";

		if (currentActivity.equals(expectedActivity)) {
			System.out.println("You Can Click Learn More Button");
		} else {
			System.out.println("Expected activity is NOT present.");
		}

	}

	@Then("Click on Learn more button")
	public void clickOnLearnMoreButton() {

		WebElement learnMore = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/txt_no_account"));
		learnMore.click();
		System.out.println("Learn More Clicked");

/*		try {
			WebElement VerifyText = driver
					.findElement(AppiumBy.id("//android.widget.TextView[@text=\"Deep Holistic View of You\"]"));
			if (VerifyText.isDisplayed()) {
				System.out.println("Element is present and visible on the screen.");
				System.out.println(VerifyText.getText());
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present on the screen.");
		}
*/
	}

	@Then("Click on Visit Website")
	public void clickOnVisitWebsite() {

		WebElement visitWebSite = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Visit Website\"]"));
		visitWebSite.click();

		System.out.println("Explore more about DH");

	}

	@Then("Navigate to Login Screen")
	public void navigateToLoginScreen() {

		driver.navigate().back();

		WebElement clickBack = driver.findElement(AppiumBy.accessibilityId("Back Arrow"));
		clickBack.click();

		System.out.println("Login Flow Started");

	}

	@Given("click on login button")
	public void clickOnLoginButton() {

		WebElement login = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_already_have_account"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();

	}

	@Then("Select the country code")
	public void selectTheCountryCode() throws InterruptedException {

		Thread.sleep(3000);

		WebElement countryDropDown = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/country_code"));
		countryDropDown.click();

		Thread.sleep(3000);

		WebElement countrySearch = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/search_text"));
		wait.until(ExpectedConditions.visibilityOf(countrySearch));
		countrySearch.click();

		String mobileNumber = "India".toUpperCase(); // Convert the entire string to uppercase
		for (char character : mobileNumber.toCharArray()) {
			AndroidKey key;
			if (Character.isDigit(character)) {
				key = AndroidKey.valueOf("DIGIT_" + character); // Handle digits
			} else {
				key = AndroidKey.valueOf(String.valueOf(character)); // Handle letters
			}
			driver.pressKey(new KeyEvent(key));
		}

		Thread.sleep(3000);

		WebElement countrySelect = driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@resource-id=\"com.deepholistics.android.staging:id/text\" and @text=\"India  (+91)\"]"));
		countrySelect.click();

	}

	@Then("Select the country code1")
	public void selectTheCountryCode1() throws InterruptedException {

		Thread.sleep(3000);

		WebElement countryDropDown = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/country_code"));
		countryDropDown.click();

		Thread.sleep(3000);

		WebElement countrySearch = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/search_text"));
		wait.until(ExpectedConditions.visibilityOf(countrySearch));
		countrySearch.click();

		String mobileNumber = "United Kingdom".toUpperCase(); // Convert the entire string to uppercase
		for (char character : mobileNumber.toCharArray()) {
			AndroidKey key;
			if (Character.isDigit(character)) {
				key = AndroidKey.valueOf("DIGIT_" + character); // Handle digits
			}  else if (Character.isLetter(character)) {
		        key = AndroidKey.valueOf(String.valueOf(character));
		    } else if (character == ' ') {
		        // Handle space
		        key = AndroidKey.SPACE;
		    } else {
		        // Handle special cases if needed (punctuation, symbols, etc.)
		        System.out.println("Unsupported character: " + character);
		        continue; // Skip unsupported characters
		    }
			driver.pressKey(new KeyEvent(key));
		}

		Thread.sleep(3000);

		WebElement countrySelect = driver.findElement(AppiumBy
				.xpath("//android.widget.TextView[@resource-id=\"com.deepholistics.android.staging:id/text\"]"));
		countrySelect.click();
	}

	@Then("Enter the mobile number {string}")
	public void enterTheMobileNumber(String string) {

		WebElement enternumber = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/etMobileNo"));

		String mobileNumber = string;
		for (char digit : mobileNumber.toCharArray()) {
			driver.pressKey(new KeyEvent(AndroidKey.valueOf("DIGIT_" + digit)));
		}
	}

	@Then("Click on Get otp")
	public void clickOnGetOtp() throws InterruptedException {

		Thread.sleep(3000);

		WebElement getOtp = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_get_otp"));
		getOtp.click();

	}

	@Then("Enter the Otp into the field {string}")
	public void enterTheOtpIntoTheField(String string) {

		WebElement enterOtp = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/pinField"));
		String otp = "6789";
		enterOtp.sendKeys(otp);

	}

	@Then("Click on Continue button")
	public void clickOnContinueButton() {

		WebElement continuebutton = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/btn_otp"));
		continuebutton.click();

	}

	@Then("Verify the Home Screen Showing or Not")
	public void verifyTheHomeScreenShowingOrNot() throws InterruptedException {
		
		Thread.sleep(5000);
		System.out.println("Home Screen Loaded");
		WebElement UserName = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/tv_name"));
		wait.until(ExpectedConditions.visibilityOf(UserName));
		System.out.println(UserName.getText());

		// driver.quit();

	}

	@Given("Click on profile from tab bar")
	public void clickOnProfileFromTabBar() {
		WebElement clickProfile = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/profileComposeFragment"));
		wait.until(ExpectedConditions.elementToBeClickable(clickProfile));
		clickProfile.click();
	}

	@Then("Swipedown to find the logout button and click")
	public void swipedownToFindTheLogoutButtonAndClick() {
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(1);"));

		WebElement clickLogout = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Log out\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickLogout));
		clickLogout.click();
	}

	@Then("Check the Logout alert")
	public void checkTheLogoutAlert() {

		 WebElement AlertTitle =
		 driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/alertTitle"));

		String ATitle = AlertTitle.getText();
		System.out.println("Alert: " + ATitle);
		
		String expectedTitle = "Log out";
		Assert.assertEquals(ATitle, expectedTitle);
		
	}

	@Then("click on yes")
	public void clickOnYes() {
		WebElement Logout = driver.findElement(AppiumBy.id("android:id/button1"));
		wait.until(ExpectedConditions.elementToBeClickable(Logout));
		Logout.click();
		driver.quit();

	}

}
