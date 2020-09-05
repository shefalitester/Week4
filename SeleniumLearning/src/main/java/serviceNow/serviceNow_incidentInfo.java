package serviceNow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonFunction.serviceNow_nG;

public class serviceNow_incidentInfo extends serviceNow_nG {

	@Test
	public void test_IncidentInformation() throws InterruptedException
	{
		//search bar type incident
		driver.findElementByXPath("//input[@id='filter']").sendKeys("incident",Keys.ENTER);
		//Create new click()
		driver.findElementByXPath("//a[@id='14641d70c611228501114133b3cc88a1']/div/div").click();
		Thread.sleep(3000);
		//switch frame
		driver.switchTo().frame("gsft_main");
		//Store the value
		String textvalue= driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println("stored value = "+textvalue);
		// Verify that value must starts with INC
		if(textvalue.startsWith("INC"))
		{
			System.out.println("number has Prefix INC ");
			}
		else {
			System.out.println("NOT prefix");
			}
		//Select caller as Abel Tuter
		driver.findElementByXPath("//button[@id='lookup.incident.caller_id']").click();
		//switch to new window
		Set <String> windowhandle = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowhandle);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.findElementByXPath("//tr[@id='row_sys_user_62826bf03710200044e0bfc8bcbe5df1']/td[3]/a").click();
		//driver.close();
		//System.out.println("Close child window");
		driver.switchTo().window(list.get(0));
		Thread.sleep(3000);
		//switch frame
		driver.switchTo().frame("gsft_main");
		// Select category as Software
		WebElement selectcategory = driver.findElement(By.id("incident.category"));
		Select sel = new Select(selectcategory);
		sel.selectByVisibleText("Software");
		//sub-category as operating system
		WebElement selectsub = driver.findElement(By.id("incident.subcategory"));
		Select selsubcat = new Select(selectsub);
		selsubcat.selectByVisibleText("Antivirus");
		//Select contact type as phone
		WebElement selectcontact= driver.findElement(By.id("incident.contact_type"));
		Select selcontact = new Select(selectcontact);
		selcontact.selectByVisibleText("Phone");
		//Enter short description
		driver.findElement(By.id("incident.short_description")).sendKeys("This is an example of service now incident short description");
		//click on submit button sysverb_insert
		driver.findElement(By.id("sysverb_insert")).click();
		//Search the stored value in step 4
		//driver.findElement(By.id("15ba24912f36101051c4f3ecf699b68f_text")).sendKeys(textvalue);
		//Thread.sleep(3000);
		WebElement search =driver.findElement(By.xpath("//span[@id='incident_hide_search']/div/div/span/span/select"));
		Select sele = new Select(search);
		WebElement opt = sele.getFirstSelectedOption();
		if(opt.getText().equals("Number")) {
			WebElement searchbox = driver.findElement(By.xpath("//div[@class='input-group']/input"));
			searchbox.sendKeys(textvalue,Keys.ENTER);			
		}
		//Click on the result 
		driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr/td[3]/a")).click();
		//Change description
		WebElement shortdesc = driver.findElement(By.id("incident.short_description"));
		shortdesc.clear();
		String str1= "Hello this is new description";
		shortdesc.sendKeys(str1,Keys.ENTER);
		//submit
		driver.findElement(By.id("sysverb_update_bottom")).click();
		//Verify if description updated successfully
		WebElement elem= driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr/td[5]"));
		String str2= elem.getText();
		if(str1.equals(str2))
		{
			System.out.println("Verified description updated");
		}
		else {
			System.out.println("Not verfified");
		}
	
	}
		
}
