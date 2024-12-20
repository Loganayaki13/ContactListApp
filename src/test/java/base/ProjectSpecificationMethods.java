package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {

	// launch the browser and url
	@Parameters({ "browser" })
	@BeforeMethod
	public void launchBrowserAndURL(String browser) {
		browserAndURL(browser);
	}

	@DataProvider(name = "excelRead")
	public String[][] excelRead() throws IOException {
		return excelData(sheetName);
	}

	// closing the browser

	@AfterMethod
	public void closeBrowser() {
		browserClose();
	}

	@BeforeSuite
	public void reportInitialization() {
		reptInitilization();
	}

	@AfterSuite
	public void closeReport() {
		report.flush();
	}

	@BeforeClass
	public void testDataDetails() {
		testDetails();
	}
}
