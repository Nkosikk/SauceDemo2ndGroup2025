package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
    WebDriver driver;
    @FindBy(id ="add-to-cart")
    WebElement addToCart_id;
    @FindBy(id ="shopping_cart_container")
    WebElement shoppingCart_id;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddToCart(){
        addToCart_id.click();
    }
    public void clickShoppingCart(){
        shoppingCart_id.click();
    }
}
