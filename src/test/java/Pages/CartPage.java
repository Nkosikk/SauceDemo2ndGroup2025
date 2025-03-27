package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.page.model.Screenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Pages.CartPage;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage
{
    WebDriver driver;
    //public void ClickAddToCart(String itemId){}

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addtocartsaucelabsbackpack_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addtocartsaucelabsbikelight_id;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingcartcontainer_id;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

   public static void ClickShoppingCartContainer(String itemId) {}

    //Click Add to Cart Sauce Labs Backpack
    public void ClickAddToCart(String addtocartsaucelabsbackpack)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addtocartsaucelabsbackpack_id));
        addtocartsaucelabsbackpack_id.click();
        addtocartsaucelabsbikelight_id.click();
    }

    /*Click shopping cart container
    public void ClickAddToCartSauceLabsBikelight()
    {
        addtocartsaucelabsbikelight_id.click();
    }*/

    //Click shopping cart container
    public void clickshoppingcartcontainer()
    {
        shoppingcartcontainer_id.click();
    }
}
