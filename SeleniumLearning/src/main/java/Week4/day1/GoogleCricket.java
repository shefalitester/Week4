package Week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleCricket {
	@ Test
	public void testCricket() {
				//launch chrome browser
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				//open the url
				driver.get("https://www.google.com/");
				driver.findElementByName("q").sendKeys("cricket",Keys.ENTER);
				List<WebElement> cricket = driver.findElementsByXPath("//*[contains(text(),'cricket')or contains(text(),'Cricket')]");
				System.out.println(cricket.size());
				driver.quit();
				
	}

}
