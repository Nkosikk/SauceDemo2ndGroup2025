package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourCart {
    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    //Constructor
    public CheckoutYourCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void clickCheckoutButton() {
        checkoutButton_id.click();
    }
}
