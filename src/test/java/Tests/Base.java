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

        final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        CheckOutInformationPage checkoutinformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);
        CheckOutOverviewPage checkoutoverviewPage = PageFactory.initElements(driver, CheckOutOverviewPage.class);
        CheckOutCompletePage checkoutcompletePage = PageFactory.initElements(driver, CheckOutCompletePage.class);

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

