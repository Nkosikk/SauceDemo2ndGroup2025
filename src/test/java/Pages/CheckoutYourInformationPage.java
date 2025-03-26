package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutYourInformationPage {

    WebDriver driver;

    //verify the Checkout Your Information page

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/h3")
    WebElement checkoutYourInformationText_xpath;
    //Locators
    @FindBy(id = "first-name")
    WebElement firstName_id;
    @FindBy(id = "last-name")
    WebElement lastName_id;
    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement continueButton_xpath;

    //Constructor
    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

public void verifyCheckoutYourInformationText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutYourInformationText_xpath));
        String checkoutYourInformationText = checkoutYourInformationText_xpath.getText();
        if (checkoutYourInformationText.equals("Checkout: Your Information")) {
            System.out.println("You are in the Checkout: Your Information Page");
        } else {
            System.out.println("You are not in the Checkout: Your Information Page");
        }
    }

    //methods
    public void enterFirstName(String firstName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    public void clickContinue() {
        continueButton_xpath.click();

    }

    public void verifyYourInformationText() {
    }
}

