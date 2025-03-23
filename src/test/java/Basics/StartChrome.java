package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StartChrome {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        takeScreenshot("LoginPage");
    }

    public void takeScreenshot(String pageName) {
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(srcFile, new File("Screenshots/" + pageName + ".png"));
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + pageName);
        }
    }

    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        takeScreenshot("HomePage");
    }

    @Test(dependsOnMethods = "login")
    public void captureTitle() throws InterruptedException {
        // Get title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Thread.sleep(1000);
        takeScreenshot("TitlePage");
    }

    @Test(dependsOnMethods = "login")
    public void purchase() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        takeScreenshot("CartPage");
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Dineo");
        driver.findElement(By.id("last-name")).sendKeys("Moeti");
        driver.findElement(By.id("postal-code")).sendKeys("1829");
        driver.findElement(By.id("continue")).click();
        takeScreenshot("CheckoutPage");
        driver.findElement(By.id("finish")).click();
        takeScreenshot("OrderConfirmationPage");
    }

    @Test(dependsOnMethods = "purchase")
    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("react-burger-menu-btn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
        takeScreenshot("LogoutPage");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
