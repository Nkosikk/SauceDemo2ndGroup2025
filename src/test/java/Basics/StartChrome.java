package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver= new ChromeDriver();
//        driver= new FirefoxDriver();
//        driver= new EdgeDriver();
//        driver= new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        //Takescreenshots = new takesnapshots();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String ProductText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");

        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Zandi");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Zulu");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("2034");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='finish']")).click();

    }

    private <string> void takeSnapshot(string screenShotDir, String screenshot1) {

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
