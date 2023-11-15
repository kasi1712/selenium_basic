package seleniumPack1;

import java.io.Serial;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
		WebElement el = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions ac =new Actions(driver);
		ac.moveToElement(el).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div [text()='Xiaomi 12 Pro 5G (Noir Black, 256 GB)']")).click();

	
		Thread.sleep(3000);
		
		String parent=driver.getWindowHandle();
		
		Set<String> child =driver.getWindowHandles();

		
		for(String x : child) {
			if(!x.equals(parent)) {
				driver.switchTo().window(x);
			}
		}
		
		WebElement price = driver.findElement(By.xpath("//div[text()='₹41,999']"));
		System.out.println(price.getText());
		
		
}
}
