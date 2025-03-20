package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage {

    WebDriver driver;

    //locators
    //removing an item from the cart in the Your Cart page
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement RemoveSauceLabsBoltTShirt_id;

    //clicking the checkout button in the Your Cart page
    @FindBy(id = "checkout")
    WebElement checkout_id;

    //constructor
    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void RemoveSauceLabsBoltTShirt_id(WebElement removeSauceLabsBoltTShirt_id) {
        RemoveSauceLabsBoltTShirt_id = removeSauceLabsBoltTShirt_id;
    }

    public void clickCheckout() {
        checkout_id.click();
    }

}
