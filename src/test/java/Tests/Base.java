package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);

    CheckoutYourInformationPage yourInformationPage = PageFactory.initElements(driver, CheckoutYourInformationPage.class);

    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);

    CheckoutCompletePage checkoutCompletePage = PageFactory.initElements(driver, CheckoutCompletePage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();
}
