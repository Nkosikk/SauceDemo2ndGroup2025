package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenshots {
    private static String screenshotDir = System.getProperty("user.dir") + "/screenshots/";

    public void takeScreenshot(WebDriver driver, String screemshotName ){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFale = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(screenshotDir + screemshotName + ".png");
        try {
            FileUtils.copyFile(srcFale, destFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
