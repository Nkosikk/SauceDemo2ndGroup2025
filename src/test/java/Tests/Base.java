package Tests;

import Pages.LandingPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("Chrome","saucedemo.com");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver,LandingPage.class);

    ReadFromExcel readFromExcel;


    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    TakeScreenshots takeScreenshots = new TakeScreenshots();

    public void connectMyDB() throws SQLException {
        String connectString = "jdbc:sq;server://DESKTOP-GM007,Database = Employees;IntergratedSecurity=true";
        try {
            try(Connection connection = DriverManager.getConnection(connectString)){
                System.out.println("connection established");

        }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}


