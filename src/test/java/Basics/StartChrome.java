package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.nio.file.Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartChrome{

    WebDriver driver;

    @Test
    public  void verifyLoginsuccess() throws InterruptedException, IOException {
        driver= new ChromeDriver();
//        driver= new EdgeDriver();
//        driver= new FireFoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        takeScreenshot("Screenshots/login_page.png");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        takeScreenshot("Screenshots/inventory_page.png");
        String ActualResults = driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText();
        Assert.assertEquals(ActualResults, "Products");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        takeScreenshot("Screenshots/add-to-cart_page.png");
        Thread.sleep(2000);
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        takeScreenshot("Screenshots/cart_page.png");
        driver.findElement(By.id("first-name")).sendKeys("Bonisiwe");
        driver.findElement(By.id("last-name")).sendKeys("Nxumalo");
        driver.findElement(By.id("postal-code")).sendKeys("7465");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        takeScreenshot("Screenshots/checkout_page.png");
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        takeScreenshot("Screenshots/checkout_complete_page.png");
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is: " + pageTitle);
    }

    public void takeScreenshot(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        if (Files.exists(path)) {
            Files.delete(path);
        }
        Files.createDirectories(path.getParent());
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), path);
    }

}



