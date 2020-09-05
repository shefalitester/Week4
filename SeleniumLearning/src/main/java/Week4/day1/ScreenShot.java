package Week4.day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open the url
		driver.get("https://www.facebook.com/");
		//screenshot
		File screenshotas = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/img1.png");
		try {
			FileHandler.copy(screenshotas, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement btn = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		File screen = btn.getScreenshotAs(OutputType.FILE);
		File file2 = new File("./snaps/img2.png");
		try {
			FileHandler.copy(screen, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
