package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserFactory {

    static WebDriver driver;
    static TakeScreenshots takeScreenshots = new TakeScreenshots();

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("ChrOME")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("chrome");
            driver = new ChromeDriver(chromeOptions);
        } else if (browserChoice.equalsIgnoreCase("internetexplore")) {
            driver = new InternetExplorerDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        takeScreenshots.takesSnapShot(driver, "homepage");
        return driver;
    }
    @BeforeTest
    public void setUp(){
        driver = startBrowser("chrome", "https://www.saucedemo.com/");
    }
    @Test
    public void testTitle(){
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        takeScreenshots.takesSnapShot(driver,"titlePage");
        // Add more navigation and screenshot calls as needed

    }
//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }
}
