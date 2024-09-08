package dhPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseMethods;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {

	public static AndroidDriver driver;
	
	public LoginPage(AndroidDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/txt_no_account")
	public WebElement learnMore;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/btn_get_your_token")
	public WebElement visitWebSite;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/backArrow")
	public WebElement clickBack;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/btn_already_have_account")
	public WebElement login;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/etMobileNo")
	public WebElement enternumber;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/btn_get_otp")
	public WebElement getOtp;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/pinField")
	public WebElement enterOtp;
	
	@AndroidFindBy(id = "com.mysmitch.deepholistics.staging:id/btn_otp")
	public WebElement continueButton;
	
	
	public void clickLearnMore() {
		learnMore.click();
	}
	
	public void clickVisitWebSite() {
		visitWebSite.click();
	}
	
	public void clickBackButton() {
		clickBack.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void enterMobileNumber(String mobileNumber) {
		enternumber.sendKeys(mobileNumber);
	}
	
	public void clickGetOtp() {
		getOtp.click();
	}
	
	public void enterOtpInField(String OTP) {
		enterOtp.sendKeys(OTP);
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
}
