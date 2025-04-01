package Tests;

import Pages.CheckOutPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.YourCartPage;
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
