package Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class StartChrome {

    WebDriver driver;

    @Test
    public void completePurchase()throws InterruptedException, IOException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Step 1 - Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Step 2 - Verify successful login
        String heading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(heading, "Products");

        // Step 3 - Screenshot after login
        takeScreenshot("Screenshots/1_logged_in.png");
        Thread.sleep(2000);
        // Step 4 - Add item to cart
        WebElement addItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addItem.click();

        // Step 5 - Verify item is added to cart
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartCount, "1");

        // Step 6 - Screenshot after adding to cart
        takeScreenshot("Screenshots/2_item_added_to_cart.png");
        Thread.sleep(2000);

        // Step 7 - Navigate to cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Step 8 - Verify item in cart
        String cartItem = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(cartItem, "Sauce Labs Backpack");

        // Step 9 - Screenshot of cart
        takeScreenshot("Screenshots/3_cart_page.png");
        Thread.sleep(2000);

        // Step 10 - Click checkout
        driver.findElement(By.id("checkout")).click();

        // Step 11 - Verify on checkout info page
        String infoTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(infoTitle, "Checkout: Your Information");

        // Step 12 - Fill in details
        driver.findElement(By.id("first-name")).sendKeys("Bonisiwe");
        driver.findElement(By.id("last-name")).sendKeys("Nxumalo");
        driver.findElement(By.id("postal-code")).sendKeys("7465");

        // Step 13 - Screenshot of info form
        takeScreenshot("Screenshots/4_checkout_info.png");
        Thread.sleep(2000);
        // Step 14 - Continue
        driver.findElement(By.id("continue")).click();

        // Step 15 - Verify overview screen
        String overviewTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(overviewTitle, "Checkout: Overview");

        // Step 16 - Verify item is visible
        String overviewItem = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(overviewItem, "Sauce Labs Backpack");

        // Step 17 - Screenshot of overview page
        takeScreenshot("Screenshots/5_checkout_overview.png");
        Thread.sleep(2000);
        // Step 18 - Verify total = item total + tax
        String itemTotalText = driver.findElement(By.className("summary_subtotal_label")).getText(); // e.g., "Item total: $29.99"
        String taxText = driver.findElement(By.className("summary_tax_label")).getText();             // e.g., "Tax: $2.40"
        String totalText = driver.findElement(By.className("summary_total_label")).getText();         // e.g., "Total: $32.39"

        double itemTotal = Double.parseDouble(itemTotalText.replace("Item total: $", ""));
        double tax = Double.parseDouble(taxText.replace("Tax: $", ""));
        double total = Double.parseDouble(totalText.replace("Total: $", ""));

        // Step 19 - Compare values and proceed
        if (Math.abs((itemTotal + tax) - total) < 0.01) {
            driver.findElement(By.id("finish")).click();

            // Verify confirmation message
            String confirmationMessage = driver.findElement(By.className("complete-header")).getText();
            Assert.assertEquals(confirmationMessage, "Thank you for your order!");
            takeScreenshot("Screenshots/6_order_complete.png");
        } else {
            driver.findElement(By.id("cancel")).click();
            takeScreenshot("Screenshots/6_order_cancelled.png");
        }

        // Step 20 - Logout
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        takeScreenshot("Screenshots/7_logged_out.png");

        driver.quit();
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
