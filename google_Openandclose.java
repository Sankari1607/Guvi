package Task16_Class19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;;

public class google_Openandclose {
	
public static void main(String arg[]) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	
	
	
	//APjFqb -> box
	// by - > locators -> id, name, css , tagname , linkText, partial
	
	//WebElement element = driver.findElement(By.id("APJFqb"));
	
	//element.sendKeys("sjdnsjd");
	//element.sendKeys(Keys.ENTER);
	driver.quit();
}
}
