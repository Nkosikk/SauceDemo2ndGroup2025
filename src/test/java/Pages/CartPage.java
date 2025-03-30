package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement YourCartText_xpath;WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutButton_xpath;

    public CartPage(WebDriver driver) {
        this.driver = driver;

    }

    public void verifyYourCartText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(YourCartText_xpath));
        YourCartText_xpath.isDisplayed();
    }
    public void clickCheckoutButton(){
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckoutButton_xpath));
        CheckoutButton_xpath.click();
    }
}
