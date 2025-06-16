package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement backpack_id;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLight_id;
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCart_id;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
    }
    public void AddItemsToTheCart() {
        backpack_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backpack_id));
        bikeLight_id.click();
    }
    public void navigateToCart() {
        shoppingCart_id.click();
    }
}
