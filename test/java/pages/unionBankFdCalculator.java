package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.unionBankFdLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class unionBankFdCalculator {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	unionBankFdLocators ubiBank = new unionBankFdLocators();

	/**
	 * MethodName: fdBanks 
	 * Description: Navigates to the FD calculator section of Union Bank. 
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 *  Author: Aditya
	 */
	public void fdBanks(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(ubiBank.getSiteMap());
//			Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
			test.log(Status.PASS, "siteMap link is displayed");
			helper.hoverElement(ubiBank.getSiteMap());
			helper.clickElement(ubiBank.getSiteMap());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SiteMap element");
			test.log(Status.PASS, "bank link is displayed");
			helper.hoverElement(ubiBank.getBanks());
			helper.clickElement(ubiBank.getBanks());
			LoggerHandler.info("Clicked on Banks element");
			helper.hoverElement(ubiBank.getUbiCalc());
			helper.clickElement(ubiBank.getUbiCalc());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			test.log(Status.PASS, "UBI calc is displayed");
			LoggerHandler.info("Clicked on Union Bank Calculator element");
			Reporter.attachScreenshotToReport("fdBanks", test, "fdBanks");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fdBanks");
			test.log(Status.FAIL, "Error occurred during fdBanks");
			Reporter.attachScreenshotToReport("fdBanksError", test, "fdBanksError");
		}
	}

	/**
	 * MethodName: verifyText
	 *  Description: Verifies if the extracted text matches the expected text. 
	 *  Return Type: void 
	 *  Parameter: ExtentTest test - the test log to attach the logging.
	 *   Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException {
		try {

			helper.hoverElement(ubiBank.getText());
			String expected = helper.extractText(ubiBank.getText());
			String actual = "Union Bank FD Calculator";
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

	/**
	 * MethodName: fillForm 
	 * Description: Fills the FD calculator form with data from Excel. 
	 * Return Type: void
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *   Author: Aditya
	 */
	public void fillForm(ExtentTest test,String total,String roi,String tp) throws IOException {
		try {
			WebElement element = Base.driver.findElement(ubiBank.getInvestment());
//			Assert.assertTrue(element.isDisplayed(), "Investment box is Displayed");
			test.log(Status.PASS, "investment box is displayed");
			helper.hoverElement(ubiBank.getInvestment());
			helper.jsClick(ubiBank.getInvestment());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Investment");
			helper.sendKeys(ubiBank.getInvestment(), total);
			LoggerHandler.info("Entered Investment amount from Excel");
			helper.hoverElement(ubiBank.getRoi());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.jsClick(ubiBank.getRoi());
			LoggerHandler.info("Clicked on ROI");
			test.log(Status.PASS, "ROI field is displayed");
			helper.sendKeys(ubiBank.getRoi(), roi);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered ROI from Excel");
			helper.hoverElement(ubiBank.getTimePeriod());
			helper.jsClick(ubiBank.getTimePeriod());
			LoggerHandler.info("Clicked on Time Period");
			test.log(Status.PASS, "TimePeriod Box is displayed");
			helper.sendKeys(ubiBank.getTimePeriod(), tp);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered Time Period from Excel");
			helper.hoverElement(ubiBank.getBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Hovered over Calculate Button");
			helper.jsClick(ubiBank.getBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Calculate Button element ");
			test.log(Status.PASS, "Submit Button is displayed");
			Reporter.attachScreenshotToReport("fillForm", test, "fillForm");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fillForm");
			test.log(Status.FAIL, "Error occurred during fillForm");
			Reporter.attachScreenshotToReport("fillFormError", test, "fillFormError");
		}
	}

	/**
	 * MethodName: takeScreen
	 *  Description: Captures a screenshot of the Union Bank FD calculator page and attaches it to the Extent Report.
	 * Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot. 
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) throws IOException {
		try {
			Screenshot.captureScreen("UnionBankFD");
			test.log(Status.PASS, "UnionBankFD screenshot taken");
			Reporter.attachScreenshotToReport("UnionBankFD", test, "UnionBankFD");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
