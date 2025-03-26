package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingcartPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement shoppingcart_xpath;

    public ShoppingcartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickShoppingCart() {
        shoppingcart_xpath.click();
    }
}


