package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class PurchaseClothes {

    @Test
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update this path
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Browser opened and navigated to the URL");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Log in
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);  // Wait for page load

            wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys("Sbuko");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name"))).sendKeys("Madela");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))).sendKeys("1709");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("continue"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}