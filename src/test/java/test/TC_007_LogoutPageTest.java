package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_007_LogoutPageTest extends ProjectSpecificationMethods {
	

	@BeforeTest
	public void data() {
		testName = "Final Logout Functionality";
	    testDescription = "deleting all the contacts and logged out the account"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void details() {
		testDetails();
		sheetName ="FinalLogoutTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void finalLogoutTest(String loginEmail, String loginpassword) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(loginEmail)
		.passWord(loginpassword)
		.clickLoginSubmit()
		.logoutValidate()
		.deleteFirst()
		.deleteSecond()
		.deleteThird()
		.logOut();
	}

}
