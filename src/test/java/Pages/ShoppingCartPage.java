package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    WebDriver driver;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart_class;

    public void shoppingCart(WebDriver driver){
        this.driver = driver;

    }
    public void clickShoppingCartBtn(){
        shoppingCart_class.click();
    }
}
