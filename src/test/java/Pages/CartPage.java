package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id= "cart_contents_container")
    WebElement cart_container_id;

    public void VerifyCartContainer(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(cart_container_id));
        cart_container_id.isDisplayed();
    }
    @FindBy(id= "checkout")
    WebElement checkout_id;

    public void ClickCheckoutButton(){
        checkout_id.click();
    }

}
