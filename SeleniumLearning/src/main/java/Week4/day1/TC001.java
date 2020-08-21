package Week4.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class TC001 {
	@Test
	public void testfirst() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//open the url
		driver.get("http://automationpractice.com/index.php");
		
		//click sign-in
		driver.findElementByLinkText("Sign in").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter your email address
		driver.findElementById("email_create").sendKeys("coolrandomcoder4@gmail.com");
		
		//Click on create account
		driver.findElementById("SubmitCreate").click();
		
		//Fill all your details
		//title(mr./mrs. radio button)
		driver.findElementById("id_gender2").click();
		
		//Enter First name 
		driver.findElementById("customer_firstname").sendKeys("Shefali");
		
		//enter last name
		driver.findElementById("customer_lastname").sendKeys("Saxena");
		
		//enter email
		String email = driver.findElementById("email").getAttribute("value");
		String email_entered = "coolrandomcoder3@gmail.com";
		if (email.equals(email_entered))
		{	System.out.println(email +"\t"+ email_entered );
		driver.findElementById("email").click();}
		
		//enter password
		driver.findElementById("passwd").sendKeys("abc@123");
		
		//select dob
		WebElement selday = driver.findElementById("days");
		Select sel = new Select(selday);
		sel.selectByValue("2");
		
		Select selmonth = new Select(driver.findElementById("months"));
		selmonth.selectByValue("8");
		
		Select selyear = new Select(driver.findElementById("years"));
		selyear.selectByValue("1998");
		
		//check checkbox
		driver.findElementById("newsletter").click();
		
		//enter company
		driver.findElementById("company").sendKeys("ABZ 121");
		
		//enter Address
		driver.findElementById("address1").sendKeys("XYZ street, PQR");
		
		//enter city
		driver.findElementById("city").sendKeys("Boston");
		
		//enter State
		WebElement state = driver.findElementById("id_state");
		Select selstate = new Select(state);
		selstate.selectByIndex(22);
		
		//enter zipcode
		driver.findElementById("postcode").sendKeys("02123");
		
		//enter country
		WebElement country = driver.findElementById("id_country");
		Select selcountry = new Select(country);
		selcountry.selectByValue("21");
		
		//Enter mobile number
		driver.findElementById("phone_mobile").sendKeys("210-399-6598");
		
		//Enter Address alias
		driver.findElementById("alias").sendKeys("My address");
		
		//click submit button
		driver.findElementById("submitAccount").click();
		
		//once registration is successful
		if(driver.getTitle()=="My account - My Store")
		{System.out.println("Successful registration");
		
		}
		//signout
		driver.findElementByLinkText("Sign out").click();

		}
}
