package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement source1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions as = new Actions(driver);
		as.dragAndDrop(source, dest).perform();
		Thread.sleep(2000);
		as.dragAndDrop(source1, dest1).perform();
		
	}
}
