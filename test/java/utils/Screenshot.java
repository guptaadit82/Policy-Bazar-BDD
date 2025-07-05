package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Base {

    /**
     * MethodName: captureScreen
     * Description: Captures a screenshot with a given name, includes a timestamp, and saves it to the "screenshots" directory.
     * Return Type: void
     * Parameter: String name
     * Author Name: Aditya
     */
    public static void captureScreen(String name) {
        try {
            File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File sDir = new File("screenshots");

            if (!sDir.exists()) {
                sDir.mkdir();
            }
            
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filename = "./screenshots/" + name + "_" + timestamp + ".png";

            FileHandler.copy(ss, new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
