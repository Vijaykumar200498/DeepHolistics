package dhStepDefinition;

import java.net.MalformedURLException;

import com.base.BaseMethods;

import dhPageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef extends BaseMethods {
//	LoginPage login = new LoginPage(driver);
	
	//public static AndroidDriver driver;
	
	LoginPage login = new LoginPage(driver);
	
	
	
	@Given("Launching the app")
	public void launching_the_app() throws MalformedURLException {
	    setUp();
	}

	@And("Verify the launch")
	public void verify_the_launch() {
	    System.out.println("App Launched");
	}

	@Then("Click on Learn more button")
	public void click_on_learn_more_button() {
		login.clickLearnMore();	    
	}

	@Then("Click on Visit Website")
	public void click_on_visit_website() {
		login.clickVisitWebSite();
	}

	@Then("Navigate to Login Screen")
	public void navigate_to_login_screen() {
		login.clickBackButton();
	}

	@Given("click on login button")
	public void click_on_login_button() {
		login.clickLogin();
	}

/*	
	@Then("Select the country code")
	public void select_the_country_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

*/
	
	@And("Enter the mobile number")
	public void enter_the_mobile_number() {
	    login.enterMobileNumber("7598928864");
	}

	@And("Click on Get otp")
	public void click_on_get_otp() {
		login.clickGetOtp();
	}

	@Then("Enter the Otp into the field")
	public void enter_the_otp_into_the_field() {
	    login.enterOtpInField("OTP");
	}

	@And("Click on Continue button")
	public void click_on_continue_button() {
	    login.clickContinueButton();
	}

/*	
	@And("Verify the Home Screen Showing or Not")
	public void verify_the_home_screen_showing_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/

}
