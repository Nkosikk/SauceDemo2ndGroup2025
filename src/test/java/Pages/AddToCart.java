package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
    WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButton2_id;


    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void clickbackpackButton() {
        addToCartButton_id.click();
    }
    public void clickbackbikeButton() {
        addToCartButton2_id.click();
    }
}
