package Tests;

import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("Chrome","saucedemo.com");

    LoginPage loginPage = driver.initElement(driver,loginPage);

}


