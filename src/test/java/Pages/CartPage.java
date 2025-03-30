package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//import static Utils.BrowserFactory.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourCartText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutButton_xpath;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyYourCartText() {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(YourCartText_xpath));
        YourCartText_xpath.isDisplayed();
    }

    public void clickCheckoutButton() {
        CheckoutButton_xpath.click();

    }
}


//public void main() {

