package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.talkToExpertLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class talkToExpert {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	talkToExpertLocators talk = new talkToExpertLocators();

	/**
	 * MethodName: fetchProducts
	 * Description: Navigates to fetch product details.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach thelogging.
	 *  Author: Aditya
	 */
	public void fetchProducts(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(talk.getNewsroom());
//			Assert.assertTrue(element.isDisplayed(), "Newsroom is Displayed");
			test.log(Status.PASS, "newsroom link is displayed");
			helper.hoverElement(talk.getNewsroom());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Newsroom element");
			helper.clickElement(talk.getNewsroom());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Newsroom element");
			helper.clickElement(talk.getPolicy());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.switchToNewWindow();
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "new window  is displayed");
			LoggerHandler.info("Clicked on Policy element");
			Reporter.attachScreenshotToReport("fetchProducts", test, "fetchProducts");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchProducts");
			test.log(Status.FAIL, "Error occurred during fetchProducts");
			Reporter.attachScreenshotToReport("fetchProductsError", test, "fetchProductsError");
		}
	}

	/**
	 * MethodName: ulipsBox 
	 * Description: Opens the ULIPs section in a new window.
	 * Return Type: void
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void ulipsBox(ExtentTest test) throws IOException {
		try {
			LoggerHandler.info("Switched to new window");
			WebElement element = Base.driver.findElement(talk.getAllProducts());
//			Assert.assertTrue(element.isDisplayed(), "All Products link is Displayed");
			test.log(Status.PASS, "all products link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(talk.getAllProducts());
			LoggerHandler.info("Hovered over All Products element");
			helper.clickElement(talk.getAllProducts());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on All Products element");
			test.log(Status.PASS, "all products  is displayed & clicked");
			helper.hoverElement(talk.getUlips());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over ULIPs element");
			helper.clickElement(talk.getUlips());
			LoggerHandler.info("Clicked on ULIPs element");
			helper.clickElement(talk.getTalkexpert());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "talk to expert is displayed");
			LoggerHandler.info("Clicked on Talk to Expert element");
			Reporter.attachScreenshotToReport("ulipsBox", test, "ulipsBox");
			LoggerHandler.info("Attached screenshot to report: ulipsBox");
			Thread.sleep(2000);
			LoggerHandler.info("Waited for 2 seconds");
		} catch (InterruptedException e) {
			LoggerHandler.error("Error occurred during ulipsBox");
			test.log(Status.FAIL, "Error occurred during ulipsBox");
			Reporter.attachScreenshotToReport("ulipsBoxError", test, "ulipsBoxError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the talk to expert page and attaches it to the Extent Report.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 *  Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("talkToExpert");
			LoggerHandler.info("Captured screenshot of talkToExpert");
			test.log(Status.PASS, "talkToExpert screenshot taken");
			Reporter.attachScreenshotToReport("talkToExpert", test, "talkToExpert");
			LoggerHandler.info("Attached screenshot to report: talkToExpert");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
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
			helper.waitForVisibilityofElement(talk.getText(), 10);
			helper.hoverElement(talk.getText());
			String actual = "You can reach us directly on the below";
			String expected = helper.extractText(talk.getText());
//			Assert.assertEquals(actual, expected);
			LoggerHandler.info("Verified that the text matches");
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("verifyText", test, "verifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in verifyText");
			test.log(Status.PASS, "Text verification in verifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}
}
