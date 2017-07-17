package phptravels.net.element_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import phptravels.net.utilites.Driver;

public class CreatAccount {
	
	 private WebDriver driver;
	
	public CreatAccount(){
		this.driver = Driver.getInstance();
	    PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div/ul/li[2]/a/i")
	public WebElement Myaccount;
	
	@FindBy(linkText="Sign Up")
	public WebElement SignUp;
	
	@FindBy(name="firstname")
	public WebElement FirstName;
	
	@FindBy(name="lastname")
	public WebElement LastName;
	
	@FindBy(name="phone")
	public WebElement MobileNumber;
	
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(css="input[type='password']")
	public WebElement Password;
	
	@FindBy(name="confirmpassword")
	public WebElement ComfirmPasswpord;
	
	@FindBy(css="button[type='submit']")
	public WebElement SignUpButton;
	
    @FindBy(id="mail")
    public WebElement TepEmail;

}
