package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException, IOException {
        // Create screenshots directory if it doesn't exist
        Files.createDirectories(Paths.get("screenshots"));


        // To start a new browser
        driver = new ChromeDriver();
        // Maximize the Windows on Chrome
        driver.manage().window().maximize();
        // Linking/Including the URL
        driver.get("https://www.saucedemo.com/");
        takeScreenshot("screenshots/home_page.png");

        String PageTitle = driver.getTitle();
        System.out.println("Page Title:" + PageTitle);

        // Typing the username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        // Typing the Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        takeScreenshot("screenshots/login_credentials.png");
        Thread.sleep(2000);
        // Clicking on the login button
        driver.findElement(By.id("login-button")).click();
        takeScreenshot("screenshots/login_success.png");

        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText, "Products");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        takeScreenshot("screenshots/added_products.png");
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        takeScreenshot("screenshots/cart_page.png");

        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        takeScreenshot("screenshots/checkout_page.png");

        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Nozipho");
        driver.findElement(By.id("last-name")).sendKeys("Mtsweni");
        driver.findElement(By.id("postal-code")).sendKeys("1012");
        takeScreenshot("screenshots/recipient_details.png");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        takeScreenshot("screenshots/checkout_info.png");

        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        takeScreenshot("screenshots/order_complete.png");

        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        takeScreenshot("screenshots/burger_menu.png");
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        takeScreenshot("screenshots/logout.png");

        Thread.sleep(2000);
    }

    // Method to take a screenshot
    public void takeScreenshot(String filePath) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), Paths.get(filePath));
    }

    // After test is complete, the below test needs to be executed
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}