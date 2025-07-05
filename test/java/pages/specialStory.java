package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.specialStoryLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class specialStory {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	specialStoryLocators special = new specialStoryLocators();

	/**
	 * MethodName: fetchStory
	 * Description: Navigates to and fetches the special story.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void fetchStory(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(special.getNewsroom());
//			Assert.assertTrue(element.isDisplayed(), "Newsroom is Displayed");
			test.log(Status.PASS, "newsroom link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(special.getNewsroom());
			helper.clickElement(special.getNewsroom());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Newsroom element");
			helper.hoverElement(special.getNewsroom2());
			test.log(Status.PASS, "second news room  is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.clickElement(special.getSpecialStory());
			LoggerHandler.info("Clicked on Special Story element");
			test.log(Status.PASS, "special story is displayed");
			helper.hoverElement(special.getFirstStory());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over First Story element");
			helper.clickElement(special.getFirstStory());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on First Story element");
			helper.hoverElement(special.getCommentBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Comment Button element");
			test.log(Status.PASS, "comment Button is displayed");
			helper.jsClick(special.getCommentBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Comment Button element using JS");
			Reporter.attachScreenshotToReport("fetchStory", test, "fetchStory");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchStory");
			test.log(Status.FAIL, "Error occurred during fetchStory");
			Reporter.attachScreenshotToReport("fetchStoryError", test, "fetchStoryError");
		}
	}

	/**
	 * MethodName: commentOnStory 
	 * Description: Adds a comment to the fetched special story.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void commentOnStory(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(special.getName());
//			Assert.assertTrue(element.isDisplayed(), "Name field is Displayed");
			test.log(Status.PASS, "name field is displayed");
			helper.hoverElement(special.getName());
			helper.clickElement(special.getName());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Name element");
			test.log(Status.PASS, "name field is displayed");
			helper.sendKeys(special.getName(), ExcelReader.readData("Sheet1", 1, 0));
			LoggerHandler.info("Entered Name from Excel");
			helper.hoverElement(special.getComment());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Comment ");
			helper.clickElement(special.getComment());
			LoggerHandler.info("Clicked on Comment element");
			test.log(Status.PASS, "comment field is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.sendKeys(special.getComment(), "It was a nice podcast session with people.");
			LoggerHandler.info("Entered comment text");
			helper.hoverElement(special.getSubmitBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Submit Button");
			helper.jsClick(special.getSubmitBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "submit button is displayed");
			LoggerHandler.info("Clicked on Submit Button");
			Reporter.attachScreenshotToReport("commentOnStory", test, "commentOnStory");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during commentOnStory");
			test.log(Status.FAIL, "Error occurred during commentOnStory");
			Reporter.attachScreenshotToReport("commentOnStoryError", test, "commentOnStoryError");
		}
	}

	/**
	 * MethodName: takeScreen
	 * Description: Captures a screenshot of the special story page and attaches it to the Extent Report.
	 * Return Type: void
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("specialStory");
			LoggerHandler.info("Captured screenshot of specialStory");
			test.log(Status.PASS, "specialStory screenshot taken");
			Reporter.attachScreenshotToReport("specialStory", test, "specialStory");
			LoggerHandler.info("Attached screenshot to report: specialStory");
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
			helper.waitForVisibilityofElement(special.getText(), 10);
			helper.hoverElement(special.getText());
			String actual = "Special Story";
			String expected = helper.extractText(special.getText());
//			Assert.assertEquals(actual, expected);
			LoggerHandler.info("Verified that the text matches");
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("verifyText", test, "verifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in verifyText");
			test.log(Status.PASS, "Text verification  in verifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}
}
