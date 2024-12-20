package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class SignupPage extends ProjectSpecificationMethods {
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement signUpSubmit;
	
	//Entering the firtname
	public SignupPage firstName(String Fname) {
		firstname.sendKeys(Fname);
		return this;
	}
	
	//Entering the lastname
	public SignupPage lastName(String Lname) {
		lastname.sendKeys(Lname);
		return this;
	}
	
	//Entering the email id
	public SignupPage emailId(String emailid) {
		email.sendKeys(emailid);
		return this;
	}
	
	//Entering the password
	public SignupPage passWord(String pass) {
		password.sendKeys(pass);
		return this;
	}
	
	//Clicking the signupButton
	public HomePage signUpButton() throws InterruptedException {
		signUpSubmit.click();
		Thread.sleep(5000);
		return new HomePage(driver);
	}

}
