package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOut {
    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public CheckOut(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckOut() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutButton_id));
        checkoutButton_id.click();
    }
}
