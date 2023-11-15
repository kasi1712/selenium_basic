package seleniumPack1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KASI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement sel =driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(sel);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("Microsoft");
		Thread.sleep(2000);
		s.selectByVisibleText("Yahoo");

		
		List<WebElement> options = s.getOptions();
		for(WebElement x : options) {
			System.out.println(x.getText());
		}
		
		System.out.println("multiple options");
		
		WebElement Mul =driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(Mul);
		
		s1.selectByIndex(1);
		s1.selectByIndex(0);
		s1.selectByIndex(2);
		s1.deselectByIndex(1);
		
		List<WebElement> options1 = s1.getOptions();
		for(WebElement m : options1) {
			System.out.println(m.getText());
		}
		
		System.out.println("selected multiple options");
		
		List<WebElement> alloptions = s1.getAllSelectedOptions();
		for(WebElement m1 : alloptions) {
			System.out.println(m1.getText());
		}
		
		System.out.println("first selected multiple options");
		WebElement firstoptions = s1.getFirstSelectedOption();
		System.out.println(firstoptions.getText());
		
		
}
}
