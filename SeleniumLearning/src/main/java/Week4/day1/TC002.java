/*1.	Goto http://automationpractice.com/index.php
	Click on sign in
	Enter email
	Enter password
	click on sign in
	validate page title must contains My account
	Click on My Personal information
	Click on update
	Change your password
	click save
	Validate update successful message as "Your personal information has been successfully updated."
	sign out */


package Week4.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002 {
	@Test
	public void testSecond() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//open the url
		driver.get("http://automationpractice.com/index.php");
		
		//Click on sign in
		driver.findElementByLinkText("Sign in").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter email
		driver.findElementById("email").sendKeys("coolrandomcoder4@gmail.com");
		
		//enter password
		driver.findElementById("passwd").sendKeys("abc@123");
		
		//click on sign in
		driver.findElementById("SubmitLogin").click();
		
		//validate page title must contains My account
		String title = driver.getTitle();
		if(!title.contains("My account"))
			//Fail
		{ System.out.println("Page title doesn't contains \"My account\" ");
		//driver.quit();
		}
		
		else
		{
			//Pass
		    System.out.println("Page title contains \"My account\" ");
		    
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElementByXPath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a");
	                    	               
		  //Click on My Personal information
	        Element.click();
		    
		  //Click on update
		  //Change your password
		  driver.findElementById("old_passwd").sendKeys("abc@123");
		  
		  //
		  driver.findElementById("passwd").sendKeys("123@abc");
		  driver.findElementById("confirmation").sendKeys("123@abc");
		  
		  //click save
		  driver.findElementByXPath("//button[@name='submitIdentity']").click();
		  
		  //Validate update successful message as "Your personal information has been successfully updated."
		  //driver
		  String str = driver.findElementByXPath("//*[@id=\"center_column\"]/div/p").getText();
		  if(str.equals("Your personal information has been successfully updated."))
		  {//pass
			  System.out.println("Pass");
			  
		  }
		  
		  //sign out
		  driver.findElementByLinkText("Sign out").click();
		
		}
		
		    
		
		

	}


