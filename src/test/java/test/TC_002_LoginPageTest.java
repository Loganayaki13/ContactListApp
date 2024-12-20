package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_002_LoginPageTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void data() throws IOException {
		testName = "Login Functionality";
	    testDescription = "Login with valid & invalid credentials"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void tdetails()
	{
		testDataDetails();
		sheetName="LoginTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void loginTest(String emailId,String passWord) {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(emailId)
		.passWord(passWord)
		.clickLoginSubmit();
	}

}
