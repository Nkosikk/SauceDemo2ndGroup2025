package Tests;
import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OldBase {






        //Create instance of Browser factory
        BrowserFactory browserFactory = new BrowserFactory();
        final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        LandingPage landingPage= PageFactory.initElements(driver, LandingPage.class);
        AddToCartPage addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
        CartPage cartPage =  PageFactory.initElements(driver, CartPage.class);
        ShippingInfoPage shippingInfoPage= PageFactory.initElements(driver, ShippingInfoPage.class);

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


