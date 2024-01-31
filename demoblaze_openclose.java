package Task16_Class19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class demoblaze_openclose {
public static void main(String arg[])
{
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.demoblaze.com/");
	String actualTitile = driver.getTitle();
	driver.manage().window().maximize();
	String expectedTile = "STORE";
	
	if(actualTitile.equalsIgnoreCase(expectedTile))
	{
		System.out.println("Page landed on Correct Website");
		
	}
	else
		System.out.println("Page not landed on Correct Website");
	
	
}
}
