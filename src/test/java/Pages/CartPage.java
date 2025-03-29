package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourCartText_xpath;

    @FindBy(className = "inventory_item_name")
    WebElement inventory_item_name_class;

    @FindBy(id = "Remove")
    WebElement Remove_id;

    @FindBy(id = "continue-shopping")
    WebElement ContinueShopping_id;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Validate that you are in the cart page.
    public void verifyYourCartText() {
        YourCartText_xpath.isDisplayed();
    }

    //Check if the correct inventory item is in the cart

    public <clickRemove> void checkInventoryItemName() {
        inventory_item_name_class.getText();

        //Click the remove button if the incorrect inventory item is in the cart.

        public static clickRemove;
        Remove_id.click();
        {
            //Click back the 'continue shopping button' to re-select the correct inventory item.
            public void clickContinueShopping;
            ContinueShopping_id.click();

            //If the correct inventory item is in the cart, click the checkout button to proceed to the checkout page.
            public void clickCheckout;
            {
                checkout_id.click();

            }

        }


    }
}