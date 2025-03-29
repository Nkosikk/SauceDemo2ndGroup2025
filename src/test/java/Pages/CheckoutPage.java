package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutPage {
    WebDriver driver;

    // locate the element for "Checkout: Your Information" text
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkout_xpath;

    // locate the element for First Name
    @FindBy(id = "first-name")
    WebElement firstName_id;

    // locate the element for Last Name
    @FindBy(id = "last-name")
    WebElement lastName_id;

    //locate element for postal code
    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    //locate element for the continue button
    @FindBy(id = "continue")
    WebElement continueButton_id;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check if the text Checkout: Your Information is displayed
    public boolean isCheckoutTextDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkout_xpath));
        return checkout_xpath.getText().contains("Checkout: Your Information");
    }

    //Input First Name
    public void enterFirstName(String firstName) {
        firstName_id.sendKeys(firstName);
    }

    //Input Last Name
    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    //Input postal code
    public void enterPostalCode(String PostalCode) {
        postalCode_id.sendKeys(PostalCode);
    }

    //Click continue button
    public void clickContinueButton(){
        continueButton_id.click();
    }

}
