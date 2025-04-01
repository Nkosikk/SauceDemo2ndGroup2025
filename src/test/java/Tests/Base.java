package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base
{
    BrowserFactory browserFactory = new BrowserFactory();

    //Why are we not including all browsers like in Browserfactor.java?
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);

    YourInformationPage YourInformationPage = PageFactory.initElements(driver, YourInformationPage.class);

    CheckoutOverviewPage CheckoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);

    BackHomePage BackHomePage = PageFactory.initElements(driver, BackHomePage.class);

}
