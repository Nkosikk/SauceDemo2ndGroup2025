package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.pageFactory;


public class Base {

    BrowserFactory browserFactory=new BrowserFactory();

    final WebDriver driver=browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

    CheckOutInformationPage checkOutInformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);

    CheckOutOverviewPage checkOutOverviewPage = PageFactory.initElements(driver, CheckOutOverviewPage.class);

    CompletePage CompletePage = PageFactory.initElements(driver, CompletePage.class);

    TakeScreenshots takeScreenshots = new TakeScreenshots();

}
