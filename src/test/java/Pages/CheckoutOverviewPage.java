package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutoverviewText_xpath;

    @FindBy(id = "finish")
    WebElement finish_id;

    public void CheckoutOverviewPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutoverviewText_xpath));
        checkoutoverviewText_xpath.isDisplayed();
    }

    public void ClickFinishButton()
    {
        finish_id.click();
    }

}