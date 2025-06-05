package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    private static final String screenshotDir = System.getProperty("user.dir") + "/Screenshots";


    public void takesSnapShot(WebDriver driver, String ScreenshotName) throws IOException {

        File src;
        File destination;

        if (driver.getClass().getSimpleName().equals("ChromeDriver")
                || driver.getClass().getSimpleName().equals("EdgeDriver") || driver.getClass().getSimpleName().equals("SafariDriver")){
            //Option 1
            // Use AShot to take a full-page screenshot
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
                    .takeScreenshot(driver);
            // Save the screenshot
            ImageIO.write(screenshot.getImage(), "jpeg", new File(screenshotDir, ScreenshotName + ".jpeg"));

        } else {
            //Option 2
            src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
            destination = new File(screenshotDir, ScreenshotName + ".jpeg");

            try {
                FileUtils.copyFile(src, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//         TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//         src = takesScreenshot.getScreenshotAs(OutputType.FILE);
//         destination = new File(screenshotDir, ScreenshotName + ".jpeg");
//
//        try {
//            FileUtils.copyFile(src, destination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
