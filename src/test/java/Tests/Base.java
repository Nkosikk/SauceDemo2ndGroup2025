package Tests;

import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {
    // Initialize the WebDriver using BrowserFactory
    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    // Initialize Page Objects
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    @Test
    public void test() {

    }
}




