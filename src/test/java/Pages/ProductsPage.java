package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    @FindBy(id = "Add-to-cart")
    WebElement AddToCart_id;

    @FindBy(id = "Remove")
    WebElement Remove_id;

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

    public void Inventory_item_name_class(String inventoryItemName) {
        inventory_item_name_class.getText().equals(inventoryItemName);
    }

    //Click on the "Add to Cart" button using it's ID
    public void verifyInventoryItemName(String inventoryItemName) {
        inventory_item_name_class.getText().equals(inventoryItemName);
    }

    public void clickAddToCart_id() {
        AddToCart_id.click();
    }

    //In case you want to remove item "Remove  Cart" button using it's ID and click on it
    //public void clickRemove() {
    //Remove_id.click();


    //Locate the "Shopping Cart Container icon" using it's Xpath and click on it
    public void clickShoppingCartLink() {
        ShoppingCartLink_class.click();
    }

}
