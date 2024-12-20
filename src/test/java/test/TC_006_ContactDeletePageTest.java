package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_006_ContactDeletePageTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void data() {
		testName = "Contact Deleting Functionality";
	    testDescription = "Deleting the contact"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void details() {
		testDetails();
		sheetName ="ContactDeletingTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void contactDeletingTest(String email, String password) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(email)
		.passWord(password)
		.clickLoginSubmit()
		.clickContact()
		.clickDeleteButton()
		.alertHandle()
		.logOut();
	}

}
