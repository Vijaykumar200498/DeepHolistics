package definitions;

import org.openqa.selenium.WebDriver;

import com.base.BaseMethods;

import hooks.HooksCst;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesObjects.loginPage;

public class LoginDefinition extends BaseMethods{

	//WebDriver driver = null;
	public static WebDriver driver = HooksCst.driver;  //object to object declaration
	loginPage Log_in; // = new loginPage(driver); // create object instance
	
	@Given("User navigates to the CST Dashboard")
	public void userNavigatesToTheCSTDashboard() {
		//System.out.println(driver.getTitle());

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		// WebDriverManager.edgedriver().setup();
		// driver =new EdgeDriver();

		// driver.manage().window().maximize();
		//driver.get("https://deep-holistics-dashboard-stg.netlify.app/login");
		//System.out.println(driver.getTitle());
	}

	@And("User enters the valid Email id {string}")
	public void userEntersTheValidEmailId(String Email) throws InterruptedException {
		 
		Log_in = new loginPage(driver); //create instance
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementId")));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		if (Log_in == null) {
//	        throw new IllegalStateException("LoginPage object is not initialized");
//	    }		
		Log_in.setEmail(Email);

		 //Log_in = new loginPage(driver); //create instance

		// WebElement email =
		// driver.findElement(By.xpath("//input[@id='formBasicEmail']"));
		// email.sendKeys(Email);
		// sendkeys(email,"csttool@yopmail.com");
	}

	@And("User enters the valid Password {string}")
	public void userEntersTheValidPassword(String pass) {
		Log_in.setPass(pass);

		// WebElement pass =
		// driver.findElement(By.xpath("//input[@id='formBasicPassword']"));
		// pass.sendKeys(Password);
	}

	@When("User clicks on the signin button")
	public void userClicksOnTheSigninButton() {
		Log_in.setClick();

		// WebElement signin = driver.findElement(By.xpath("//button[@type='button']"));
		// signin.click();
	}

	@Then("User entering into the dashboard")
	public void userEnteringIntoTheDashboard() throws InterruptedException {
		System.out.println("Dashboard loaded Successfully");
		Thread.sleep(5000);
		// driver.quit();
	}
/*	
	@After
	public void teardown() {

		System.out.println("Browser closed Successfully");

		driver.quit();
	}
*/
}
