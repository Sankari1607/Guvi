package Task16_Class19;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class wikipedia_searcharti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		actions.keyDown(Keys.ENTER).perform();
		driver.findElement(By.id("toc-History")).click();
		
		
//driver.quit();

	}

}
