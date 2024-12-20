package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003_ContactPageTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void data() {
		testName = "Add Contact Functionality";
	    testDescription = "Adding the contact with valid & invalid details"; 
	    testAuthor = "Loganayaki";
	}
	
	@BeforeClass
	public void tdetails()
	{
		testDataDetails();
		sheetName="ContactAdditionTestData";
	}
	
	@Test(dataProvider="excelRead")
	public void contactAddtionTest(String emailId, String passWord, String firstname, String lastname, String birthdate, 
	String emailid, String mobile, String add1 , String add2,
	String cityname, String states, String postCode, String countyName) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.loginSubmitValidation()
		.emailID(emailId)
		.passWord(passWord)
		.clickLoginSubmit()
		.clickNewContact()
		.firstName(firstname)
		.lastName(lastname)
		.birthDate(birthdate)
		.contactEmailId(emailid)
		.contactPhoneNumber(mobile)
		.streetAddress1(add1)
		.streetAddress2(add2)
		.cityName(cityname)
		.stateOrProvince(states)
		.postalCode(postCode)
		.counTry(countyName)
		.contactAddSubmitButton()
		.logOut();
	}

}
