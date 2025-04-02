package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutCompletePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutCompleteText_xpath;


    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutCompleteText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutCompleteText_xpath));
        checkoutCompleteText_xpath.isDisplayed();

    }
    @FindBy(id = "back-to-products")
    WebElement backHomeButton_id;

    public void clickFinishButton() {
        backHomeButton_id.click();
}
}