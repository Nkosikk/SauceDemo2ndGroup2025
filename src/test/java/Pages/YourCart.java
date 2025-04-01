package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCart {
    WebElement driver;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public YourCart(WebElement driver) {
        this.driver = driver;

    }
}
