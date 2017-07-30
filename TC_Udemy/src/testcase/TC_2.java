package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_2 {

	
	@Test
	
	   public void testcase1(){
		
		System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Realmadrid");
		driver.findElement(By.cssSelector("input[name=btnK]")).click();
		driver.quit();
	}
	
}
