package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001_SignupTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void data() throws IOException {
		
		testName = "SignUp Functionality";
	    testDescription = "Testing the SignUp Functionality"; 
	    testAuthor = "Loganayaki"; 
	}
	@BeforeClass
	public void tdetails()
	{
		testDataDetails();
		sheetName="SignupTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void signUpTest(String Fname,String Lname,String emailid,String pass) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.signUpButtonValidate()
		.firstName(Fname)
		.lastName(Lname)
		.emailId(emailid)
		.passWord(pass)
		.signUpButton();
	}

}
