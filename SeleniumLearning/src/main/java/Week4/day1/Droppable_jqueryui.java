package Week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonFunction.testng_1;

public class Droppable_jqueryui extends testng_1 {

	@Test
	public void test_droppable() throws InterruptedException {
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		if(actual_title.equals("Droppable | jQuery UI"))
		{
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test Fail");
		}

		//switch to frame
		driver.switchTo().frame(0);

		//thread sleep
		Thread.sleep(3000);

		//drag n drop element
		WebElement drag_box = driver.findElementByXPath("//div[@id='draggable']");
		WebElement target = driver.findElementById("droppable");

		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag_box, target).perform();
	}

}
