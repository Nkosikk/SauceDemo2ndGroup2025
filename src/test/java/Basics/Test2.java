package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Files;

public class Test2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Set up ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Define a single screenshots folder - created file manually
        String screenshotsFolder = "screenshots/";

        // Open a website and take a screenshot
        driver.get("https://www.saucedemo.com/");
        takeScreenshot(driver, screenshotsFolder, "opening_website");

        // Login Details
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        takeScreenshot(driver, screenshotsFolder, "after_login");

        // Add 2 items to the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "items_added");

        // Go to the cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "cart_view");

        // Remove 1 item from the cart
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "item_removed");

        // Checkout the cart
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "checkout_page");

        // Fill the form
        driver.findElement(By.id("first-name")).sendKeys("lebo");
        driver.findElement(By.id("last-name")).sendKeys("Blue");
        driver.findElement(By.id("postal-code")).sendKeys("0012");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "form_filled");

        // Finish the checkout
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        takeScreenshot(driver, screenshotsFolder, "order_completed");

        // Click back home
        driver.findElement(By.id("back-to-products")).click();
        takeScreenshot(driver, screenshotsFolder, "back_to_products");

        // Close the browser
        driver.quit();
    }

    // Method to take and save screenshots in the single screenshots folder
    public static void takeScreenshot(WebDriver driver, String folderPath, String testStepName) throws IOException {
        // Generate timestamp for uniqueness
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Set screenshot file name
        String fileName = folderPath + testStepName + "_" + timestamp + ".png";

        // Capture screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(srcFile.toPath(), new File(fileName).toPath());

        System.out.println("Screenshot taken: " + fileName);
    }
}
