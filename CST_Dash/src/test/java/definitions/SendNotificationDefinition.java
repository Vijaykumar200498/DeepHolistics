package definitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import hooks.HooksCst;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesObjects.sendNotificationPage;

public class SendNotificationDefinition {

	public static WebDriver driver = HooksCst.driver;
	sendNotificationPage Send_Notification;

	// Send Notification
	@Given("Click notification button")
	public void click_notification_button() throws InterruptedException {
		System.out.println("Ready to send Notification");
		
		// driver.findElement(By.xpath("//span[text()='Notifications']")).click();
		Send_Notification = new sendNotificationPage(driver);
		Thread.sleep(2000);
		Send_Notification.clickNotification();
	}

	@And("Click on App Notification Option")
	public void click_on_App_Notification_Option() throws InterruptedException {
		// driver.findElement(By.xpath("//span[text()='App Notifications']")).click();
		Thread.sleep(2000);
		Send_Notification.clickAppNotification();
	}

	@And("Click on send notification")
	public void click_on_send_notification() throws InterruptedException {
		// driver.findElement(By.xpath("//button[@class=' mx-1 btn
		// btn-outline-primary']")).click();
		Thread.sleep(2000);
		Send_Notification.clickSendNotification();
	}

	@Given("Click the User UUID Field and enter the ID {string}")
	public void click_the_User_UUID_Field_and_enter_the_ID(String uuid) {
		//// driver.findElement(By.xpath("//input[@name='user_uuid']")).sendKeys("119");
		//Thread.sleep(5000);
		Send_Notification.EnterUUID(uuid);
	}

	@Given("Click Notification type and select the type {string}")
	public void click_Notification_type_and_select_the_type(String Type) {
		//WebElement inputField = driver.findElement(By.xpath("//input[@role='combobox']"));
		//inputField.sendKeys(Type);
		Send_Notification.SearchNotificationType(Type);
		// Thread.sleep(2000);
		//sendKeys(Keys.ARROW_DOWN);
		// Thread.sleep(2000);
		//inputField.sendKeys(Keys.ENTER);
	}

	@When("User click on the Send Notification button")
	public void user_click_on_the_Send_Notification_button() throws InterruptedException {
		//driver.findElement(By.xpath("//button[@class='my-2 btn btn-outline-success']")).click();
		Thread.sleep(2000);
		Send_Notification.SendingNotification();
		//driver.switchTo().alert().accept();
	}

//	@Then("Confirmation Alert showing for sending the notification")
//	public void confirmation_Alert_showing_for_sending_the_notification() {
//		driver.switchTo().alert().accept();
//
//	}

	@Then("Click on Yes option")
	public void click_on_Yes_option() throws InterruptedException {
		Thread.sleep(2000);
		Send_Notification.Confirmed();
		System.out.println("Manual Notification Successfully Sent");
		Thread.sleep(8000);

	}

//	@Then("End User receives the Notification in mobile")
//	public void end_User_receives_the_Notification_in_mobile() {
//
//	}
//
//	@Then("Click on Cancel Alert should close")
//	public void click_on_Cancel_Alert_should_close() {
//
//	}
//
//	@Then("Close the Notification window")
//	public void close_the_Notification_window() {
//
//		driver.close();
//
//	}

}
