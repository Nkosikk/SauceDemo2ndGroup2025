package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class YourCartPage {

    WebDriver driver;

    //Locators
    //Verifying Your Cart Page

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourCartText_xpath_id;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutButton_xpath_id;


    //Constructor
    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods
// verify your cart page
    public void verifyYourCartText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(YourCartText_xpath_id));
        YourCartText_xpath_id.isDisplayed();

    }

    //Click Checkout Button
    public void clickCheckoutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckoutButton_xpath_id));
        CheckoutButton_xpath_id.click();
    }

}
