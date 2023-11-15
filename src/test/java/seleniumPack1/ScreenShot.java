package seleniumPack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.id("email"));
		
		user.sendKeys("selenium");
		WebElement we = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

		
		
		
	
	
		
		js.executeScript("arguments[0].scrollIntoView(true) ", we);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false) ", user);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\KASI\\Pictures\\Screenshots\\selenium\\f1.png");
		FileUtils.copyFile(src, desc);
		
		
		
		
		
	}
	

}
