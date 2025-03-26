package Tests;

import Pages.CartPage;
import Pages.ProductsPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


    public class Base {

        BrowserFactory browserFactory = new BrowserFactory();

        final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);


        TakeScreenshots takeScreenshots = new TakeScreenshots();

    }

