package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {

    WebDriver driver;
    //Locators
    //clicking the back to products button in the Checkout Complete page
    @FindBy(id = "back-to-products")
    WebElement backToProducts_id;

    //constructor
    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void clickBackToProducts() {
        backToProducts_id.click();
    }
}
