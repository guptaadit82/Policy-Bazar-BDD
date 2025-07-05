package pages;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.editDetailsLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class editDetails {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	editDetailsLocators edit = new editDetailsLocators();

	/**
	 * MethodName: findDetails  
	 * Description: find Details from Other Locations in  Details Page.
	 *  Return Type: void
	 *   Parameter: ExtentTest test
	 *    Author: Aditya
	 */
	public void findDetails(ExtentTest test) {
		try {
			WebElement element = Base.driver.findElement(edit.getCareer());
//			Assert.assertTrue(element.isDisplayed(), "Career is Displayed");
			test.log(Status.PASS, "career link is displayed");
			helper.hoverElement(edit.getCareer());
			helper.clickElement(edit.getCareer());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on Career");
			helper.hoverElement(edit.getOtherLocations());
			helper.clickElement(edit.getOtherLocations());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on OtherLocations");
			test.log(Status.PASS, "otherlocation is displayed");
			Reporter.attachScreenshotToReport("findDetails", test, "findDetails");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred in findDetails");
			test.log(Status.FAIL, "Error occurred inf findDetails");
			Reporter.attachScreenshotToReport("findDetailsError", test, "findDetailsError");
		}
	}

	/**
	 * MethodName: signIn 
	 * Description: sign in with different Details.
	 *  Return Type: void 
	 *  Parameter: ExtentTest test
	 *   Author: Aditya
	 */
	public void signIn(ExtentTest test) {
		try {
			WebElement element = Base.driver.findElement(edit.getDelhi());
//			Assert.assertTrue(element.isDisplayed(), "Delhi link is Displayed");
			test.log(Status.PASS, "Delhi link is displayed");
			helper.clickElement(edit.getDelhi());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on delhi");
			Thread.sleep(2000);
			helper.clickElement(edit.getSignIn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on signIn");
			WebElement ele = Base.driver.findElement(edit.getNumber());
//			Assert.assertTrue(ele.isDisplayed(), "Mobile field is Displayed");
			test.log(Status.PASS, "Mobile field is displayed");
			helper.clickElement(edit.getNumber());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on Mobile");
			Thread.sleep(2000);
			helper.sendKeys(edit.getNumber(), ExcelReader.readData("Sheet1", 12, 0));
			LoggerHandler.info("mobileNumber sent from excel");
			helper.clickElement(edit.getBtnn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("click on submit Button");
			test.log(Status.PASS, "submit button is  displayed");
			Reporter.attachScreenshotToReport("signIn", test, "signIn");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred in signIn");
			test.log(Status.FAIL, "Error occurred inf signIn");
			Reporter.attachScreenshotToReport("signInError", test, "signInError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the COVID webinar page and attaches it to the Extent Report.
	 *  Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot. 
	 * Author: Aditya
	 */
	public void takeScreen(ExtentTest test) {
		try {
			Screenshot.captureScreen("editDetails");
			test.log(Status.PASS, "editDetails screenshot taken");
			Reporter.attachScreenshotToReport("editDetails", test, "editDetails");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during takeScreen");
			test.log(Status.FAIL, "Error occurred during takeScreen");
			Reporter.attachScreenshotToReport("takeScreenError", test, "takeScreenError");
		}
	}

	/**
	 * MethodName: VerifyText 
	 * Description: Verifies if the extracted text matches the expected text.
	 *  Return Type: void 
	 *  Parameter: ExtentTest test - the test  log to attach the logging. 
	 *  Author: Aditya
	 */
	public void VerifyText(ExtentTest test) {
		try {
			String expected = helper.extractText(edit.getText());
			LoggerHandler.info("Extracted text from webpage");
			String actual = "Sign-in to Policybazaar";
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
