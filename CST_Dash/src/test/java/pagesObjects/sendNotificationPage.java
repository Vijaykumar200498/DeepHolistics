package pagesObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sendNotificationPage {
	
	public WebDriver driver; // WebDriver instance

	public sendNotificationPage(WebDriver driver) { // constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // this refers to the current class we can also use loginPage.class
	}
	
	@FindBy(xpath = "//span[text()='Notifications']")
	@CacheLookup
	private WebElement Notification;
	
	
	@FindBy(xpath = "//span[text()='App Notifications']")
	@CacheLookup
	private WebElement AppNotification;
	
	@FindBy(xpath = "//button[@class=' mx-1 btn btn-outline-primary']")
	@CacheLookup
	private WebElement SendNotification;
	
	@FindBy(xpath = "//input[@name='user_uuid']")
	@CacheLookup
	private WebElement EnterUUID;
	
	@FindBy(xpath = "//input[@role='combobox']")
	@CacheLookup
	private WebElement SearchNotificationType;
	
	@FindBy(xpath = "//button[@class='my-2 btn btn-outline-success']")
	@CacheLookup
	WebElement SendingNotification;
	
	@FindBy(xpath = "//button[text()='Yes, Send']")
	@CacheLookup
	WebElement Confirmed;
	
	public void clickNotification() {
		Notification.click();
	}
	
	public void clickAppNotification() {
		AppNotification.click();
	}
	
	public void clickSendNotification() {
		SendNotification.click();
	}
	
	public void EnterUUID(String uuid) {
		EnterUUID.sendKeys(uuid);
	}
	
	public void SearchNotificationType(String Type) {
		SearchNotificationType.sendKeys(Type);
		SearchNotificationType.sendKeys(Keys.ARROW_DOWN);
		SearchNotificationType.sendKeys(Keys.ENTER);
	}
	
	public void SendingNotification() {
		SendingNotification.click();
	}
	
	public void Confirmed() {
		Confirmed.click();
	}
	
	
	
	
}
