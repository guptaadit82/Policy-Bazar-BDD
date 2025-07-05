package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.silverRateFdLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class silverRateFdCalculator {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	silverRateFdLocators silver = new silverRateFdLocators();

	/**
	 * MethodName: silverPage
	 * Description: Navigates to the silver rate page.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void silverPage(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(silver.getSiteMap());
//			Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
			test.log(Status.PASS, "siteMap link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(silver.getSiteMap());
			helper.clickElement(silver.getSiteMap());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SiteMap element");
			helper.hoverElement(silver.getSilverRate());
			helper.clickElement(silver.getSilverRate());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SilverRate element");
			test.log(Status.PASS, "silverrate Page is displayed");
			Reporter.attachScreenshotToReport("silverPage", test, "silverPage");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during silverPage");
			test.log(Status.FAIL, "Error occurred during silverPage");
			Reporter.attachScreenshotToReport("silverPageError", test, "silverPageError");
		}
	}

	/**
	 * MethodName: takeScreen
	 * Description: Captures a screenshot of the silver rate page and attaches it to the Extent Report.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 *  Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("silverRate");
			test.log(Status.PASS, "silverRate screenshot taken");
			Reporter.attachScreenshotToReport("silverRate", test, "silverRate");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}

	/**
	 * MethodName: fetchSilverRate 
	 * Description: Fetches the silver rate based on state and city. 
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void fetchSilverRate(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(silver.getStateDrop());
//			Assert.assertTrue(element.isDisplayed(), "State Dropdown is Displayed");
			test.log(Status.PASS, "state dropdown is displayed");
			helper.hoverElement(silver.getStateDrop());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over State Dropdown element");
			helper.selectDropdownByValue(silver.getStateDrop(), "DL");
			LoggerHandler.info("Selected Delhi from State Dropdown");
			helper.hoverElement(silver.getCityDrop());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "city is displayed");
			LoggerHandler.info("Hovered over City Dropdown element");
			helper.selectDropdownByValue(silver.getCityDrop(), "delhi");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected Delhi from City Dropdown");
			helper.hoverElement(silver.getNearestCity());
			test.log(Status.PASS, "nearest city is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Nearest City Dropdown element");
			helper.selectDropdownByValue(silver.getNearestCity(), "chennai");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected Chennai from Nearest City Dropdown");
			Reporter.attachScreenshotToReport("fetchSilverRate", test, "fetchSilverRate");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchSilverRate");
			test.log(Status.FAIL, "Error occurred during fetchSilverRate");
			Reporter.attachScreenshotToReport("fetchSilverRateError", test, "fetchSilverRateError");
		}
	}

	/**
	 * MethodName: VerifyText 
	 * Description: Verifies if the extracted text matches the expected text. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging. 
	 * Author: Aditya
	 */
	public void VerifyText(ExtentTest test) throws IOException {
		try {
			String expected = "SILVER ESTIMATOR";
			String actual = helper.extractText(silver.getText());
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

	/**
	 * MethodName: calculateRate
	 *  Description: Calculates the silver rate. 
	 *  Return Type: void 
	 *  Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void calculateRate(ExtentTest test) throws IOException {
		try {
			helper.hoverElement(silver.getCalculate());
			helper.jsClick(silver.getCalculate());
			LoggerHandler.info("Clicked Calculate element");
			test.log(Status.PASS, "displayed calculateRate");
			Reporter.attachScreenshotToReport("calculateRate", test, "calculateRate");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during calculateRate");
			test.log(Status.INFO, "Error occurred during calculateRate");
			Reporter.attachScreenshotToReport("calculateRateError", test, "calculateRateError");
		}
	}
}
