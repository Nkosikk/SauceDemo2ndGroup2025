package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkout_xpath;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        checkout_xpath.click();
    }
}


