package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest{
	//All the locators of page//
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
    WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//[text()='Login']")
	WebElement txtLoginPage;
	
	//Initialization of locators
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
	}
}
