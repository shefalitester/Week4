package Week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonFunction.testng_1;

public class Practice1_verizon extends testng_1 {
	
	@Test
		public void test_Verizon()  {

		
		//click on Sign in
		driver.findElementByXPath("//*[@id=\"gnav20-sign-id\"]/span/span").click();



	}
}
