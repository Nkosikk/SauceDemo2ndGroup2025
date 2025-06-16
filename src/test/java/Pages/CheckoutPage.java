package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") WebElement checkoutText_xpath;

    @FindBy(id = "first-name") WebElement FirstName_id;

    @FindBy(id = "last-name") WebElement lastName_id;

    @FindBy(id = "postal-code") WebElement PostalCode_id;

    @FindBy(id = "continue") WebElement continueButton_id;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyCheckout(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutText_xpath));
        checkoutText_xpath.isDisplayed();
    }
    public void enterFirstName(String firstName) {
        FirstName_id.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode) {
        PostalCode_id.sendKeys(postalCode);
    }
    public void clickContinueButton() {
        continueButton_id.click();
    }
}
