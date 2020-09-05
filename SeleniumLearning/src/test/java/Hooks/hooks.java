package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class hooks extends DriverInstance{
	@BeforeStep
	public void beforeStep(Scenario sc) {
		System.out.println("Before Step");
//		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
//		sc.embed(screenshotAs, "image/png");		
	}
	@AfterStep
	public void afterStep(Scenario sc) {
		System.out.println("Before Step");
//		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
//		sc.embed(screenshotAs, "image/png");
		
	}
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println("Before Scenario" +sc.getName());
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev92071.service-now.com/");
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		System.out.println(sc.getName());
		
	}
	@After
	public void afterScenario(Scenario sc) {
		Type status = sc.getStatus();
		System.out.println(status);
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		driver.close();		
	}

}
