package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCart {

WebDriver driver;

@FindBy(id = "add-to-cart-sauce-labs-backpack")

WebElement add_to_cart_id;

public void clickAddToCart() {
    new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(add_to_cart_id));
    add_to_cart_id.click();

}


}

