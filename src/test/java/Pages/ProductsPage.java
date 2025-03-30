package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductsPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;

    //Find Inventory name
    @FindBy(className = "inventory_item_name")
    WebElement inventory_item_name_class;

    //Click add-to-cart button to add inventory into cart.
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement AddToCartButton_xpath;

    @FindBy(id = "Remove")
    WebElement RemoveButton_id;

    @FindBy(className = "shopping_cart_link")
    WebElement ShoppingCartLink_class;


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Validate that you in the products page.
    public void verifyProductText(String products) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
//        String productText = productText_xpath.getText();
//        Assert.assertEquals(productText, "Products");
    }

    public void verifyInventoryItemName(String inventoryItemName) {
        inventory_item_name_class.getText().equals(inventoryItemName);
    }

    // If you want to add a specific item to the cart based on its inventory name, you can do it dynamically:
    public void clickAddToCartForItem(String inventoryItemName) {
        WebElement itemAddToCartButton = driver.findElement(By.xpath("//div[contains(@class, 'inventory_item')]//div[text()='" + inventoryItemName + "']" + "/ancestor::div[contains(@class, 'inventory_item')]//button[contains(@class, 'btn_inventory')]"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(itemAddToCartButton));
        itemAddToCartButton.click();
    }

    //to add multiple items to the cart based on different inventory item names
    public void addMultipleItemsToCart(String[] inventoryItemNames) {
        for (String inventoryItemName : inventoryItemNames) {
            clickAddToCartForItem(inventoryItemName);
        }
    }

    // Click on the "Remove" button to remove an item from the cart
    public void clickRemove() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RemoveButton_id));
        RemoveButton_id.click();
    }


    //Locate the "Shopping Cart Container icon" using it's Xpath and click on it
    public void clickShoppingCartLink() {
        ShoppingCartLink_class.click();
    }

}
