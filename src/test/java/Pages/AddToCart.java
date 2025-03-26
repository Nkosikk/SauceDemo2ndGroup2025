package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCart {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement addToCartButton_xpath;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void AddToCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartButton_xpath));
      addToCartButton_xpath.click();
    }

}