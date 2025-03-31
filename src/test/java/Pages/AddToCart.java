package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCart {
    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
        WebElement addToCartButton_id2;
    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void AddToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartButton_id));
        addToCartButton_id.click();
    }

    public void AddToCart2() {
        addToCartButton_id2.click();
    }

}