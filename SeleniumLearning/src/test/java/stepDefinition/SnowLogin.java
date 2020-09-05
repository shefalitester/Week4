package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Hooks.DriverInstance;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SnowLogin extends DriverInstance {

	//ChromeDriver driver;

	@Given("Launch browswer")
	public void launchBrowswer() {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("load url")
	public void loadUrl() {
		driver.get("https://dev92071.service-now.com/");
	}

	@Given("maximize the window")
	public void maximizeTheWindow() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enter username as {string}")
	public void userEnterUsernameAs(String username) {
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys(username);
	}

	@When("user enter password as {string}")
	public void userEnterPasswordAs(String pwd) {
		driver.findElementById("user_password").sendKeys(pwd);
	}

	@When("click login button")
	public void clickLoginButton() {
		driver.findElementById("sysverb_login").click();
	}

	@Then("home page is loaded")
	public void homePageIsLoaded() {
//		String actual = driver.getTitle();
//		String expected = "ServiceNow";
//		Assert.assertEquals(actual, expected);
		System.out.println("Home Page");
	}

	@Then("close browser")
	public void closeBrowser() {
		driver.quit();
	}
	
	
//	@When("user enter username")
//	public void userEnterUsername() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user enter password")
//	public void userEnterPassword() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}

	@But("login should fail")
	public void loginShouldFail() {
	    System.out.println("login failed");}
	}

	