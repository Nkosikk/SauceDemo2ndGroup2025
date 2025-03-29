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
    public boolean isItemInCart(String itemName) {
        try {
            WebElement item = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='" + itemName + "']"));
            return item.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Verify all items in the cart
    public void verifyItemsInCart(String[] expectedItems) {
        for (String itemName : expectedItems) {
            Assert.assertTrue(isItemInCart(itemName), itemName + " is not in the cart.");
        }
    }

    // Take a screenshot
    public void takeScreenshot(String fileName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(src, new File("Screenshots/" + fileName + ".png"));
            System.out.println("The screenshot taken is of: " + fileName);
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
    }

    // Proceed to checkout
    public void checkout() {
        checkout_button_id.click();
    }
}