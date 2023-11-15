package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExector {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		
		WebElement we = driver.findElement(By.id("email"));
		WebElement we1 = driver.findElement(By.xpath("(//button)[1]"));
		
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

		js.executeScript("arguments[0].setAttribute('style','background:red;border:3px solid blue')", we,we1);
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].setAttribute('value','selenium')", we,we1);
		
		Object es = js.executeScript("return arguments[0].getAttribute('value')",we,we1);
		System.out.println(es);
		
		Thread.sleep(2000);
		
		Object es1 = js.executeScript("arguments[1].click()",we,we1);
		
		
		
	
	
	
	}
	

}
