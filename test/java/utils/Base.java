package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;
    Properties prop = new Properties();

    /**
     * MethodName: openChrome
     * Description: Launches a Chrome browser, navigates to the URL specified in the config properties, maximizes the window, and sets timeouts.
     * Return Type: void
     * Parameter: none
     * Author Name: Aditya
     */
    
    public void openChrome() {
        try {
            driver = new ChromeDriver();
            FileInputStream fis = new FileInputStream("./config/config.properties");
            prop.load(fis);
            String url = prop.getProperty("URL");
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (IOException e) {
            System.out.println("Error occurred while loading the properties file: " + e.getMessage());
        }
 }
}