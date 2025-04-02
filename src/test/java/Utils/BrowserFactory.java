package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class  BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("ChrOME")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
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
        return driver;
    }




}

//
//public static WebDriver startBrowser(String browserChoice, String url) {
//    // Convert browserChoice to lowercase for case-insensitivity
//    String lowerCaseBrowserChoice = browserChoice.toLowerCase();
//
//    switch (lowerCaseBrowserChoice) {
//        case "chrome":
//            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
//            driver = new ChromeDriver(chromeOptions);
//            break;
//        case "internetexplorer":
//            driver = new InternetExplorerDriver();
//            break;
//        case "firefox":
//            driver = new FirefoxDriver();
//            break;
//        case "safari":
//            driver = new SafariDriver();
//            break;
//        default:
//            driver = new EdgeDriver();
//            break;
//    }
//    driver.manage().window().maximize();
//    driver.get(url);
//    return driver;
//}
