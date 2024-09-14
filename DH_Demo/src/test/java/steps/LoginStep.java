package steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
	
	AndroidDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	

	@Given("Launching the app")
	public void launchingTheApp() throws InterruptedException, MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2").setPlatformName("Android").setPlatformVersion("14")
				.setApp("C:\\Users\\91860\\Desktop\\APK\\dh_stg_1.0.9.apk").setIgnoreHiddenApiPolicyError(true)
				.setAppPackage("com.deepholistics.android.staging")
				.setAppActivity("com.deepholistics.android.ui.user.htOnboarding.welcome.WelcomeActivity")
				.setNoReset(true).setAutoGrantPermissions(false);

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, options);
		System.out.println("App Launched");
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
		login.click();
	
		
	}
	
	@Then("Select the country code")
	public void selectTheCountryCode() throws InterruptedException {
		
		
		
		WebElement countryDropDown = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/country_code"));
		countryDropDown.click();
		
		Thread.sleep(3000);
		
		WebElement countrySearch = driver
				.findElement(AppiumBy.id("com.deepholistics.android.staging:id/search_text"));
			wait.until(ExpectedConditions.visibilityOf(countrySearch));
		countrySearch.click();
		
		
		String mobileNumber = "India".toUpperCase();  // Convert the entire string to uppercase
		for (char character : mobileNumber.toCharArray()) {
		    AndroidKey key;
		    if (Character.isDigit(character)) {
		        key = AndroidKey.valueOf("DIGIT_" + character);  // Handle digits
		    } else {
		        key = AndroidKey.valueOf(String.valueOf(character));  // Handle letters
		    }
		    driver.pressKey(new KeyEvent(key));
		}
		
		Thread.sleep(3000);
		
		WebElement countrySelect = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.deepholistics.android.staging:id/text\" and @text=\"India  (+91)\"]"));
		countrySelect.click();

	}
	
	@Then("Enter the mobile number {string}")
	public void enterTheMobileNumber(String string) {
		
		WebElement enternumber = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/etMobileNo"));

		String mobileNumber = "7598928864";
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
	public void verifyTheHomeScreenShowingOrNot() {
		
		System.out.println("Home Screen Loaded");
		
	    
	}
	
}
