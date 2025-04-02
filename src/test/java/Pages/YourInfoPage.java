package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourInfoPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "first-name")
    WebElement firstName_id;
    @FindBy(id = "last-name")
    WebElement lastName_id;
    @FindBy(id = "postal-code")
    WebElement postalCode_id;
    @FindBy(id = "continue")
    WebElement continueButton_id;

    public YourInfoPage(WebDriver webdriver){
        this.driver =driver;
    public void EnterFirstName(String firstName){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
            firstName_id.sendKeys(firstName);
        }
        public void EnterLastName(String lastname){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
            lastName_id.sendKeys(lastname);
        }
        public void EnterPostalCode(String postalCode){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
            postalCode_id.sendKeys(postalCode);
        }
        public void clickContinueButton(){continueButton_id.click();}
    }
}
