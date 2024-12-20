package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submit;
	
	//Enter the Email
	public LoginPage emailID(String emailId) {
		email.sendKeys(emailId);
		return this;
	}
	
	//Enter the password
	public LoginPage passWord(String passWord) {
		password.sendKeys(passWord);
		return this;
	}
	
	// click the login submit button and validate
	public HomePage clickLoginSubmit() {
		submit.click();
		ele = driver.findElement(By.xpath("//button[contains(text(),'Add a New Contact')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
		
	}
}
