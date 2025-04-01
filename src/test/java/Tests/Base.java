package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {


    BrowserFactory browserFactory = new BrowserFactory();



    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    AddtocartPage addtocartPage = PageFactory.initElements(driver, AddtocartPage.class);
    FinishPage finishPage = PageFactory.initElements(driver, FinishPage.class);
    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;


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
