package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContactEditPage extends ProjectSpecificationMethods {
	public ContactEditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "edit-contact")
	WebElement editbutton;

	@FindBy(id = "firstName")
	WebElement editfname;

	@FindBy(id = "lastName")
	WebElement editlname;

	@FindBy(id = "email")
	WebElement editemail;

	@FindBy(id = "phone")
	WebElement editphone;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement editsubmit;

	@FindBy(xpath = "//button[@id='return']")
	WebElement editreturn;

	// Clicking the contact edit page
	public ContactEditPage editContact() {
		editbutton.click();
		return this;
	}

	// Edit the first name
	public ContactEditPage editFirstName(String fName) throws InterruptedException {
		Thread.sleep(2000);
		editfname.clear();
		Thread.sleep(2000);
		editfname.sendKeys(fName);
		return this;
	}

	// Edit the last name
	public ContactEditPage editLastName(String lName) throws InterruptedException {
		editlname.clear();
		Thread.sleep(2000);
		editlname.sendKeys(lName);
		return this;
	}

	// Edit the emailID
	public ContactEditPage editEmail(String editemailID) throws InterruptedException {
		editemail.clear();
		Thread.sleep(2000);
		editemail.sendKeys(editemailID);
		return this;
	}

	// Edit the phone number
	public ContactEditPage editNumber(String editphoneNum) throws InterruptedException {
		editphone.clear();
		Thread.sleep(2000);
		editphone.sendKeys(editphoneNum);
		return this;
	}

	// Clicking the submit button after editing the details
	public ContactEditPage clickEditSubmit() {
		editsubmit.click();
		return this;
	}

	// Return to the contact page
	public HomePage returnButton() {
		editreturn.click();
		return new HomePage(driver);
	}

}
