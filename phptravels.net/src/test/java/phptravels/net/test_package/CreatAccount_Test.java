package phptravels.net.test_package;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import phptravels.net.element_Packages.CreatAccount;
import phptravels.net.utilites.Config;
import phptravels.net.utilites.Driver;
import phptravels.net.utilites.Page;

public class CreatAccount_Test {

	WebDriver driver;
	
	@Before
	 public void SetUp(){
		
		//Driver.getInstance().get(Config.getProperty("URL"));
		System.setProperty(Config.getProperty("WebBrowser"), Config.getProperty("browser"));
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
//	@Test
//	 public void StartTesting(){
//
//	    Random random = new Random();
//		Driver.getInstance().get(Config.getProperty("URL"));
//        
//		CreatAccount Account = new CreatAccount();
//        Account.Myaccount.click();
//        Account.SignUp.click();
//        Account.FirstName.sendKeys("modric");
//        Account.LastName.sendKeys("Luka");
//       
//        Account.MobileNumber.sendKeys(random.nextInt());
//        
//        Page.sleep(3000);
//        Driver.getInstance().get("https://temp-mail.org/en/");
//        String email = Account.TepEmail.getAttribute("value");
//        Page.sleep(3000);
//       
//        Driver.getInstance().navigate().back();
//        Account.Email.sendKeys(email);
//        Account.Password.sendKeys(Config.getProperty("Password"));
//        Account.ComfirmPasswpord.sendKeys(Config.getProperty("ComfirmPassword"));
//        Account.SignUpButton.click();
//        
//      
//	}
//	
//	
//	
//	
//	
	
}
