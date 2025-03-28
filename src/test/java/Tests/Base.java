package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutDetailsPage checkoutDetailsPage = PageFactory.initElements(driver, CheckoutDetailsPage.class);
    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);
    OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();



}
