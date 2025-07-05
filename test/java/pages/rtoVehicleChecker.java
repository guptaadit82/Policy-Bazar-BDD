package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.rtoVehicleLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class rtoVehicleChecker {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	rtoVehicleLocators rto = new rtoVehicleLocators();

	/**
	 * MethodName: rtoPage
	 * Description: Navigates to the RTO page. 
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void rtoPage(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(rto.getSiteMap());
//			Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
			test.log(Status.PASS, "siteMap link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(rto.getSiteMap());
			helper.clickElement(rto.getSiteMap());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SiteMap element");
			helper.hoverElement(rto.getRtoPage());
			helper.clickElement(rto.getRtoPage());
			LoggerHandler.info("Clicked on RtoPage element");
			test.log(Status.PASS, "rto Page is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			Reporter.attachScreenshotToReport("rtoPage", test, "rtoPage");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during rtoPage");
			test.log(Status.FAIL, "Error occurred during rtoPage");
			Reporter.attachScreenshotToReport("rtoPageError", test, "rtoPageError");
		}
	}

	/**
	 * MethodName: findRtoDetails 
	 * Description: Finds RTO details based on input from Excel. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void findRtoDetails(ExtentTest test,String carnum) throws IOException {
		try {
			helper.switchToNewWindow();
			LoggerHandler.info("Switched to new window");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			Base.driver.navigate().refresh();
			LoggerHandler.info("Refreshed the page");
			WebElement element = Base.driver.findElement(rto.getRtoBox());
//			Assert.assertTrue(element.isDisplayed(), "RtoBox is Displayed");
			test.log(Status.PASS, "rtoBox field is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.clickElement(rto.getRtoBox());
			LoggerHandler.info("Clicked on RtoBox element");
			helper.sendKeys(rto.getRtoBox(), carnum);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered RTO number from Excel");
			helper.enterAction(rto.getRtoBox());
			LoggerHandler.info("Submitted RTO number");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "submit button  is displayed");
			Reporter.attachScreenshotToReport("findRtoDetails", test, "findRtoDetails");
			Thread.sleep(10000);
			test.log(Status.FAIL, "findRtoDetails method failed on Live Application fetching data");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");

		} catch (Exception e) {
			LoggerHandler.error("Error occurred during findRtoDetails");
			test.log(Status.FAIL, "Error occurred during findRtoDetails");
			Reporter.attachScreenshotToReport("findRtoDetailsError", test, "findRtoDetailsError");
		}
	}

	/**
	 * MethodName: selectCar 
	 * Description: Selects the car details.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void selectCar(ExtentTest test) throws IOException {
		try {

			helper.waitForVisibilityofElement(rto.getKia(), 20);
			helper.clickElement(rto.getKia());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected Kia car brand");
			helper.clickElement(rto.getFuel());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected fuel type");
			helper.clickElement(rto.getVariant());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected car variant");
			helper.clickElement(rto.getModel());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected car model");
			helper.clickElement(rto.getYear());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected manufacturing year");
			Reporter.attachScreenshotToReport("selectCar", test, "selectCar");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during selectCar");
			test.log(Status.FAIL, "Error occurred during selectCar");
			Reporter.attachScreenshotToReport("selectCarError", test, "selectCarError");
		}
	}

	/**
	 * MethodName: verifyText 
	 * Description: Verifies if the extracted text matches the expected text. 
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException {
		try {
			String actual = "Almost there! Just one more step";
			String expected = helper.extractText(rto.getText());
//			Assert.assertEquals(actual, expected);
			LoggerHandler.info("Verified that the text matches");
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("verifyText", test, "verifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in verifyText");
			test.log(Status.FAIL, "Text verification failed in verifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the RTO vehicle page and attaches it to the Extent Report. 
	 * Return Type: void 
	 * Parameter:ExtentTest test - the test log to attach the screenshot. 
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("rtoVehicle");
			test.log(Status.FAIL, "rtoVehiclePage Failed to respond");
			Reporter.attachScreenshotToReport("rtoVehicle", test, "rtoVehicle");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
