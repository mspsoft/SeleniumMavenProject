package cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class TestSteps {
	public static WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()throws Throwable{
		System.setProperty("webdriver.gecko.driver", "C:\\Confidential\\Automation\\Tools\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
		}
}
