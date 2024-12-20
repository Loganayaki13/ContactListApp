package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Validate the signUp button
	public SignupPage signUpButtonValidate() {
		ele = driver.findElement(By.id("signup"));
		Assert.assertTrue(ele.isDisplayed());
		driver.findElement(By.id("signup")).click();
		return new SignupPage(driver);
	}

	// Validate the login submit button
	public LoginPage loginSubmitValidation() {
		ele = driver.findElement(By.id("submit"));
		Assert.assertTrue(ele.isEnabled());
		return new LoginPage(driver);
	}

	// Clicking Add a New Contact button
	public ContactPage clickNewContact() {
		driver.findElement(By.id("add-contact")).click();
		return new ContactPage(driver);
	}

	// Return to contact List page
	public ContactDisplayPage contactList() {
		ele = driver.findElement(By.xpath("//h1[contains(text(),'Contact List')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new ContactDisplayPage(driver);
	}

	// Clicking the contact name to edit
	public ContactEditPage contactName() {
		driver.findElement(By.xpath("//tr[contains(@class,'contactTableBodyRow')]")).click();
		ele = driver.findElement(By.xpath("//h1[contains(text(),'Contact Details')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new ContactEditPage(driver);
	}

	// Deleting the contact
	public ContactDetelePage clickContact() {
		driver.findElement(By.xpath("(//tr[contains(@class,'contactTableBodyRow')])[4]")).click();
		return new ContactDetelePage(driver);
	}

	// Validating the logout button
	public LogoutPage logoutValidate() {
		ele = driver.findElement(By.id("logout"));
		Assert.assertTrue(ele.isDisplayed());
		return new LogoutPage(driver);
	}

	public HomePage logOut() {
		driver.findElement(By.id("logout")).click();
		return new HomePage(driver);
	}

}
