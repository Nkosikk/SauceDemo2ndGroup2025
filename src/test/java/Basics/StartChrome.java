package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

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
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String ProductText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");
        System.out.println("Login Success");

        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        Thread.sleep(3000);

        //InventoryPage, click on the first product
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
        System.out.println("Inventory item selected");

        //InventoryItemPage, click add to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
        Thread.sleep(3000);
        System.out.println("Item added to cart");

        //YourCartPage, click checkout
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(3000);
        System.out.println("Item checked out from cart");

        //CheckoutInformationPage, enter first name, last name and zip code
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("James");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Smith");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("2001");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(3000);
        System.out.println("Customer information entered");

        //CheckoutOverviewPage, click finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
        Thread.sleep(3000);
        System.out.println("Product finished checkout");

        //CheckoutCompletePage, verify the text
        String CompleteText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(CompleteText,"Checkout: Complete!");
        System.out.println("Order Completed");

        //Click on the back home button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
        Thread.sleep(3000);
        System.out.println("Back to home page");
        //Click on the menu button
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(3000);
        //Click on the logout button
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
        Thread.sleep(3000);
        System.out.println("Logout successful");
        //Click on the close button

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
        System.out.println("Browser closed");
    }


}
