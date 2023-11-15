package seleniumPack1;

import java.awt.Window;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		
		
		//driver.switchTo().frame("frame1");  //using id 
		//driver.switchTo().frame(0);  //
		
		WebElement frame = driver.findElement(By.xpath("//input[@type='text']"));
		frame.sendKeys("not a easy topic");
		
		driver.switchTo().parentFrame();  // it goes to before frame
		
		
//		driver.switchTo().defaultContent(); // first page where you started
		 driver.findElement(By.xpath("//b[text()='Selenium']")).click();
		 
	}




}
