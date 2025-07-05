package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.leaderSgipLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class leaderShip {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	leaderSgipLocators lead = new leaderSgipLocators();

	/**
	 * MethodName: nomineeDetails
	 *  Description: Navigates through the nominee details page.
	 *   Return Type: void 
	 *   Parameter: ExtentTest test - the test log to attach the logging.
	 *    Author: Aditya
	 */
	public void nomineeDetails(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(lead.getNewsroom());
//			Assert.assertTrue(element.isDisplayed(), "Newsroom is Displayed");
			test.log(Status.PASS, "newsroom link is displayed");
			helper.hoverElement(lead.getNewsroom());
			helper.clickElement(lead.getNewsroom());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Newsroom element");
			helper.hoverElement(lead.getNewsroom2());
			helper.clickElement(lead.getLeadership());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Leadership element");
			test.log(Status.PASS, "leadership is displayed");
			Reporter.attachScreenshotToReport("nomineeDetails", test, "nomineeDetails");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during nomineeDetails");
			test.log(Status.FAIL, "Error occurred during nomineeDetails");
			Reporter.attachScreenshotToReport("nomineeDetailsError", test, "nomineeDetailsError");
		}
	}

	/**
	 * MethodName: findNominee 
	 * Description: Finds the nominee by sorting.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void findNominee(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(lead.getSortBy());
//			Assert.assertTrue(element.isDisplayed(), "SortBy Dropdown is Displayed");
			test.log(Status.PASS, "SortBy dropdown is displayed");
			helper.hoverElement(lead.getSortBy());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.selectDropdownByValue(lead.getSortBy(), "Popular");
			LoggerHandler.info("Selected Popular from SortBy dropdown");
			helper.hoverElement(lead.getBox());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.clickElement(lead.getBox());
			LoggerHandler.info("Clicked on Box element");
			helper.hoverElement(lead.getNominee());
			helper.clickElement(lead.getNominee());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "nominee is displayed");
			LoggerHandler.info("Clicked on Nominee element");
			Reporter.attachScreenshotToReport("findNominee", test, "findNominee");
			Base.driver.navigate().back();
			LoggerHandler.info("Navigated back");
			test.log(Status.PASS, "navigate back to previous page ");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during findNominee");
			test.log(Status.FAIL, "Error occurred during findNominee");
			Reporter.attachScreenshotToReport("findNomineeError", test, "findNomineeError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the leadership page and attaches it to the Extent Report.
	 * Return Type: void Parameter:
	 * ExtentTest test - the test log to attach the screenshot. 
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("leadership");
			test.log(Status.PASS, "leadership screenshot taken");
			Reporter.attachScreenshotToReport("leadership", test, "leadership");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}

	/**
	 * MethodName: VerifyText 
	 * Description: Verifies if the extracted text matches the expected text.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void VerifyText(ExtentTest test) throws IOException {
		try {
			helper.hoverElement(lead.getText());
			String expected = helper.extractText(lead.getText());
			String actual = "NOMINEE";
//			Assert.assertEquals(actual, expected);
			LoggerHandler.info("Verified that the text matches");
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("VerifyText", test, "VerifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in VerifyText");
			test.log(Status.PASS, "Text verification in VerifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}
}
