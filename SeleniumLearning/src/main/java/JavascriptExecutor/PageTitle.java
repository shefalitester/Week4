package JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTitle {
	ChromeDriver driver;
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	 public void pagetitle()
	 {
		driver.get("https://www.naukri.com/");
		Object text = driver.executeScript("return document.title");
		System.out.println("Page Title: "+text);
	}
	
	@AfterMethod
	public void after() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	

}
