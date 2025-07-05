package stepdefinitions;

import java.util.Arrays;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;
import utils.SendEmail;

public class hooks extends Base {
    public static ExtentReports report;

    @BeforeAll
    public static void createReport() {
        report = Reporter.generateReport();
        
    }

    @Before
    public void setupBrowser() {
        openChrome();
        
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @AfterAll
    public static void closeReport() {
        report.flush();
//        String path = Reporter.getReportPath();
//        List<String> recipients = Arrays.asList("chinmayshah2002@gmail.com", "Aditya.Gupta6@ltimindtree.com");
//        SendEmail.sendEmailWithAttachment(recipients, "PFA", "report", path);
    }
}
