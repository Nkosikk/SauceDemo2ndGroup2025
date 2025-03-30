package Basics;

import Utils.TakeScreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class StartChrome<string> {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver= new ChromeDriver();
//        driver= new FirefoxDriver();
//        driver= new EdgeDriver();
//        driver= new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        TakeScreenshots takeScreenshots = new TakeScreenshots();

        String ProductText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        TakeScreenshots takeScreenshots1 = new TakeScreenshots();

        String cartText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        driver.findElement(By.xpath("//span[contains(text(), 'Your Cart')]")).getText();
        Thread.sleep(2000);

        TakeScreenshots takeScreenshots2 = new TakeScreenshots();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Sbuko");
        driver.findElement(By.id("last-name")).sendKeys("Madela");
        driver.findElement(By.id("postal-code")).sendKeys("1709");

        TakeScreenshots takeScreenshots3 = new TakeScreenshots();

        driver.findElement(By.id("continue")).click();

        String finishText= (String) driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        TakeScreenshots takeScreenshots4 = new TakeScreenshots();

        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

        driver.findElement(By.id("back-to-products")).click();
class PercentageCalculator {
    public static void main(String[] args) {
        double total = 29.99;
        double percentage = 8.00;

        double result = calculatePercentage(total, percentage);
        System.out.println("29.99 " + percentage + "8% of " + total + " is: $" + result);
    }

    public static double calculatePercentage(double total, double percentage) {
        return (total * percentage) / 100;
    }
}

        driver.quit();



    }

}
