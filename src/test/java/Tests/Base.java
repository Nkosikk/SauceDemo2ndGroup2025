package Tests;

import Pages.ProductPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base
{
    BrowserFactory browserFactory = new BrowserFactory();

    //Why are we not including all browsers like in Browserfactor.java?
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

}
