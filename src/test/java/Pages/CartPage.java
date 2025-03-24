package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(className = "inventory_item_name")
    WebElement inventory_item_name_class;

    @FindBy(id = "Remove")
    WebElement Remove_id;

    @FindBy (id = "continue-shopping")
    WebElement ContinueShopping_id;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check if the correct inventory item is in the cart

    public void checkInventoryItemName() {
        inventory_item_name_class.getText();

    //Click the remove button if the incorrect inventory item is in the cart.

    public void clickRemove; {
        Remove_id.click();

    //Click back to the continue shopping button to re-select the correct inventory item.
    public void clickContinueShopping()
    ContinueShopping_id.click();

    //If the correct inventory item is in the cart, click the checkout button to proceed to the checkout page.
    public void clickCheckout()    {
        checkout_id.click();

    }

}






}
