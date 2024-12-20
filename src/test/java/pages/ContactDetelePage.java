package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ContactDetelePage extends ProjectSpecificationMethods {

	public ContactDetelePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='delete']")
	WebElement deteleButton;

	// After selecting contact details, click the delete button
	public ContactDetelePage clickDeleteButton() throws InterruptedException {
		Thread.sleep(5000);
		deteleButton.click();
		return this;
	}

	// Handling the alert to confirm the delete contact
	public HomePage alertHandle() {
		alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		ele = driver.findElement(By.xpath("//h1[contains(text(),'Contact List')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
	}
}