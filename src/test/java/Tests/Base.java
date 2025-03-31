package Tests;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();
}
