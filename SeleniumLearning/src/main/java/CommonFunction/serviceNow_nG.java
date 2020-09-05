package CommonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class serviceNow_nG {

	protected RemoteWebDriver driver;
	
	@Parameters({"url","usr","pwd"})
	@BeforeMethod
	public void startserviceNow(String url, String usr, String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		driver.get(url);
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys(usr,Keys.TAB);
		driver.findElementById("user_password").sendKeys(pwd);
		driver.findElementById("sysverb_login").click();
	}
	
	@AfterMethod
	public void CloseServiceNow()
	{
		driver.quit();
	}
}
