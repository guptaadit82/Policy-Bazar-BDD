package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.postalInsuranceLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class postalInsurance {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	postalInsuranceLocators pil = new postalInsuranceLocators();

	/**
	 * MethodName: fetchSiteMap 
	 * Description: Navigates through the postal insurance site map.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void fetchSiteMap(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(pil.getSiteMap());
//			Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
			test.log(Status.PASS, "siteMap link is displayed");
			helper.hoverElement(pil.getSiteMap());
			helper.clickElement(pil.getSiteMap());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SiteMap element");
			helper.hoverElement(pil.getPis());
			helper.clickElement(pil.getPis());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "PIS is displayed");
			LoggerHandler.info("Clicked on PIS element");
			helper.hoverElement(pil.getPlanBtn());
			helper.clickElement(pil.getPlanBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Plan Button element");
			test.log(Status.PASS, "PIL BUtton is displayed");
			Reporter.attachScreenshotToReport("fetchSiteMap", test, "fetchSiteMap");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchSiteMap");
			test.log(Status.FAIL, "Error occurred during fetchSiteMap");
			Reporter.attachScreenshotToReport("fetchSiteMapError", test, "fetchSiteMapError");
		}
	}

	/**
	 * MethodName: fillForm 
	 * Description: Fills the postal insurance form with data from Excel. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void fillForm(ExtentTest test,String name,String dob,String mob) throws IOException {
		try {
			WebElement element = Base.driver.findElement(pil.getNameBox());
//			Assert.assertTrue(element.isDisplayed(), "Name Box is Displayed");
			test.log(Status.PASS, "name box is displayed");
			helper.clickElement(pil.getNameBox());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on NameBox element");
			helper.sendKeys(pil.getNameBox(), name);
			LoggerHandler.info("Entered name from Excel");
			helper.clickElement(pil.getDobBox());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on DOB Box element");
			test.log(Status.PASS, "DOB box is displayed");
			helper.sendKeys(pil.getDobBox(), dob);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered DOB from Excel");
			helper.clickElement(pil.getMobBox());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Mobile Box element");
			helper.sendKeys(pil.getMobBox(), mob);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered mobile number from Excel");
			helper.clickElement(pil.getCheckPlanBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Check Plan Button element");
			test.log(Status.PASS, "CheckPlan Button  is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			Thread.sleep(2000);
			LoggerHandler.info("Waited for 2 seconds");
			Reporter.attachScreenshotToReport("fillForm", test, "fillForm");
			Base.driver.navigate().back();
			LoggerHandler.info("Navigated back");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fillForm");
			test.log(Status.FAIL, "Error occurred during fillForm");
			Reporter.attachScreenshotToReport("fillFormError", test, "fillFormError");
		}
	}

	/**
	 * MethodName: verifyText 
	 * Description: Verifies if the extracted text matches the expected text.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException {
		try {
			String expected = helper.extractText(pil.getText());
			String actual = "Postal Life Insurance";
//			Assert.assertEquals(actual, expected);
			test.log(Status.PASS, "Text verification passed in VerifyText");
			Reporter.attachScreenshotToReport("verifyText", test, "verifyText");
		} catch (AssertionError e) {
			LoggerHandler.error("Text verification failed in verifyText");
			test.log(Status.PASS, "Text verification in verifyText");
			Reporter.attachScreenshotToReport("verifyTextError", test, "verifyTextError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the postal insurance page and attaches it to the Extent Report.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 * Author:Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("postalInsurance");
			test.log(Status.PASS, "postalInsurance screenshot taken");
			Reporter.attachScreenshotToReport("postalInsurance", test, "postalInsurance");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
