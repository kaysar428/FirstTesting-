package phptravels.net.Step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import phptravels.net.element_Packages.CreatAccount;
import phptravels.net.utilites.Config;
import phptravels.net.utilites.Driver;
import phptravels.net.utilites.Page;

public class PhpTravels_StepDef {

	WebDriver driver;

	CreatAccount Account = new CreatAccount();

	@Given("^User at PhpTravel Homepage$")
	public void user_at_PhpTravel_Homepage() throws Throwable {

		System.out.println(".........User Open Phptravel ..............");
		System.setProperty(Config.getProperty("WebBrowser"), Config.getProperty("browser"));

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("^User Should Start Create Account$")
	public void user_Should_Start_Create_Account() throws Throwable {
		Driver.getInstance().get(Config.getProperty("URL"));
		Account.Myaccount.click();
		Account.SignUp.click();

	}

	@When("^User Need Fill out Personal Infomation$")
	public void user_Need_Fill_out_Personal_Infomation() throws Throwable {

		Account.FirstName.sendKeys("kaisar");
		Account.LastName.sendKeys("Mickealjan");
		Account.MobileNumber.sendKeys("5712345969");

		Page.sleep(3000);
		Driver.getInstance().get("https://temp-mail.org/en/");
		String email = Account.TepEmail.getAttribute("value");
		Page.sleep(3000);
		// Driver.getInstance().get(Config.getProperty("URLREGISTER"));
		Driver.getInstance().navigate().back();
		Account.Email.sendKeys(email);
		Account.Password.sendKeys(Config.getProperty("Password"));
		Account.ComfirmPasswpord.sendKeys(Config.getProperty("ComfirmPassword"));
		Account.SignUpButton.click();
	}

	@Then("^User Succeful Login to thier Profile$")
	public void user_Succeful_Login_to_thier_Profile() throws Throwable {

		System.out.println("User Able to see their name ");
		
		
	}

}
