package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
    WebDriver driver;

    @FindBy(id = "Add-to-cart")
            WebElement AddToCart_id;

    @FindBy(id = "Remove")
            WebElement Remove_id;

    @FindBy(className = "shopping_cart_link")
            WebElement ShoppingCartLink_class;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locate the "Add to Cart" button using its ID and click on it
    public void clickAddToCart() {
        AddToCart_id.click();
    }

     //In case you want to remove item "Remove  Cart" button using it's ID and click on it
    public void clickRemove() {
        Remove_id.click();


//Locate the "Shopping Cart Container icon" using it's Xpath and click on it
    public void clickShoppingCartLink() {
        ShoppingCartLink_class.click();
        }

}
