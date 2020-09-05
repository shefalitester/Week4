package serviceNow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonFunction.serviceNow_nG;

public class UI_validation_ServiceNow extends serviceNow_nG{
	
	@Test
	public void test_UIvalidation() throws InterruptedException
	{
		
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident",Keys.ENTER);
		driver.findElementByXPath("//*[@id='b55b4ab0c0a80009007a9c0f03fb4da9']/div/div").click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame("gsft_main");
		Thread.sleep(3000);
		WebElement ele =driver.findElement(By.id("sysverb_new"));
		if(ele.isEnabled())
		{System.out.println("yes able to see the New button");}
		else
		{System.out.println("Not able to see the New button");}
		WebElement search =driver.findElement(By.xpath("//span[@id='incident_hide_search']/div/div/span/span/select"));
		if(search.isEnabled())
		{
			System.out.println("Yes able to see the dropdown of Search");
			}
		else {System.out.println("Not able to see the dropdown of Search");}
		Select sel = new Select(search);
		WebElement opt = sel.getFirstSelectedOption();
		if(opt.getText().equals("Number")) {
			System.out.println("Yes by default 'Number' selected in dropdown");
		}
		else {
			System.out.println("No, by default Number should be selected in dropdown");
		}
		WebElement sbox= driver.findElement(By.xpath("//div[@class='input-group']/input"));
		String str =sbox.getAttribute("placeholder");
		System.out.println(str);
		WebElement table = driver.findElement(By.xpath("//table[@id='table_clone']"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement singlerow = rows.get(0);
		List<WebElement> th = singlerow.findElements(By.tagName("th"));
			System.out.println("th= "+ th.size());
			for (int i = 1; i < 4; i++) {
				int j=i+1;
				WebElement rowhead = th.get(i).findElement(By.xpath("//*[@id=\"hdr_incident\"]/th["+(j+1)+"]/span/a"));
				System.out.println(rowhead.getText());
			}

	}
}
