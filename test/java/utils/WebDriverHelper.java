package utils;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * MethodName: clickElement
     * Description: Clicks an element located by the given locator.
     * Return Type: void
     * Parameter: By locator
     * Author Name: Aditya
     */
    public void clickElement(By locator) {
        try {
            WebElement elem = driver.findElement(locator);
            elem.click();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: hoverElement
     * Description: Hovers over an element located by the given locator.
     * Return Type: void
     * Parameter: By locator
     * Author Name: Aditya
     */
    public void hoverElement(By locator) {
        try {
            Actions act = new Actions(driver);
            WebElement elem = driver.findElement(locator);
            act.moveToElement(elem).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: scrollToElement
     * Description: Scrolls to an element located by the given locator.
     * Return Type: void
     * Parameter: By locator
     * Author Name: Aditya
     */
    public void scrollToElement(By locator) {
        try {
            WebElement elem = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", elem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: switchToNewWindow
     * Description: Switches to a new window.
     * Return Type: void
     * Parameter: none
     * Author Name: Aditya
     */
    public void switchToNewWindow() {
    	try {
            Set<String> windowHandles = driver.getWindowHandles();
            for (String s : windowHandles) {
                if (!s.isEmpty()) {
                    driver.switchTo().window(s);
                } else {
                    throw new Exception("New window does not exists");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: selectDropdownByValue
     * Description: Selects a dropdown option by its value.
     * Return Type: void
     * Parameter: By locator, String value
     * Author Name: Aditya
     */
    public void selectDropdownByValue(By locator, String value) {
        try {
            WebElement elem = driver.findElement(locator);
            Select dropdown = new Select(elem);
            dropdown.selectByValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * MethodName: extractText
     * Description: Extracts text from an element located by the given locator.
     * Return Type: String
     * Parameter: By locator
     * Author Name: Aditya
     */
    public String extractText(By locator) {
        try {
            WebElement elem = driver.findElement(locator);
            return elem.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * MethodName: waitForVisibilityofElement
     * Description: Waits for the visibility of an element located by the given locator.
     * Return Type: void
     * Parameter: By locator, int seconds
     * Author Name: Aditya
     */
    public void waitForVisibilityofElement(By locator, int seconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(seconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: sendKeys
     * Description: Sends keys to an element located by the given locator.
     * Return Type: void
     * Parameter: By locator, String data
     * Author Name: Aditya
     */
    public void sendKeys(By locator, String data) {
        try {
            WebElement elem = driver.findElement(locator);
            elem.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: enterAction
     * Description: Simulates pressing the Enter key on an element located by the given locator.
     * Return Type: void
     * Parameter: By locator
     * Author Name: Aditya
     */
    public void enterAction(By locator) {
        try {
            WebElement elem = driver.findElement(locator);
            elem.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: jsClick
     * Description: Clicks an element using JavaScript.
     * Return Type: void
     * Parameter: By locator
     * Author Name: Aditya
     */
    public void jsClick(By locator) {
        try {
            WebElement elem = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", elem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
