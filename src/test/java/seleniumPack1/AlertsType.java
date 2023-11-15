package seleniumPack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsType {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alert = driver.findElement(By.xpath("//input[contains(@name,'alert')]"));
		alert.click();
		Thread.sleep(2000);
		Alert btn = driver.switchTo().alert();
		btn.accept();
		Thread.sleep(2000);
		
		WebElement ConFalert = driver.findElement(By.xpath("//input[contains(@name,'confirmation')]"));
		ConFalert.click();
		Thread.sleep(2000);
		Alert btn1 = driver.switchTo().alert();
		btn1.accept();
		Thread.sleep(2000);
		ConFalert.click();
		Thread.sleep(2000);
		btn1.dismiss();
		Thread.sleep(2000);
		
		WebElement promptbtn = driver.findElement(By.xpath("//input[contains(@name,'prompt')]"));
		promptbtn.click();
		Thread.sleep(2000);
		Alert btn2 = driver.switchTo().alert();
		btn2.sendKeys("kasi karthikeyan");
		Thread.sleep(2000);
		btn2.accept();
		String txt = btn2.getText();
		System.out.println(txt);
		
		
		
		
		
}
}
