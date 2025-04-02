/*package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base
{
    BrowserFactory browserFactory = new BrowserFactory();

    //Why are we not including all browsers like in BrowserFactor.java?
    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);

    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);

    YourInformationPage yourInformationPage = PageFactory.initElements(driver, YourInformationPage.class);

    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);

    BackHomePage backHomePage = PageFactory.initElements(driver, BackHomePage.class);

    ReadFromExcel readFromExcel;
    {
        try
        {
            readFromExcel = new ReadFromExcel();
        }
            catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    //TakeScreenshots takeScreenshots = new TakeScreenshots();
}*/

package Tests;

import Pages.AddToCartPage;
import Pages.LandingPage;
import Pages.LoginPage;
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
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    TakeScreenshots takeScreenshots = new TakeScreenshots();
    AddToCartPage addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);

    ReadFromExcel readFromExcel;
    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //TakeScreenshots takeScreenshots = new TakeScreenshots();
}

