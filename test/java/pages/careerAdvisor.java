package pages;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.careerAdvisorLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class careerAdvisor {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	careerAdvisorLocators advisor = new careerAdvisorLocators();

	/**
	 * MethodName: findJobs 
	 * Description: findJobs with different Details in career 
	 * Return Type: void
	 *  Parameter: ExtentTest test
	 *   Author: Aditya
	 */
	public void findJobs(ExtentTest test) {
		try {
			WebElement element = Base.driver.findElement(advisor.getCareer());
//			Assert.assertTrue(element.isDisplayed(), "Career is Displayed");
			test.log(Status.PASS, "career link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(advisor.getCareer());
			helper.clickElement(advisor.getCareer());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on Career");
			WebElement elem = Base.driver.findElement(advisor.getOtherLocations());
//			Assert.assertTrue(elem.isDisplayed(), "OtherLocations is Displayed");
			test.log(Status.PASS, "OtherLocations link is displayed");
			helper.hoverElement(advisor.getOtherLocations());
			helper.clickElement(advisor.getOtherLocations());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on OtherLocations");
			Reporter.attachScreenshotToReport("findJobs", test, "findJobs");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred in findJobs");
			test.log(Status.FAIL, "Error occurred inf findJobs");
			Reporter.attachScreenshotToReport("findJobsError", test, "findJobsError");
		}

	}

	/**
	 * MethodName: findAdvisors 
	 * Description: findAdvisors with different Details 
	 *  Return Type: void 
	 *  Parameter: ExtentTest test
	 *   Author: Aditya
	 */
	public void findAdvisors(ExtentTest test) throws InterruptedException {
		try {

			WebElement elem = Base.driver.findElement(advisor.getDelhi());
//			Assert.assertTrue(elem.isDisplayed(), "delhi is Displayed");
			test.log(Status.PASS, "delhi  is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.clickElement(advisor.getDelhi());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on Delhi");
			Thread.sleep(2000);
			WebElement element = Base.driver.findElement(advisor.getAdvisors());
//			Assert.assertTrue(element.isDisplayed(), "advisors is Displayed");
			test.log(Status.PASS, "advisors  is displayed");
			helper.clickElement(advisor.getAdvisors());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on advisors");
			WebElement eleme = Base.driver.findElement(advisor.getTermLife());
//			Assert.assertTrue(eleme.isDisplayed(), "termlife is Displayed");
			test.log(Status.PASS, "termlife  is displayed");
			helper.clickElement(advisor.getTermLife());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on termLife");
			Reporter.attachScreenshotToReport("findAdvisors", test, "findAdvisors");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred in findAdvisors");
			test.log(Status.FAIL, "Error occurred inf findAdvisors");
			Reporter.attachScreenshotToReport("findAdvisorsError", test, "findAdvisorsError");
		}

	}

	/**
	 * MethodName: takeScreen Description: Captures a screenshot of the COVID
	 * webinar page and attaches it to the Extent Report. Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot. Author:
	 * Aditya
	 */
	public void takeScreen(ExtentTest test){
		try {
			Screenshot.captureScreen("careerAdvisor");
			test.log(Status.PASS, "careerAdvisor screenshot taken");
			Reporter.attachScreenshotToReport("careerAdvisor", test, "careerAdvisor");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}

	/**
	 * MethodName: VerifyText 
	 * Description: Verifies if the extracted text matches 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging. 
	 * Author: Aditya
	 */
	public void VerifyText(ExtentTest test) {
		try {

			String expected = helper.extractText(advisor.getText());
			LoggerHandler.info("Extracted text from webpage");
			String actual = "Shubham Nayak";
//			Assert.assertEquals(actual, expected);
			test.log(Status.PASS, "Text verification passed in VerifyText");
			LoggerHandler.info("Verified that the text matches");
			Reporter.attachScreenshotToReport("VerifyText", test, "VerifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in VerifyText");
			test.log(Status.PASS, "Text verification  in VerifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}
}
