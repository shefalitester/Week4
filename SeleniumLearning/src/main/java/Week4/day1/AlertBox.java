package Week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonFunction.PrePost;

public class AlertBox extends PrePost {
@Test
	public void TC001_alert() {
		
		//driver.get("https://devlabs-860f0.web.app/frame");
		
		//handle frame
		driver.switchTo().frame(0);
		
		//enter username
		driver.findElementById("username").sendKeys("admin");
		
		//enter Password
		driver.findElementById("password").sendKeys("admin");
			
		//Click on sign in
		driver.findElementByXPath("//button[@type='submit']").click();
		
		//handle alert
		Alert myalert = driver.switchTo().alert();
		
		//Print the alert text
		String str =myalert.getText();
		System.out.println(str);
		
		//click ok
		myalert.accept();
		
		//close the window
		driver.close();
	}

}
