package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='summary_info_label'][contains(.,'Payment Information:')]")
    WebElement checkoutOverviewText_Xpath;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_Xpath));
        checkoutOverviewText_Xpath.isDisplayed();
    }

    public void clickFinish() {
        finishButton_id.click();
    }
}
