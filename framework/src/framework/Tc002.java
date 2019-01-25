package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc002 {

	
	@Test
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/PriyankaMaheshwari/Desktop/work/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.findElement(By.id("email")).sendKeys("prrrr");
		//driver.findElement(By.id("password")).sendKeys("prrrr");
		driver.quit();
		
	}
}
