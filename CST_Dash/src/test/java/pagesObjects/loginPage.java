package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage{ //extends BaseMethods {

	public WebDriver driver; // WebDriver instance

	public loginPage(WebDriver driver) { // constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // this refers to the current class we can also use loginPage.class
	}

	@FindBy(xpath = "//input[@id='formBasicEmail']")
	@CacheLookup // Instruct the initElements() method to cache the element once its located, Avoid stale element exception,no element exception
	 private WebElement email;

	@FindBy(xpath = "//input[@id='formBasicPassword']")
	@CacheLookup
	private WebElement pass;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	private WebElement signin;

	public void setEmail(String Email) {
		email.sendKeys(Email);
	}

	public void setPass(String Password) {
		pass.sendKeys(Password);
	}

	public void setClick() {
		signin.click();
	}

}

/*
 * public WebElement getEmail() { return email; }
 * 
 * public WebElement getPass() { return pass; }
 * 
 * public WebElement getClick() { return signin; }
 * 
 * 
 */

// private WebElement email , pass, signin;
