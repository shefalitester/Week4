package Week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonFunction.DevLab_testNg;

public class exampleDevlab_edit extends DevLab_testNg {
	
	@Test
	public void test_edit()
	{
		driver.findElementById("fullName").sendKeys("Shefali Saxena",Keys.TAB);
		WebElement joinbox = driver.findElementById("join");
		String str1=joinbox.getAttribute("value");
		String str2 = str1 + "Tester";
		joinbox.sendKeys(str2,Keys.TAB);
		String str = driver.findElementById("getMe").getAttribute("value");
		System.out.println(str);
		driver.findElementById("clearMe").clear();
		WebElement disabletext = driver.findElementById("noEdit");
		if(!disabletext.isEnabled())
		{
			System.out.println("Confirms..... is disable");
		}
		else
		{
			System.out.println("False");
		}
	}

}
