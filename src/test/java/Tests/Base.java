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
    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
    CheckCompletePage checkCompletePage = PageFactory.initElements(driver, CheckCompletePage.class);

    ReadFromExcel readFromExcel;

    {
        readFromExcel = new ReadFromExcel();
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();



}
