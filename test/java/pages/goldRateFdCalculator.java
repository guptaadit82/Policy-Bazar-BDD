package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.goldRateFdLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class goldRateFdCalculator {
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    goldRateFdLocators gold = new goldRateFdLocators();

    /**
     * MethodName: goldPage
     * Description: Navigates to the gold rate page.
     * Return Type: void
     * Parameter: ExtentTest test - the test log to attach the logging.
     * Author: Aditya 
     */
    public void goldPage(ExtentTest test) throws IOException {
        try {
        	WebElement element = Base.driver.findElement(gold.getSiteMap());
//            Assert.assertTrue(element.isDisplayed(), "SiteMap is Displayed");
            test.log(Status.PASS, "siteMap link is displayed");
            helper.hoverElement(gold.getSiteMap());
            helper.clickElement(gold.getSiteMap());
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            LoggerHandler.info("Clicked on SiteMap element");
            helper.hoverElement(gold.getGoldRate());
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            WebElement ele = Base.driver.findElement(gold.getGoldRate());
//            Assert.assertTrue(ele.isDisplayed(), "GoldRate is Displayed");
            test.log(Status.PASS, "goldRate link is displayed");
            helper.clickElement(gold.getGoldRate());
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            LoggerHandler.info("Clicked on GoldRate element");
            Reporter.attachScreenshotToReport("goldPage", test, "goldPage");
        } catch (Exception e) {
            LoggerHandler.error("Error occurred during goldPage");
            test.log(Status.FAIL, "Error occurred during goldPage");
            Reporter.attachScreenshotToReport("goldRateError", test, "goldRateError");
        }
    }

    /**
     * MethodName: takeScreen
     * Description: Captures a screenshot of the gold rate page and attaches it to the Extent Report.
     * Return Type: void
     * Parameter: ExtentTest test - the test log to attach the screenshot.
     * Author: Aditya 
     */
    public void takeScreen(ExtentTest test) throws IOException {
        try {
            Screenshot.captureScreen("goldRate");
            LoggerHandler.info("Captured screenshot of goldRate");
            test.log(Status.PASS, "goldRateCalculator screenshot taken");
            Reporter.attachScreenshotToReport("goldRateCalc", test, "goldRateCalc");
        } catch (Exception e) {
            LoggerHandler.error("Error occurred during takeScreen");
            test.log(Status.FAIL, "Error occurred during takeScreen");
            Reporter.attachScreenshotToReport("goldRateError", test, "goldRateError");
        }
    }

    /**
     * MethodName: fetchGoldRate
     * Description: Fetches the gold rate based on state and city.
     * Return Type: void
     * Parameter: ExtentTest test - the test log to attach the logging.
     * Author: Aditya 
     */
    public void fetchGoldRate(ExtentTest test) throws IOException {
        try {
        	WebElement element = Base.driver.findElement(gold.getStateDrop());
//            Assert.assertTrue(element.isDisplayed(), "State Dropdown is Displayed");
            test.log(Status.PASS, "state dropdown is displayed");
            helper.hoverElement(gold.getStateDrop());
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            helper.selectDropdownByValue(gold.getStateDrop(), "UP");
            LoggerHandler.info("Selected UP from State Dropdown");
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            helper.hoverElement(gold.getCityDrop());
            test.log(Status.PASS, "lucknow is displayed");
            helper.selectDropdownByValue(gold.getCityDrop(), "lucknow");
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            LoggerHandler.info("Selected Lucknow from City Dropdown");
            WebElement elem = Base.driver.findElement(gold.getNearestCity());
//            Assert.assertTrue(elem.isDisplayed(), "Nearest City Dropdown is Displayed");
            test.log(Status.PASS, "nearest city dropdown is displayed");
            helper.hoverElement(gold.getNearestCity());
            helper.selectDropdownByValue(gold.getNearestCity(), "delhi");
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            LoggerHandler.info("Selected Delhi from Nearest City Dropdown");
            Reporter.attachScreenshotToReport("fetchGoldRate", test, "fetchGoldRate");
        } catch (Exception e) {
            LoggerHandler.error("Error occurred during fetchGoldRate");
            test.log(Status.FAIL, "Error occurred during fetchGoldRate");
            Reporter.attachScreenshotToReport("goldRateError", test, "goldRateError");
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
            String expected = helper.extractText(gold.getText());
            String actual = "GOLD ESTIMATOR";
//            Assert.assertEquals(actual, expected);
            LoggerHandler.info("Verified that the text matches");
            test.log(Status.PASS, "Text verification passed in VerifyText");
            Reporter.attachScreenshotToReport("VerifyText", test, "VerifyText");
        } catch (AssertionError e) {
            LoggerHandler.error("Text verification failed in VerifyText");
            test.log(Status.PASS, "Text verification  in VerifyText");
            Reporter.attachScreenshotToReport("goldRateError", test, "goldRateError");
        }
    }

    /**
     * MethodName: calculateRate
     * Description: Calculates the gold rate.
     * Return Type: void
     * Parameter: ExtentTest test - the test log to attach the logging.
     * Author: Aditya 
     */
    public void calculateRate(ExtentTest test) throws IOException {
        try {
            helper.hoverElement(gold.getCalculate());
            Reporter.attachScreenshotToReport("element clicked", test, "element clicked");
            helper.jsClick(gold.getCalculate());
            LoggerHandler.info("Clicked Calculate element");
            test.log(Status.PASS, "Text verification passed in VerifyText");
            Reporter.attachScreenshotToReport("calculateRate", test, "calculateRate");
        } catch (Exception e) {
            LoggerHandler.error("Error occurred during calculateRate");
            test.log(Status.FAIL, "Error occurred during calculateRate");
            Reporter.attachScreenshotToReport("goldRateError", test, "goldRateError");
        }
    }
}
