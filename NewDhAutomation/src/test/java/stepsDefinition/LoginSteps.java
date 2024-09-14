package stepsDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	AndroidDriver driver;


	@Given("Launching the app")
	public void launching_the_app() throws MalformedURLException  {
		
			System.out.println("App Launched");
	}

	@And("Verify the launch")
	public void verify_the_launch() {

		WebElement learnMore = driver.findElement(AppiumBy.id("com.deepholistics.android.staging:id/txt_no_account"));
		String text = learnMore.getText();
		System.out.println(text);
		learnMore.click();
		System.out.println("Test2");

	}
	
	
	@Then("Click on Learn more button")
	public void click_on_learn_more_button() {
		System.out.println("Test3");
	}

	@Then("Click on Visit Website")
	public void click_on_visit_website() {
		System.out.println("Test4");
	}

	@Then("Navigate to Login Screen")
	public void navigate_to_login_screen() {
		System.out.println("Test5");
	}

	@Given("click on login button")
	public void click_on_login_button() {
		System.out.println("Test6");
	}

	@Given("Enter the mobile number {string}")
	public void enter_the_mobile_number(String string) {
		System.out.println("Test7");
	}

	@Given("Click on Get otp")
	public void click_on_get_otp() {
		System.out.println("Test8");
	}

	@Then("Enter the Otp into the field {string}")
	public void enter_the_otp_into_the_field(String string) {
		System.out.println("Test9");
	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {
		System.out.println("Test10");
	}

}
