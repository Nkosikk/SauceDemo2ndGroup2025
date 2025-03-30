package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Your Cart')]")
    WebElement cartPageText_Xpath;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifycartPageText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(cartPageText_Xpath));
        cartPageText_Xpath.isDisplayed();
    }

    public void clickCheckout() {
        checkoutButton_id.click();
    }

}
