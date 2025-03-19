package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TakeScreenShots {

    private static final String screenShotDir = System.getProperty("user.dir") + "/Screenshots";

    @Test
    public void takesSnapShot(WebDriver driver, String ScreenshotName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenShotDir + "/" + ScreenshotName + ".png");
        try {
            FileUtils.copyFile(source, destination);
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println(screenShotDir);
        }
    }
}
