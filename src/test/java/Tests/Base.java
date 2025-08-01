package Tests;

import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.DatabaseConnection;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterUsernameFromDatabase(int id){
        DatabaseConnection.User user = DatabaseConnection.getUserById(id);
        if (user != null) {
            loginPage.enterUsername(user.getUsername());
        } else {
            throw new RuntimeException("User not found in database");
        }
    }
    public void enterPasswordFromDatabase(int id){
        DatabaseConnection.User userPassword = DatabaseConnection.getUserById(id);
        if (userPassword != null) {
            loginPage.enterPassword(userPassword.getPassword());
        } else {
            throw new RuntimeException("User password not found in database");
        }
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();

}
