package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage {
    WebElement driver;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public YourCartPage(WebElement driver) {
        this.driver = driver;

    }
}
