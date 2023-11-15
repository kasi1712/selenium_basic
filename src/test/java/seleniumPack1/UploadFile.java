package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAuqKqBhDxARIsAFZELmIVfc3v0vzwmyeNrz1YTVU1x_P16YjP6ldnWXgbrYVDXot9qn1_VR4aAoBkEALw_wcB&gclsrc=aw.ds");
	
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		btn.click();
		
		Thread.sleep(2000);	
		
		Runtime.getRuntime().exec("C:\\Users\\KASI\\Documents\\AutoAu3\\kasi.exe");
		}
}
