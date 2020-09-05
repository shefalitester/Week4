package serviceNow;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonFunction.serviceNow_nG;

public class LaunchInstance extends serviceNow_nG{
	
	@Test
	public void test_servicenow1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident",Keys.ENTER);
		driver.findElementByXPath("//a[@id=\"14641d70c611228501114133b3cc88a1\"]/div/div").click();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement ele =driver.findElementById("incident.number");
		String text = ele.getAttribute("value");
		if(text.startsWith("INC"))
		{
			System.out.println("Verified ....starts with INC");
		}
		else {
			System.out.println("Fail");
		}
		//driver.findElementById("sysverb_insert").click();
	
	}
	

}
