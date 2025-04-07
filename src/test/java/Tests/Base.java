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
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);
    VerifyYourCartPage verifyYourCartPage = PageFactory.initElements(driver, VerifyYourCartPage.class);
    VerifyInformationPage verifyInformationPage = PageFactory.initElements(driver, VerifyInformationPage.class);
    CheckOutOverviewPage checkOutOverviewPage = PageFactory.initElements(driver, CheckOutOverviewPage.class);
    VerifyCompletePurchasePage verifyCompletePurchasePage = PageFactory.initElements(driver, VerifyCompletePurchasePage.class);
    VerifyCheckOutPage verifyCheckOutPage = PageFactory.initElements(driver, VerifyCheckOutPage.class);
    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();
}
