package Week4.day1;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonFunction.PrePost;

public class DragandDrop extends PrePost {
	@Test
	public void TC002_draggable() throws InterruptedException {
		
		//open the url
		//driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		
		//find element
		WebElement source = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		Point location = source.getLocation();
		int x = location.getX();
		int y = location.getY();
		builder.dragAndDropBy(source, 20+x, 40+y).perform();
		
		
		
	}

}
