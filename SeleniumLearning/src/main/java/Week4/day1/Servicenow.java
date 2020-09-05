package Week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Servicenow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//open url
		driver.get("https://dev62378.service-now.com/");
		Thread.sleep(3000);
//		WebElement ele=driver.findElementByXPath("//input[@id='user_name']");
//		ele.click();
//		ele.sendKeys("shefali16nov@gmail.com",Keys.TAB);
//		driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123",Keys.TAB);
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident",Keys.ENTER);
	}

}
