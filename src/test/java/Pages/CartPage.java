package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {

    WebDriver driver;
    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void verifyCartItems(String expectedItemName){
        WebElement cartItem = driver.findElement(By.className("inventory_item_name"));
        String actualItemName = cartItem.getText();
       // Assert.assertEquals(actualItemName,expectedItemName, "Cart item name does not match");
    }

    public void proceedToCheckout(){
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton_id.click();
    }

}
