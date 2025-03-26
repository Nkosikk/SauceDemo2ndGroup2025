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

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBikeLight;

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement shoppingCart;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
    }

    public void addTwoItemsToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartBackpack));
        addToCartBackpack.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartBikeLight));
        addToCartBikeLight.click();
    }

    public void clickShoppingCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(shoppingCart));
        shoppingCart.click();
    }


}
