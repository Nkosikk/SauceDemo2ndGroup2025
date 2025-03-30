package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutInformationPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutYourInformationText;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    public CheckOutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    //VALIDATE THAT YOU ARE IN THE CHECKOUT INFORMATION PAGE
    public boolean verifyCheckoutYourInformationText() {
        return CheckoutYourInformationText.isDisplayed();
    }

    //Input Firstname
    public void enterFirstname(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastname_id));
        lastname_id.sendKeys(lastname);
    }

    //Input postal code
    public void enterPostalCode(String postalCode) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
        postalCode_id.sendKeys(postalCode);
    }

    public void clickContinue() {
        continueButton_id.click();
    }

}

