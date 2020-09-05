/**
 * 
 */
package CommonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * @author shefa
 *
 */
public class testng_1 {
	
	protected RemoteWebDriver driver;
	
	@Parameters({"url"})
	@BeforeMethod
	public void first(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		driver.get(url);
				//"https://www.verizonwireless.com/?intcmp=vzwdom");
	}
	
	@AfterMethod
	public void last()
	{
		driver.quit();
	}
	

}
