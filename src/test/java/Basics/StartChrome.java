package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
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
        driver= new ChromeDriver();
//        driver= new FirefoxDriver();
//        driver= new EdgeDriver();
//        driver= new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        takeScreenshot("Screenshots/LoginPage.png");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        takeScreenshot("Screenshots/HomePage.png");

        String ProductText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");

        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

        // Get the title after logging in
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Add product to cart
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart")).click();
        takeScreenshot("Screenshots/ProductPage.png");

        //go to cart
        Thread.sleep(1000);
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();
        takeScreenshot("Screenshots/CheckoutPage.png");

        //enter checkout details
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Betty");
        driver.findElement(By.id("last-name")).sendKeys("Villa");
        driver.findElement(By.id("postal-code")).sendKeys("9463");
        driver.findElement(By.id("continue")).click();
        takeScreenshot("Screenshots/CheckoutOverviewPage.png");

        //finish purchase
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();
        takeScreenshot("Screenshots/OrderConfirmationPage.png");

        //verify purchase success
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

        //Logout
        Thread.sleep(1000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        takeScreenshot("Screenshots/LogoutPage.png");

        //verify logout
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed();


    }
    public void takeScreenshot(String filePath) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.createDirectories(Paths.get("Screenshots"));
        Files.copy(screenshot.toPath(), Paths.get(filePath));

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
