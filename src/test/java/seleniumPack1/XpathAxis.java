package seleniumPack1;



	import java.util.Set;

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class XpathAxis {
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='✕']")).click();
			
			driver.findElement(By.xpath("//a[@aria-label='Mobiles']")).click();	
			
//			WebElement abs = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div//a[2]"));
//	        abs.click();
			
			WebElement el = driver.findElement(By.xpath("//span[contains(text(), 'Electronics')]"));
			
			Actions ac =new Actions(driver);
			ac.moveToElement(el).build().perform();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Mi']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@class,'4rR01T')]")).click();
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@class,'4rR01T')]")).click();
			
		
			}
			
		}
	

	

