package selenium_Core_Features.realTimeExercises_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        System.out.println();

        try {
            // Open a website
            driver.get("https://www.google.com");

            // Take a screenshot and store it as a file
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Define destination for the screenshot
            File destinationFile = new File("C:\\Users\\OM\\Desktop\\Edureka\\ScreenshotsBySelenium\\Screenshot.png");

            // Copy the screenshot to the desired location
            FileUtils.copyFile(sourceFile, destinationFile);

            System.out.println("Screenshot saved successfully!");

        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

