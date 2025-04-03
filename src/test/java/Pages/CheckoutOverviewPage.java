package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {
    static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    static WebElement checkoutoverviewText_xpath;

    @FindBy(id = "finish")
    static WebElement finish_id;

    public CheckoutOverviewPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public static void verifyCheckoutOverviewText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutoverviewText_xpath));
        checkoutoverviewText_xpath.isDisplayed();
    }
    public static void clickFinishButton()
    {
        finish_id.click();
    }
}