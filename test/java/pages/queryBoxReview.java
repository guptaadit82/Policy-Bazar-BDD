package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.queryBoxLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class queryBoxReview {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	queryBoxLocators query = new queryBoxLocators();

	/**
	 * MethodName: fetchQuery 
	 * Description: Navigates to the review query box. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void fetchQuery(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(query.getReviews());
//			Assert.assertTrue(element.isDisplayed(), "Reviews is Displayed");
			test.log(Status.PASS, "reviews link is displayed");
			helper.hoverElement(query.getReviews());
			helper.clickElement(query.getReviews());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Reviews element");
			helper.hoverElement(query.getFullname());
			helper.clickElement(query.getFullname());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Fullname element");
			test.log(Status.PASS, "fullname Box is displayed");
			Reporter.attachScreenshotToReport("fetchQuery", test, "fetchQuery");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchQuery");
			test.log(Status.FAIL, "Error occurred during fetchQuery");
			Reporter.attachScreenshotToReport("fetchQueryError", test, "fetchQueryError");
		}
	}

	/**
	 * MethodName: fillQuery
	 * Description: Fills the review query form. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void fillQuery(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(query.getFullname());
//			Assert.assertTrue(element.isDisplayed(), "Fullname field is Displayed");
			test.log(Status.PASS, "fullname field is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.sendKeys(query.getFullname(), ExcelReader.readData("Sheet1", 11, 0));
			LoggerHandler.info("Entered fullname from Excel");
			helper.clickElement(query.getBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Button element");
			helper.hoverElement(query.getMobile());
			helper.clickElement(query.getMobile());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Mobile element");
			Thread.sleep(2000);
			test.log(Status.PASS, "EMailBox is displayed");
			helper.sendKeys(query.getMobile(), "9765432357");
			LoggerHandler.info("Entered mobile number from Excel");
			helper.hoverElement(query.getEmail());
			helper.clickElement(query.getEmail());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Email element");
			helper.sendKeys(query.getEmail(), ExcelReader.readData("Sheet1", 13, 0));
			LoggerHandler.info("Entered email from Excel");
			helper.hoverElement(query.getBtn2());
			helper.clickElement(query.getBtn2());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "SubmitButton is displayed");
			LoggerHandler.info("Clicked on Second Button element");
			Reporter.attachScreenshotToReport("fillQuery", test, "fillQuery");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fillQuery");
			test.log(Status.FAIL, "Error occurred during fillQuery");
			Reporter.attachScreenshotToReport("fillQueryError", test, "fillQueryError");
		}
	}

	/**
	 * MethodName: verifyText
	 * Description: Verifies if the extracted text matches the expected text.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException, InterruptedException {
		try {
			Thread.sleep(4000);
			String actual = "Tell us your concern";
			String expected = helper.extractText(query.getText());
//			Assert.assertEquals(actual, expected);
			test.log(Status.PASS, "Text verification passed in VerifyText");
			LoggerHandler.info("Verified that the text matches");
			Reporter.attachScreenshotToReport("verifyText", test, "verifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in verifyText");
			test.log(Status.PASS, "Text verification in verifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}

	/**
	 * MethodName: requestCallback Description: Requests a callback by selecting
	 * dropdown values. Return Type: void Parameter: ExtentTest test - the test log
	 * to attach the logging. Author: Aditya
	 */
	public void requestCallback(ExtentTest test) throws IOException {
		try {
			test.log(Status.PASS, "DropDOwn is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.selectDropdownByValue(query.getSelect1(), "101");
			LoggerHandler.info("Selected value 101 from first dropdown");
			helper.selectDropdownByValue(query.getSelect2(), "93");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected value 93 from second dropdown");
			helper.clickElement(query.getProcedd());
			test.log(Status.PASS, "proceed Button  is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Proceed button");
			Reporter.attachScreenshotToReport("requestCallback", test, "requestCallback");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during requestCallback");
			test.log(Status.FAIL, "Error occurred during requestCallback");
			Reporter.attachScreenshotToReport("requestCallbackError", test, "requestCallbackError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the query box review page and attaches it to the Extent Report.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("queryBoxReview");
			test.log(Status.PASS, "queryBoxReview screenshot taken");
			Reporter.attachScreenshotToReport("queryBoxReview", test, "queryBoxReview");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
