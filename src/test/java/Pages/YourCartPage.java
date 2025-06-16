package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourCartPage {
    WebDriver driver ;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourCartText_xpath;

    @FindBy(id = "checkout") WebElement checkout_id;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyYourCartContainer() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkout_id));
        yourCartText_xpath.isDisplayed();
    }
    public void clickCheckoutButton() {
        checkout_id.click();
    }




}
