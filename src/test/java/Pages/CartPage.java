package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    // These are the page elements
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement cart_badge;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement cart_item_name;

    @FindBy(id = "checkout")
    WebElement checkout_button_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Verify the cart badge count
    public void verifyCartBadge(int expectedCount) {
        wait.until(visibilityOf(cart_badge));
        Assert.assertEquals(cart_badge.getText(), String.valueOf(expectedCount),
                "Cart badge count is incorrect.");
    }

    // Verify if a specific item is in the cart
    public boolean isItemInCart() {
        try {
            WebElement item = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='']"));
            return item.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    // Proceed to checkout
    public void checkout() {
        checkout_button_id.click();
    }
}

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class VerifyCartItemTest {
//
//    private WebDriver driver; // Assuming you have your WebDriver initialized
//
//    @Test
//    public void testVerifyItemInCart() {
//        // 1. Navigate to the cart page (assuming this is done in a setup method or previous step)
//        driver.get("YOUR_CART_PAGE_URL");
//
//        // 2. Define the expected item details
//        String expectedProductName = "Awesome T-Shirt";
//
//        // 3. Locate the element containing the product name in the cart
//        // You'll need to inspect the HTML of your cart page to find the correct locator
//        WebElement cartItemElement = driver.findElement(By.xpath("//div[@class='cart-item']//h3[@class='product-name']"));
//
//        // 4. Extract the actual product name from the cart
//        String actualProductName = cartItemElement.getText();
//
//        // 5. Assert that the expected product name matches the actual product name
//        Assert.assertEquals(actualProductName, expectedProductName, "Product name in cart does not match the expected name.");
//
//        // You can add more assertions to verify other details like quantity or price
//        // For example:
//        // WebElement quantityElement = driver.findElement(By.xpath("//div[@class='cart-item']//span[@class='quantity']"));
//        // int actualQuantity = Integer.parseInt(quantityElement.getText());
//        // int expectedQuantity = 1;
//        // Assert.assertEquals(actualQuantity, expectedQuantity, "Product quantity in cart is incorrect.");
//
//        System.out.println("Successfully verified that '" + expectedProductName + "' is in the cart.");
//    }
//}