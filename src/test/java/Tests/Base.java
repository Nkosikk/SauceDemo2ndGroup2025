package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    // Create an instance of BrowserFactory to manage browser sessions
    BrowserFactory browserFactory = new BrowserFactory();
    // Start a new browser session using Chrome and navigate to the given URL
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
    // Initialize the LoginPage using Selenium's PageFactory to interact with web elements
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    // Initialize the LandingPage using Selenium's PageFactory to interact with web elements after login
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    // Create an instance of TakeScreenshots to handle screenshot capturing
    TakeScreenshots takeScreenshots = new TakeScreenshots();
    // Initialize the AddToCart using Selenium's PageFactory to interact with web elements after login
    AddToCart add2Cart = PageFactory.initElements(driver, AddToCart.class);
    // Initialize the LandingPage using Selenium's PageFactory to interact with web elements after adding to cart
    CheckOut cartPage = PageFactory.initElements(driver, CheckOut.class);
    // Initialize the LandingPage using Selenium's PageFactory to interact with web elements after checkout\
    DeliveryInfoPage deliveryInfo = PageFactory.initElements(driver, DeliveryInfoPage.class);
    // Initialize the LandingPage using Selenium's PageFactory to interact with web elements after entering delivery info
    FinishPage overView = PageFactory.initElements(driver, FinishPage.class);

    LogOut logOut = PageFactory.initElements(driver, LogOut.class);

}
