package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourCartPage {

    WebDriver driver;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartContainer_id;

    public void shoppingCartContainer() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(shoppingCartContainer_id));
        shoppingCartContainer_id.click();
    }
}

