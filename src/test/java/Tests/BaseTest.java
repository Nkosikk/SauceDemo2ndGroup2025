package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    private WebDriver driver;
    private final String AUT_URL= "https://www.saucedemo.com/";
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AUT_URL);
        loginPage= new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){     //the benefit of having BaseTest is to avoid setup and teardown in every test class
        driver.quit();
    }
}
