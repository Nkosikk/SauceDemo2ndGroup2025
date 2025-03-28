package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCart {

    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;


    public YourCart(WebDriver driver) {
        this.driver = driver;
    }
        public void clickCheckoutButton() {
        checkoutButton_id.click();
        }

    }






