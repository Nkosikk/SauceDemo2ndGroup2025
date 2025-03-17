package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class StartChrome {


    WebDriver driver;

    public void takeScreenshot(String fileName) {
// Take screenshot and store it as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
// Move image file to folder destination
            FileHandler.copy(src, new File("Screenshots/" + fileName + ".png"));
            System.out.println("The screenshot taken is of: " + fileName);
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
    }

    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver = new ChromeDriver();
//        driver= new FirefoxDriver();
//        driver= new EdgeDriver();
//        driver= new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Take a screenshot after opening the URL
        takeScreenshot("login_page");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Take a screenshot after logging in
        takeScreenshot("after_login");

        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText, "Products");

        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

        // Take a screenshot after verifying the product page
        takeScreenshot("product_page");

//add 1 item to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1500);


// Take a screenshot after adding items to the cart
        takeScreenshot("items_added_to_cart");

//go to cart
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
        Thread.sleep(1500);

// Take a screenshot of the cart
        takeScreenshot("cart_page");


//checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1500);

// Take a screenshot of the checkout page
        takeScreenshot("checkout_page");

        driver.findElement(By.id("first-name")).sendKeys("Lash");
        Thread.sleep(1500);

        driver.findElement(By.id("last-name")).sendKeys("Skosi");
        Thread.sleep(1500);

        driver.findElement(By.id("postal-code")).sendKeys("1632");
        Thread.sleep(1500);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(1500);

// Take a screenshot after entering shipping information
        takeScreenshot("shipping_info_entered");

        driver.findElement(By.id("finish")).click();
        Thread.sleep(1500);

// Take a screenshot after finishing the checkout
        takeScreenshot("checkout_finished");

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1500);

        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(1500);

// Take a screenshot after logging out
        takeScreenshot("after_logout");

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
