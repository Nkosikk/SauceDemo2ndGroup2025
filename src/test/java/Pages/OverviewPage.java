package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class OverviewPage {
    WebDriver driver;

    public OverviewPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "finish")
    WebElement FinishBtn_id;

    public void clickFinishBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(FinishBtn_id));
        FinishBtn_id.click();
    }
}
