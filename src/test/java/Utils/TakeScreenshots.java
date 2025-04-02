package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.File;

public class TakeScreenshots {

    private static final String ScreenshotDir = System.getProperty("user.dir") + "/Screenshots/";

    public void takeSnapShot(WebDriver driver, String ScreenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(ScreenshotDir, ScreenshotName + ".png");

        try {
            FileUtils.copyFile(src,destination);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
