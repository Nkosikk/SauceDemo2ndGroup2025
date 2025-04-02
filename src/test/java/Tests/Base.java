package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {


    BrowserFactory browserFactory= new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    protected void takeScreenshots(String screenshotName) {
        takeScreenshots.takesSnapShot(driver, screenshotName);
    }

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    CheckoutYourCart checkoutYourCart = PageFactory.initElements(driver, CheckoutYourCart.class);

    CheckoutOverview checkoutOverview = PageFactory.initElements(driver, CheckoutOverview.class);

    CheckoutInfoPage checkoutInfoPage = PageFactory.initElements(driver, CheckoutInfoPage.class);

}
