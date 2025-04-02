
package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

//To ensure that the Base class properly initializes the WebDriver instance, you can add an initializeDriver method to the Base class. This method will handle the initialization of the WebDriver instance. Here is how you can do it:
//Add the initializeDriver method to the Base class.
//Move the WebDriver initialization code into this method.
//Call the initializeDriver method in the setUp method of the purchaseItemTests class.
//Here is the updated Base class:

public class Base {

    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();
    LoginPage loginPage;
    LandingPage landingPage;
    AddToCartPage addToCartPage;
    CartPage cartPage;
    ShippingInfoPage shippingInfoPage;
    TakeScreenshots takeScreenshots = new TakeScreenshots();
    ReadFromExcel readFromExcel;

    public void initializeDriver() {
        driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
        cartPage = PageFactory.initElements(driver, CartPage.class);
        shippingInfoPage = PageFactory.initElements(driver, ShippingInfoPage.class);

        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}