package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ContactPage extends ProjectSpecificationMethods {
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	WebElement fName;
	
	@FindBy(id="lastName")
	WebElement lName;
	
	@FindBy(id="birthdate")
	WebElement bdate;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="street1")
	WebElement address1;
	
	@FindBy(id="street2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="stateProvince")
	WebElement state;
	
	@FindBy(id="postalCode")
	WebElement postcode;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="submit")
	WebElement submit;
	
	//Entering the firstname
	public ContactPage firstName(String firstname) {
		fName.sendKeys(firstname);
		return this;
	}
	
	//Entering the lastname
	public ContactPage lastName(String lastname) {
		lName.sendKeys(lastname);
		return this;
	}
	
	//Entering the birth date
	public ContactPage birthDate(String birthdate) {
		bdate.sendKeys(birthdate);
		return this;
	}
	
	//Entering the emailID
	public ContactPage contactEmailId(String emailid) {
		email.sendKeys(emailid);
		return this;
	}
	
	//Entering the phone number
	public ContactPage contactPhoneNumber(String mobile) {
		phone.sendKeys(mobile);
		return this;
	}
	
	//Entering the street address 1
	public ContactPage streetAddress1(String add1) {
		address1.sendKeys(add1);
		return this;
	}
	
	//Entering the street address 2
	public ContactPage streetAddress2(String add2) {
		address2.sendKeys(add2);
		return this;
	}
	
	//Entering the city
	public ContactPage cityName(String cityname) {
		city.sendKeys(cityname);
		return this;
	}
	
	//Entering the state or province
	public ContactPage stateOrProvince(String states) {
		state.sendKeys(states);
		return this;
	}
	
	//Entering the state or province
	public ContactPage postalCode(String postCode) {
		postcode.sendKeys(postCode);
		return this;
	}
	
	//Entering the state or province
	public ContactPage counTry(String countyName) {
		country.sendKeys(countyName);
		return this;
	}
	
	//clicking the submit button and validate the button
	public HomePage contactAddSubmitButton() throws InterruptedException {
		submit.click();
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("//button[contains(text(),'Add a New Contact')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
	}

}
