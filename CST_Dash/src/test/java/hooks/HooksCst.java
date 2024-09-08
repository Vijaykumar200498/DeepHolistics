package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksCst{

	public static WebDriver driver;

	@BeforeAll
	public static void setUp() {

		//driver = BaseMethods.setProperty();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//WebDriverWait

		driver.get("https://deep-holistics-dashboard-stg.netlify.app/login");
		System.out.println(driver.getTitle());
	}

	@AfterAll
	public static void teardown() {

		System.out.println("Browser closed Successfully");

		driver.quit();
	}

}
