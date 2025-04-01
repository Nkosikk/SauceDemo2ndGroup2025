package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverview {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutOverviewText_xpath;

    public CheckoutOverview(WebDriver driver) {

        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_xpath));
        checkoutOverviewText_xpath.isDisplayed();
    }
}

//public void clickContinueButton_id(){
   // continueButton_id.click();
//}





