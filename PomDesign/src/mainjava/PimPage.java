package mainjava;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtpage;
	
	@FindBy(xpath="//input[@type='checkbox']//parent::label//child::span")
	List<WebElement> checKboxs;
	
	@FindBy(xpath="//input[@type='checkbox']//parent::label//child::span")
	WebElement checKboxx;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String titleOfPimPage() {
		return txtpage.getText();
	}
	
	public void checkbox() throws InterruptedException {
		//for(WebElement checkbox:checKboxs) 
		
		  
		
		
	}
		

}
