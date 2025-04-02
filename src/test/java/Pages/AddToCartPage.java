package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCartPage {

    WebDriver driver;
    WebDriverWait wait;

    // These are the page elements
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement item1_add_button;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement item1_remove_button;


    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement cart_link;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement cart_badge;

    // Constructor to initialize the WebDriver and WebDriverWait
    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    //Add 1st item to cart and verify
    public void add1stItem() {
        wait.until(visibilityOf(item1_add_button));
        item1_add_button.click();
        Assert.assertTrue(item1_remove_button.isDisplayed(), "First item was not added to the cart.");
    }


    // Verify the cart badge count
    public void verifyCartBadge(int expectedCount) {
        wait.until(visibilityOf(cart_badge));
        Assert.assertEquals(cart_badge.getText(), String.valueOf(expectedCount),
                "Cart badge count is incorrect.");

    }

    // Go to cart
    public void goToCart() {
        cart_link.click();
    }
}

