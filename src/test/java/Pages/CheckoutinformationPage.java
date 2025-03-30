package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutinformationPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourInformationText_xpath;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    public CheckoutinformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setYourInformationText_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(YourInformationText_xpath));
        YourInformationText_xpath.isDisplayed();
    }

    public void setFirstName(String firstName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }

    public void setLastName_id(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void setPostalCode_id(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    public void clickContinueButton() {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(continueButton_id));
        continueButton_id.click();
    }
}