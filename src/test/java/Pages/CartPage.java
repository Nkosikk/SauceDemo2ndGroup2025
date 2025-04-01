package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By cartItem = By.className("inventory_item_name");
    By checkoutBtn = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getItemName() {
        return driver.findElement(cartItem).getText();
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}
