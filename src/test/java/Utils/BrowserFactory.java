package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  BrowserFactory {
    public

    static WebDriver driver;
    //we are creating a method that will return a WebDriver object
    //this method will take two parameters
    //one is the browser type
    //another is the url
    //this method will return a WebDriver object
    //we will use this method in our

    @BeforeTest
    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/techtorial/Downloads/chromedriver");
            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
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

    @Test
    public void test(){
        startBrowser("efjbkdfbjkhgdvbjkvgdbkn","https://www.saucedemo.com/");
    }


}
