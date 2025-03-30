package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {
    WebDriver driver;
    @FindBy(className = "shopping_cart_link")
    WebElement CartButton_class;
    @FindBy(id = "checkout")
    WebElement CheckOutButton_id;

    public CheckOut(WebDriver driver) {
        this.driver = driver;
    }
    public void cartButton() {
        CartButton_class.click();
    }
    public void checkOutButton() {
        CheckOutButton_id.click();
    }

}
