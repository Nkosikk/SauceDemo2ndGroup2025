package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    CheckOutYourInformationPage checkoutyourinformationPage = PageFactory.initElements(driver, CheckOutYourInformationPage.class);

    YourCartPage yourcartPage = PageFactory.initElements(driver, YourCartPage.class);

    CheckOutOverviewPage checkoutoverviewpage = PageFactory.initElements(driver, CheckOutOverviewPage.class);

    CheckOutCompletePage checkoutcompletepage = PageFactory.initElements(driver, CheckOutCompletePage.class);

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

