package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {

    public WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;
    @FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    WebElement addedToCart_xpath;

    public void clickAddToCart() {
        addToCartButton_id.click();
    }
   // public void clickAddToCart(){
    //    driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-backpack')]")).click();
      //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-bike-light')]")).click();
      //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-test.allthethings()-t-shirt-(red)')]")).click();

    public void verifyAddedToCart() {

        String shoppingCartBadge= addedToCart_xpath.getText();
        Assert.assertEquals(shoppingCartBadge,"1");
    }

    }

