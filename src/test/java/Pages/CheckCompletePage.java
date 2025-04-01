package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckCompletePage {
    WebDriver driver;

    public CheckCompletePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement BackToHome_id;

    public void clickBackToHomeBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(BackToHome_id));
        BackToHome_id.click();
    }
}

