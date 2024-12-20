package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ContactDisplayPage extends ProjectSpecificationMethods {
	public ContactDisplayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Anna Mil')]")
	WebElement contact1;

	@FindBy(xpath = "(//td[contains(text(),'Amy Miller')])[1]")
	WebElement contact2;

	@FindBy(xpath = "(//td[contains(text(),'Amy Miller')])[2]")
	WebElement contact3;

	@FindBy(xpath = "//td[contains(text(),'8005555555')]")
	WebElement phoneNum;

	// Contact validationMethod
	public ContactDisplayPage contactValidation() {
		Assert.assertTrue(contact1.isDisplayed());
		Assert.assertTrue(contact2.isDisplayed());
		Assert.assertTrue(contact3.isDisplayed());
		Assert.assertTrue(phoneNum.isDisplayed());

		return this;
	}

	// PhoneNumber validationMethod
	public HomePage phoneNumValidation() {
		expectedResult = "+918005555555";
		String actualResult = driver.findElement(By.xpath("//td[contains(text(),'8005555555')]")).getText();
		Assert.assertEquals(actualResult, expectedResult);
		return new HomePage(driver);
	}

}
