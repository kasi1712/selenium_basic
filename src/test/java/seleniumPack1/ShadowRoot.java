package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("pact");
		
		WebElement we = driver.findElement(By.xpath("//div[@id='snacktime']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		String x= js.executeScript("return document.readyState").toString();
//		
//		if(x.equals("complete")) {
//			System.out.println("page successfully loaded");
//		}
		
		String root = "return arguments[0].shadowRoot.querySelector('a').click()";
		js.executeScript(root, we);
	}

}
