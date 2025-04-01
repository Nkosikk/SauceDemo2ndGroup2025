package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);


    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);
    ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
    CheckOut checkoutButton = PageFactory.initElements(driver, CheckOut.class);
    UserInfo continueButton = PageFactory.initElements(driver, UserInfo.class);
    PriceCalculator checkoutInfo = PageFactory.initElements(driver, PriceCalculator.class);


}
