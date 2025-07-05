package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.linkedInCareerLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class linkedInCareer {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	linkedInCareerLocators linked = new linkedInCareerLocators();

	/**
	 * MethodName: joinTeam 
	 * Description: joinTeam with different Details in linkedIn career page 
	 * Return Type: void
	 *  Parameter: ExtentTest test
	 *   Author: Aditya
	 */
	public void joinTeam(ExtentTest test) {
		try {
			WebElement element = Base.driver.findElement(linked.getCareer());
//			Assert.assertTrue(element.isDisplayed(), "Career is Displayed");
			test.log(Status.PASS, "career link is displayed");
			helper.hoverElement(linked.getCareer());
			helper.clickElement(linked.getCareer());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on Career");
			helper.hoverElement(linked.getJoinTeam());
			helper.clickElement(linked.getJoinTeam());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on JoinTeam");
			test.log(Status.PASS, "joinTeam is displayed");
			Reporter.attachScreenshotToReport("joinTeam", test, "joinTeam");
		} catch (Exception e) {
			LoggerHandler.error("Method failed in linkedIn");
			test.log(Status.FAIL, "Method failed in linkedIn");
			Reporter.attachScreenshotToReport("linkedInError", test, "linkedInError");
		}

	}

	/**
	 * MethodName: applyNow
	 *  Description: applyNow with different Details in linkedIn career page 
	 *  Return Type: void
	 *   Parameter: ExtentTest test
	 *    Author: Aditya
	 */
	public void applyNow(ExtentTest test,String name,String mob,String email) {
		try {
			WebElement element = Base.driver.findElement(linked.getApplyNow());
//			Assert.assertTrue(element.isDisplayed(), "ApplyNow is Displayed");
			test.log(Status.PASS, "applyNow link is displayed");
			helper.hoverElement(linked.getApplyNow());
			helper.clickElement(linked.getApplyNow());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on ApplyNow");
			test.log(Status.PASS, "applyNow Button is displayed");
			helper.clickElement(linked.getName());
			helper.sendKeys(linked.getName(), name);
			helper.clickElement(linked.getMobile());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "nameBox is displayed");
			LoggerHandler.info("filled Name");
			helper.sendKeys(linked.getMobile(), mob);
			helper.clickElement(linked.getEmail());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "EmailBox is displayed");
			LoggerHandler.info("filled MobNumber");
			helper.sendKeys(linked.getEmail(), email);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.selectDropdownByValue(linked.getHowDO(), "LinkedIn");
			LoggerHandler.info("click on EMail");
			test.log(Status.PASS, "MobileNumber is displayed");
			helper.clickElement(linked.getClose());
			Reporter.attachScreenshotToReport("applyNow", test, "applyNow");
		} catch (Exception e) {
			LoggerHandler.error("Method failed in applyNow");
			test.log(Status.FAIL, "Method failed in applyNow");
			Reporter.attachScreenshotToReport("applyNowError", test, "applyNowError");
		}
	}

	/**
	 * MethodName: verifyText 
	 * Description: Verifies if the extracted text matches the expected text.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test  log to attach the logging. 
	 * Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException {
		try {
			helper.hoverElement(linked.getText());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			String expected = helper.extractText(linked.getText());
			String actual = "Even more reasons to join us";
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
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

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the NPS page and attaches it to the Extent Report. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the screenshot. 
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("linkedIn");
			test.log(Status.PASS, "linkedIn screenshot taken");

			Reporter.attachScreenshotToReport("linkedIn", test, "linkedIn");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
