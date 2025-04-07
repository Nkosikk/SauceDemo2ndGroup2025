package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutYourCart {
    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    @FindBy(css = ".cart_item")
    List<WebElement> cartItems_css;

    //Constructor
    public CheckoutYourCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Get the list of items are still in cart
    public List<WebElement> getCartItems() {
        return cartItems_css;
    }



    //Actions
    public void clickCheckoutButton() {
        checkoutButton_id.click();
    }
}
