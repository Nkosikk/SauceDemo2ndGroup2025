package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourCartText;

    @FindBy(className = "inventory_item_name")
    WebElement inventory_item_name_class;

    @FindBy(id = "Remove")
    WebElement removeButton_id;

    @FindBy(id = "continue-shopping")
    WebElement ContinueShopping_id;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Validate that you are in the cart page.
    public boolean verifyYourCartText() {
        return YourCartText.isDisplayed();
    }


    //Check if the correct inventory item is in the cart.

    public boolean verifyInventoryItemName(String inventoryItemName) {
        return inventory_item_name_class.getText().equals(inventoryItemName);
    }

    //Click the remove button if the incorrect inventory item is in the cart.
    public void clickRemove() {
        removeButton_id.click();
    }

    //Click back the 'continue shopping button' to re-select the correct inventory item.
    public void clickContinueShopping() {
        ContinueShopping_id.click();
    }

    //If the correct inventory item is in the cart, click the checkout button to proceed to the checkout page.
    public void clickCheckout() {
        checkout_id.click();
    }

    // Combined method to handle the item check and navigation
    public void handleCart(String inventoryItemName) {
        if (!checkInventoryItemName(inventoryItemName)) {
            // If the item is incorrect, remove it and go back to re-select
            clickRemove();
            clickContinueShopping();
        } else {
            // If the item is correct, proceed to checkout
            clickCheckout();
        }


    }

    private boolean checkInventoryItemName(String inventoryItemName) {
        return false;
    }

}
