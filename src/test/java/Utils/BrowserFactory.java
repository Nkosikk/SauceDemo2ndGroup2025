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

    // Declare a static WebDriver instance to be used across the class
    static WebDriver driver;

    /**
     * Initializes and starts a web browser based on the provided choice.
     *
     * @param browserChoice The name of the browser to launch (e.g., "chrome", "firefox").
     * @param url           The URL to navigate to after launching the browser.
     * @return The initialized WebDriver instance.
     */
    @BeforeTest
    public static WebDriver startBrowser(String browserChoice, String url) {

        // Check which browser the user wants to start, ignoring case sensitivity
        if (browserChoice.equalsIgnoreCase("ChrOME")) {
            // Set Chrome options (e.g., headless mode)
            ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.addArguments("--headless"); // Runs Chrome in headless mode (no GUI)

            // Initialize ChromeDriver with the specified options
            driver = new ChromeDriver(chromeOptions);
        } else if (browserChoice.equalsIgnoreCase("internetexplore")) {
            // Initialize Internet Explorer Driver
            driver = new InternetExplorerDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            // Initialize Firefox Driver
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("safari")) {
            // Initialize Safari Driver
            driver = new SafariDriver();
        } else {
            // Default to Edge Driver if no valid browser is provided
            driver = new EdgeDriver();
        }

        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Navigate to the specified URL
        driver.get(url);

        // Return the initialized WebDriver instance
        return driver;
    }

    /**
     * Sample test method that attempts to start a browser with an invalid name.
     */
    @Test
    public void test() {
        // Calls startBrowser with an invalid browser name; will default to Edge
        startBrowser("fvgbkjsadmnsa", "https://www.saucedemo.com/");
    }
}
