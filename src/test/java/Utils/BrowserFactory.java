package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice,String url) {
        if (browserChoice.equalsIgnoreCase("Chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            driver= new ChromeDriver(chromeOptions);
        }else if (browserChoice.equalsIgnoreCase("internexplorer")){
            driver = new EdgeDriver();
        }else if (browserChoice.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();
        }else if (browserChoice.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }else {
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return  driver;
    }

    @Test
    public void test(){
        WebDriver chrome = startBrowser("edge", "https://www.saucedemo.com/");
    }
}
