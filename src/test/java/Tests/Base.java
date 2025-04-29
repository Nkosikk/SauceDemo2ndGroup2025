package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage homePage = PageFactory.initElements(driver, LandingPage.class);
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    CheckOutInformationPage checkOutInformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);
    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);
    CheckoutCompletePage checkoutCompletePage = PageFactory.initElements (driver, CheckoutCompletePage.class);
    TakeScreenshots takeScreenshots = new TakeScreenshots();

  ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}