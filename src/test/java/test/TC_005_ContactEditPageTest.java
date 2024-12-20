package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_005_ContactEditPageTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void data() {
		testName = "Contact Editing Functionality";
	    testDescription = "Editing the contact details"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void details() {
		testDetails();
		sheetName ="ContactEditingTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void contactEditingTest(String emailId, String passWord, String fName, 
			String lName, String editemailID, String editphoneNum) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(emailId)
		.passWord(passWord)
		.clickLoginSubmit()
		.contactName()
		.editContact()
		.editFirstName(fName)
		.editLastName(lName)
		.editEmail(editemailID)
		.editNumber(editphoneNum)
		.clickEditSubmit()
		.returnButton();
		//.logOut();
	}

}
