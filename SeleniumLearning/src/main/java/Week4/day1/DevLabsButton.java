package Week4.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import CommonFunction.DevLabButtonNg;

public class DevLabsButton extends DevLabButtonNg{

	@Test
	public void test_Button(){
		Point p = driver.findElementById("button1").getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		WebElement btn = driver.findElementById("button3");
		String color = btn.getCssValue("background-color");
		System.out.println(color);
		
		
	}
}
