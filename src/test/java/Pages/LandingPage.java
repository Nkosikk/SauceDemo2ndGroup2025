package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

        String ProductText = driver.findElement(By.xpath("(//span[@class='title'])[1]")).getText();
        Assert.assertEquals(ProductText, "Products");
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpack_id;

    public void addToCartBackpack() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartBackpack_id));
        addToCartBackpack_id.click();
    }

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBikeLight_id;

    public void addToCartBikeLight() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartBikeLight_id));
        addToCartBikeLight_id.click();
    }

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCart_id;

    public void shoppingCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(shoppingCart_id));
        shoppingCart_id.click();

        String YourCart = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(YourCart, "Your Cart");
    }
}

