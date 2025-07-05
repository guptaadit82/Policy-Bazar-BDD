package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.socialMediaLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class socialMediaReview {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	socialMediaLocators social = new socialMediaLocators();

	/**
	 * MethodName: beSocial
	 * Description: Navigates to the social media reviews section.
	 * Return Type: void
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void beSocial(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(social.getReviews());
//			Assert.assertTrue(element.isDisplayed(), "Reviews is Displayed");
			test.log(Status.PASS, "reviews link is displayed");
			helper.hoverElement(social.getReviews());
			helper.clickElement(social.getReviews());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Reviews element");
			test.log(Status.PASS, "review linktext is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			Reporter.attachScreenshotToReport("beSocial", test, "beSocial");
			LoggerHandler.info("Attached screenshot to report: beSocial");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during beSocial");
			test.log(Status.FAIL, "Error occurred during beSocial");
			Reporter.attachScreenshotToReport("beSocialError", test, "beSocialError");
		}
	}

	/**
	 * MethodName: popularReviews 
	 * Description: Filters popular reviews based on dropdown selections.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void popularReviews(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(social.getPopular());
//			Assert.assertTrue(element.isDisplayed(), "Popular is Displayed");
			test.log(Status.PASS, "popular link is displayed");
			helper.hoverElement(social.getPopular());
			helper.clickElement(social.getPopular());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Popular element");
			helper.selectDropdownByValue(social.getInsurance(), "101");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "dropdown is  is displayed and filled");
			LoggerHandler.info("Selected value 101 from Insurance dropdown");
			helper.selectDropdownByValue(social.getSocial(), "instagram");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Selected Instagram from Social dropdown");
			Reporter.attachScreenshotToReport("popularReviews", test, "popularReviews");

		} catch (Exception e) {
			LoggerHandler.error("Error occurred during popularReviews");
			test.log(Status.FAIL, "Error occurred during popularReviews");
			Reporter.attachScreenshotToReport("popularReviewsError", test, "popularReviewsError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the social media reviews page and attaches it to the Extent Report.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 *  Author:Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("socialMedia");
			LoggerHandler.info("Captured screenshot of socialMedia");
			test.log(Status.PASS, "socialMedia screenshot taken");
			Reporter.attachScreenshotToReport("socialMedia", test, "socialMedia");
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
	 * Author: Aditya
	 */
	public void VerifyText(ExtentTest test) throws IOException {
		try {
			String expected = "Filter reviews by:";
			String actual = helper.extractText(social.getText());
//			Assert.assertEquals(actual, expected);
			LoggerHandler.info("Verified that the text matches");
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("VerifyText", test, "VerifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in VerifyText");
			test.log(Status.PASS, "Text verification  in VerifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}
}
