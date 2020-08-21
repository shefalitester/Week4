package Week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//open the url
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("Click Here").click();
		Set <String> windowhandle = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowhandle);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.close();
		//driver.quit();
		
		
	}

}

