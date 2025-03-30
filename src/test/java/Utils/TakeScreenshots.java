package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    // Define the directory where screenshots will be saved, using the user's current working directory
    private static final String screenshotDir = System.getProperty("user.dir") + "/Screenshots";

    /**
     * Captures a screenshot of the current browser window.
     *
     * @param driver The WebDriver instance controlling the browser.
     * @param ScreenshotName The name to be assigned to the saved screenshot file.
     */
    public void takesSnapShot(WebDriver driver, String ScreenshotName) {

        // Convert the WebDriver instance to TakesScreenshot to enable screenshot capture
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // Capture the screenshot and store it as a temporary file
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // Define the destination file where the screenshot will be saved
        File destination = new File(screenshotDir, ScreenshotName + ".jpeg");

        try {
            // Copy the screenshot file to the specified destination
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            // Print an error message if file copy operation fails
            e.printStackTrace();
        }
    }



}
