package Week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
				//launch chrome browser
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				// maximize the window
				driver.manage().window().maximize();
				//open the url
				driver.get("https://devlabs-860f0.web.app/table");
				WebElement table = driver.findElementById("table");
				List<WebElement> rows=  table.findElements(By.tagName("tr"));
				int n =rows.size();
				for(int i=0; i<rows.size();i++)
				{
					WebElement oneRow = rows.get(i);
					List<WebElement> datas = oneRow.findElements(By.tagName("td"));
					WebElement td = datas.get(0);
					if(td.equals("Yashwanth"))
							{
								
//						      WebElement tdlast = driver.findElementByXPath("//input[@id='first']").click();
//						      datas.set(2,tdlast);
						      
						      datas.get(3).findElement(By.xpath("//input[@id='first']")).click();
						      
							}
					
				}
	}

}
