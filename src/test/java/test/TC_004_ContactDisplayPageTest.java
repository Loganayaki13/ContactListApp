package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_004_ContactDisplayPageTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void data() {
		testName = "Contact Display Functionality";
	    testDescription = "Validating whether the contact list is displayed or not"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void tdetails()
	{
		testDataDetails();
		sheetName="ContactDisplayTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void contactDisplatTest(String emailId, String passWord) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(emailId)
		.passWord(passWord)
		.clickLoginSubmit()
		.contactList()
		.contactValidation()
		.phoneNumValidation()
		.logOut();
	}

}
