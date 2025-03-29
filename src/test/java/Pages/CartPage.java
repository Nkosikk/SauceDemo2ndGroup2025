package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {

    WebDriver driver;

    // identify element for Your Cart text
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement cart_xpath;

    // identify the added item into cart
    @FindBy(xpath = "//*[@id=\"item_2_title_link\"]/div")
    WebElement item_xpath;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check if the text Your Cart is displayed
    public boolean isYourCartTextDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(cart_xpath));
        return cart_xpath.getText().contains("Your Cart");
    }

    //Check if the item is displayed in the cart
    public boolean isItemDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(item_xpath));
        return item_xpath.getText().contains("Sauce Labs Onesie");
    }
    //Click checkout Button
    public void Checkout() {
        checkoutButton_id.click();
    }

}
