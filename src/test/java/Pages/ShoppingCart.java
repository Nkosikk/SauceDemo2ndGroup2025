package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ShoppingCart {
    WebDriver driver;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement shoppingCartContainer_xpath;
    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public void ShoppingCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(shoppingCartContainer_xpath));
        shoppingCartContainer_xpath.click();
    }

}
