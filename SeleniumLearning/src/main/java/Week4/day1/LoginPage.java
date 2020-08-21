package Week4.day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage {
	@ Test
	public static void testLogin() {
	
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//goto website http://www.demo.guru99.com/V4/
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		//Enter valid userId
		driver.findElementByName("uid").sendKeys("mngr275025");
		//Enter valid Password
		driver.findElementByName("password").sendKeys("zyjynev");
		//Click Login
		driver.findElementByName("btnLogin").click();
		driver.quit();
		
	}

}
