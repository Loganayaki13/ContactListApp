package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LogoutPage extends ProjectSpecificationMethods {

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//tr[@class='contactTableBodyRow'])[3]")
	WebElement delete1;

	@FindBy(xpath = "(//tr[@class='contactTableBodyRow'])[2]")
	WebElement delete2;

	@FindBy(xpath = "(//tr[@class='contactTableBodyRow'])[1]")
	WebElement delete3;

	@FindBy(id = "delete")
	WebElement deleteButton;

	public LogoutPage deleteFirst() throws InterruptedException {
		delete1.click();
		Thread.sleep(5000);
		deleteButton.click();
		alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		return this;
	}

	public LogoutPage deleteSecond() throws InterruptedException {
		delete2.click();
		Thread.sleep(5000);
		deleteButton.click();
		alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		return this;
	}

	public LogoutPage deleteThird() throws InterruptedException {
		delete3.click();
		Thread.sleep(5000);
		deleteButton.click();
		alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		return this;
	}

	public HomePage logOut() {
		driver.findElement(By.id("logout")).click();
		return new HomePage(driver);
	}

}
