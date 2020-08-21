package Week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazon_mobile {

	public static void main(String[] args) throws InterruptedException {
		//launch web browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//URL
		driver.navigate().to("https://www.amazon.com/");
		//enter onePlus in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus",Keys.ENTER);
		//Verify title has onePlus
		String title = driver.getTitle();
		if(title.contains("oneplus"))	
				{
				System.out.println("Contains OnePlus");
				}
		//Click on the first result link
		driver.findElement(By.cssSelector("a.a-link-normal span.a-size-medium")).click();
		Thread.sleep(3000);
		//Print the title
		System.out.println(driver.getTitle());
	
		//Go back to the previous page
		driver.navigate().back();
		Thread.sleep(5000);
		//Verify that in search box "onePlus" is present		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		String oneplus= searchbox.getAttribute("value");
		if(oneplus.equalsIgnoreCase("OnePlus"))
		{
			System.out.println(oneplus);
			System.out.println("Verified.... searchbox");
		}
		else {
			System.out.println(oneplus);
			System.out.println("Failed");
		}
		//Clear and search for samsung and enter
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung",Keys.ENTER);
		//Select Price high to low in the sort by dropdown
		WebElement ele = driver.findElementById("s-result-sort-select");
		Select price = new Select(ele);
		List<WebElement> priceopt = price.getOptions();
		for (WebElement opt : priceopt) {
			if(opt.getText().contains("High to Low"))
			{
				opt.click();
			}
		}
		driver.quit();
	

	}

}
