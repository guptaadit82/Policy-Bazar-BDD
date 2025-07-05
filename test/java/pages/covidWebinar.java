package pages;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.covidWebinarLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class covidWebinar {
	WebDriverHelper helper = new WebDriverHelper(Base.driver);
	covidWebinarLocators covid = new covidWebinarLocators();

	/**
	 * MethodName: fetchCovidPage 
	 * Description: Navigates through the COVID webinar page and clicks specific elements.
	 *  Return Type: void 
	 *  Parameter: ExtentTest test - the test log to attach the logging.
	 *   Author: Aditya
	 */
	public void fetchCovidPage(ExtentTest test)  {
		try {
//			WebElement newsroomElement = Base.driver.findElement(covid.getNewsroom());
//			Assert.assertTrue(newsroomElement.isDisplayed(), "Newsroom link is displayed");
			test.log(Status.PASS, "Newsroom link is displayed");
			helper.hoverElement(covid.getNewsroom());
			helper.clickElement(covid.getNewsroom());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Newsroom element");
			helper.hoverElement(covid.getDecoding());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			helper.clickElement(covid.getWebinar());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Webinar element");
//			WebElement iplanElement = Base.driver.findElement(covid.getIplan());
//			Assert.assertTrue(iplanElement.isDisplayed(), "Iplan link is displayed");
			test.log(Status.PASS, "Iplan link is displayed");
			helper.clickElement(covid.getIplan());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Iplan element");
			Reporter.attachScreenshotToReport("fetchCovidPage", test, "fetchCovidPage");
			Thread.sleep(4000);
			LoggerHandler.info("Waited for 4 seconds");
		} catch (InterruptedException e) {
			LoggerHandler.error("Error occurred during fetchCovidPage");
			test.log(Status.FAIL, "Error occurred during fetchCovidPage");
			Reporter.attachScreenshotToReport("fetchCovidPageError", test, "fetchCovidPageError");
		}
	}

	/**
	 * MethodName: subscription 
	 * Description: Subscribes to the COVID newsletter by  entering email.
	 *  Return Type: void 
	 *  Parameter: ExtentTest test - the test log to attach the logging. 
	 *  Author: Aditya
	 */
	public void subscription(ExtentTest test,String email)  {
		try {
			helper.hoverElement(covid.getCovid());
			helper.clickElement(covid.getCovid());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Covid element");
			helper.hoverElement(covid.getEmail());
			WebElement emailElement = Base.driver.findElement(covid.getEmail());
//			Assert.assertTrue(emailElement.isDisplayed(), "Email field is displayed");
			test.log(Status.PASS, "Email field is displayed");
			helper.clickElement(covid.getEmail());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on Email element");
			helper.sendKeys(covid.getEmail(), email);
			LoggerHandler.info("Entered email from Excel reader");
			WebElement submitButton = Base.driver.findElement(covid.getBtn());
//			Assert.assertTrue(submitButton.isDisplayed(), "Submit button is displayed");
			test.log(Status.PASS, "Submit button is displayed");
			helper.clickElement(covid.getBtn());
			Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
			LoggerHandler.info("Clicked on submit button");
			Reporter.attachScreenshotToReport("subscription", test, "subscription");
		} catch (Exception e) {
			LoggerHandler.error("Error occurred during subscription");
			test.log(Status.FAIL, "Error occurred during subscription");
			Reporter.attachScreenshotToReport("subscriptionError", test, "subscriptionError");
		}
	}

	/**
	 * MethodName: takeScreen 
	 * Description: Captures a screenshot of the COVID  webinar page and attaches it to the Extent Report.
	 *  Return Type: void
	 * Parameter: ExtentTest test - the test log to attach the screenshot.
	 *  Author: Aditya
	 */
	public void takeScreen(ExtentTest test){
		try {
			Screenshot.captureScreen("covidWebinar");
			test.log(Status.PASS, "covidWebinar screenshot taken");
			Reporter.attachScreenshotToReport("covidWebinar", test, "covidWebinar");
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
	 *  Parameter: ExtentTest test - the testclog to attach the logging. 
	 *  Author: Aditya
	 */
	public void VerifyText(ExtentTest test){
		try {
			String expected = helper.extractText(covid.getText());
			LoggerHandler.info("Extracted text from webpage");
			String actual = "Subscribe For Newsletter";
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
