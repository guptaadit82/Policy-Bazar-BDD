package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter extends Base {
    
    private static ExtentReports reports;
    public static String reportPath;

    /**
     * MethodName: generateReport
     * Description: Generates an ExtentReports report with SparkReporter.
     * Return Type: ExtentReports
     * Parameter: none
     * Author Name: Aditya
     */
    public static ExtentReports generateReport() {
        if (reports == null) {  
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            reportPath = System.getProperty("user.dir") + "/reports/sparks_" + timestamp + ".html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            reports = new ExtentReports();
            reports.attachReporter(spark);
        }
        return reports;
    }

    /**
     * MethodName: screenCapture
     * Description: Takes a screenshot and returns its file path.
     * Return Type: String
     * Parameter: String name
     * Author Name: Aditya
     */
    public static String screenCapture(String name) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String directoryPath = System.getProperty("user.dir") + "/reports/screenshots/";
            File directory = new File(directoryPath);

            if (!directory.exists()) {
                directory.mkdirs();
            }
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filename = name + "_" + timeStamp + ".png";
            String filepath = directoryPath + filename;
            
            File destFile = new File(filepath);
            FileUtils.copyFile(screenshot, destFile);
            return filepath; 
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }

    /**
     * MethodName: attachScreenshotToReport
     * Description: Takes a screenshot and attaches it to the ExtentTest report with a given description.
     * Return Type: void
     * Parameter: String filename, ExtentTest test, String description
     * Author Name: Aditya
     */
    public static void attachScreenshotToReport(String name, ExtentTest test, String description) {
        try {
            String filepath = screenCapture(name);
            test.log(Status.PASS, description, MediaEntityBuilder.createScreenCaptureFromPath(filepath).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getReportPath() {
        return reportPath;
    }
}
