package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		//launch web browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//URL
		driver.get("https://erail.in/");
		WebElement table = driver.findElementByXPath("//table[@id='tableTopMenu']");
		WebElement datafrom = table.findElement(By.id("txtStationFrom"));
		datafrom.clear();
		datafrom.sendKeys("MAS",Keys.TAB);
		WebElement datato = table.findElement(By.id("txtStationTo"));
		datato.clear();
		datato.sendKeys("Kolkata",Keys.TAB);
		WebElement sortcheck = table.findElement(By.id("chkSelectDateOnly"));
		sortcheck.click();
		WebElement table2 = driver.findElementByXPath("//*[@id=\"divTrainsList\"]/table[1]");
		List<WebElement> rows = table2.findElements(By.tagName("tr"));
		List<String> trainnumber = new ArrayList<String>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement singlerow = rows.get(i);
			List<WebElement> td = singlerow.findElements(By.tagName("td"));
			System.out.println(td.get(0).getText());
			trainnumber.add(td.get(0).getText());	
		}
		Collections.sort(trainnumber);
		System.out.println("****************\n");
		for (String s : trainnumber) {
			System.out.println(s);				
		}
		//Click on Train - table header
		WebElement tableheader = driver.findElementByXPath("//div[@id='divTrainsListHeader']/table[1]");
		List<WebElement> row = tableheader.findElements(By.tagName("tr"));
		WebElement row1 =row.get(0);
		List<WebElement> data1=row1.findElements(By.tagName("td"));
		data1.get(0).click();




		driver.quit();



	}
}
