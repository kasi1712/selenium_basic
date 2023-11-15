package seleniumPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement fe = driver.findElement(By.id("email"));
		
		
		
		if(fe.isDisplayed()) {
			fe.clear();
			fe.sendKeys("selenium");
			
			String s = fe.getAttribute("value");
			
			if(s.isEmpty()) {
				
			}
			else if(!s.equals("selenium")){
				System.err.println("error");
			}
			else {
				System.out.println("successfully verified");
			}
		}
		else {
			System.err.println("Element is not present");
		}
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("kasi1712");
		
		WebElement link = driver.findElement(By.linkText("Log in"));
		
		
		if(link.isEnabled()) {
			String text = link.getText();
			link.click();
			System.out.println(text);
		}
		else {
			System.err.println("log button is disabled");
		}
		
		List<WebElement> link1 = driver.findElements(By.tagName("a"));
		
		System.out.println(link1.size());
		for(int i=0;i<link1.size();i++) {
			WebElement value = link1.get(i);
			String text = value.getText(); 
			System.out.println(text);
		}
		
		WebElement link2 = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		link2.click();
	}
}
