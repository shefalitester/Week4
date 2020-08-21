package Week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		List<String> li = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();

		//open the URL
		driver.get("https://devlabs-860f0.web.app/advanced-web-tables");
		//to find table
		WebElement table = driver.findElementByXPath("//table[@class='mat-sort']");
		//to find row
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			WebElement irow = rows.get(i);			
			//getting td of particular row
			List<WebElement> data = irow.findElements(By.tagName("td"));
			WebElement td = data.get(0);
			//copy list to another list
			li.add(td.getText());
		}
		System.out.println("\n******Print copied list********");
		for (String dessert : li){
			System.out.println(dessert);
		}
		//sort list
		for (int i = 1; i < li.size(); i++){
			li.sort(String.CASE_INSENSITIVE_ORDER);
		}
		System.out.println("\n*******Print sorted list*****");
		for (String dessert : li){
			System.out.println(dessert);
		}
		//driver.findElementByXPath("*[@id=\"mlpok\"]/table/tr[1]/th[1]/div/div").click();
		List<WebElement> thead = table.findElements(By.tagName("th"));
		WebElement th =thead.get(0);
		th.click();

		//copy dessert list to another
		WebElement table2 = driver.findElementByXPath("//table[@class='mat-sort']");
		//to find row
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			WebElement jrow = row.get(i);			
			//getting td of particular row
			List<WebElement> data2 = jrow.findElements(By.tagName("td"));
			WebElement tds = data2.get(0);
			//copy list to another list
			l2.add(tds.getText());
		}

		System.out.println("\n******Print  2nd copied list********");
		for (String dessert : l2){
			System.out.println(dessert);
		}

		if(li.equals(l2))
		{
			System.out.println("******same list");
		}

		driver.quit();
	}
}
