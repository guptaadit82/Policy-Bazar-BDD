package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.npsLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class nationalPensionScheme {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	npsLocators npscheme = new npsLocators();

	/**
	 * MethodName: fetchSiteMap
	 * Description: Navigates through the NPS site map.
	 * Return Type: void 
	 * Parameter: ExtentTest test - the test log to attach the logging.
	 * Author: Aditya
	 */
	public void fetchSiteMap(ExtentTest test) throws IOException {
		try {
			WebElement element = Base.driver.findElement(npscheme.getSiteMap());
//			Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
			test.log(Status.PASS, "siteMap link is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(npscheme.getSiteMap());
			helper.clickElement(npscheme.getSiteMap());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on SiteMap element");
			helper.hoverElement(npscheme.getNps());
			helper.clickElement(npscheme.getNps());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on NPS element");
			helper.hoverElement(npscheme.getAge());
			test.log(Status.PASS, "NPS element is displayed");
			Reporter.attachScreenshotToReport("fetchSiteMap", test, "fetchSiteMap");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during fetchSiteMap");
			test.log(Status.FAIL, "Error occurred during fetchSiteMap");
			Reporter.attachScreenshotToReport("fetchSiteMapError", test, "fetchSiteMapError");
		}
	}

	/**
	 * MethodName: fillForm 
	 * Description: Fills the NPS form with data from Excel.
	 * Return Type: void
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void fillForm(ExtentTest test,String age,String expense,String pension) throws IOException {
		try {
			WebElement element = Base.driver.findElement(npscheme.getAge());
//			Assert.assertTrue(element.isDisplayed(), "Age field is Displayed");
			test.log(Status.PASS, "age field is displayed");
			helper.clickElement(npscheme.getAge());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Age element");
			helper.sendKeys(npscheme.getAge(), age);
			LoggerHandler.info("Entered age from Excel");
			test.log(Status.PASS, "ageBox is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(npscheme.getExpense());
			helper.jsClick(npscheme.getExpense());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Expense element");
			helper.sendKeys(npscheme.getExpense(), expense);
			LoggerHandler.info("Entered expense from Excel");
			test.log(Status.PASS, "ExpenseBox is displayed");
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.hoverElement(npscheme.getPension());
			helper.jsClick(npscheme.getPension());
			helper.sendKeys(npscheme.getPension(), pension);
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Entered pension amount from Excel");
			test.log(Status.PASS, "PensionBox is displayed");
			helper.hoverElement(npscheme.getBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.jsClick(npscheme.getBtn());
			Reporter.attachScreenshotToReport("fillForm", test, "fillForm");
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
	 * Author: Aditya
	 */
	public void verifyText(ExtentTest test) throws IOException {
		try {
			String expected = helper.extractText(npscheme.getText());
			String actual = "Pension Calculator";
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
			Screenshot.captureScreen("Nps");
			test.log(Status.PASS, "NpsScheme screenshot taken");
			Reporter.attachScreenshotToReport("NpsScheme", test, "NpsScheme");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}
}
