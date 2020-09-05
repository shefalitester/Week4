package CommonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PrePost {
	
	protected RemoteWebDriver driver;
	@Parameters({"url1"})
	@BeforeMethod
	public void startApp(String url1) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url1);
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
