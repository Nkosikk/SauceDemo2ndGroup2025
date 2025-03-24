package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class InventoryPage {

    WebDriver driver;

    //These are the page elements

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement item1_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement item2_id;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement item3_id;

    @FindBy(xpath="//div[@id='shopping_cart_container']/a")
    WebElement cart_id;


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Add 1st item to cart
    public void add1stItem(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(item1_id));
        item1_id.click();

    }

    //Add 2nd item
    public void add2ndItem() {
        item2_id.click();

    }

    //Add 3rd item
    public void add3rdItem() {
        item3_id.click();
    }

    //Go to cart
    public void goToCart() {
        cart_id.click();
    }
}
