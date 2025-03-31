package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    private static final String screenshotDir = System.getProperty("user.dir") + "/screenshots/";

    public void takeScreenshot(WebDriver driver, String screenshotName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotDir + screenshotName + ".png");

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot taken: " + screenshotName);
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }

    }

    }

