package seleniumPack1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> itable = driver.findElements(By.tagName("table"));
		for(int i=0;i<itable.size();i++) {
			WebElement table = itable.get(i);
			WebElement ibody = driver.findElement(By.tagName("tbody"));
			List<WebElement> irow = driver.findElements(By.tagName("tr"));
			for(int j=0;j<irow.size();j++) {
				WebElement row = irow.get(j);
				List<WebElement> idata = driver.findElements(By.tagName("td"));
				for(int k=0;k<idata.size();k++) {
					WebElement data = idata.get(k);
					String text = data.getText();
					if(text.equals("Shanghai")){
						System.out.println(text);
					}
					break;
					
			}
				
		}
		
	
			
}
		
}
}