package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutInformatinPage {
    WebDriver driver;


    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    public void enterFirstname(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        lastName_id.sendKeys(lastname);
    }

    public CheckOutInformatinPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinue() {
        continueButton_id.click();

    }
}
