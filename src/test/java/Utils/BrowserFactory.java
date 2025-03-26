package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("ChroMe")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else if (browserChoice.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    @Test
    public void test() {
        startBrowser("chrome", "https://www.saucedemo.com/");
    }
}
