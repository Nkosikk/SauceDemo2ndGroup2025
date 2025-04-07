package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutPage {
     WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
    WebElement checkoutYourInformationText_xpath;

    @FindBy(xpath = "//input[@id='first-name']")
     WebElement firstName_xpath;

    @FindBy(xpath = "//input[@id='last-name']")
     WebElement lastName_xpath;

    @FindBy(xpath = "//input[@id='postal-code']")
     WebElement postalCode_xpath;

    @FindBy(xpath = "//input[@id='continue']")
     WebElement continueCheckoutButton_xpath;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancelcheckoutButton_xpath;

     public CheckoutPage(WebDriver driver) {
         this.driver = driver;
     }

    public void verifyCheckoutText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutYourInformationText_xpath));
        checkoutYourInformationText_xpath.isDisplayed();

        String backpackNameText = checkoutYourInformationText_xpath.getText();
        Assert.assertEquals(backpackNameText, "Checkout: Your Information");

    }
    public void enterFirstName(String firstName) {
        firstName_xpath.sendKeys(firstName);
    }

     public void enterLastName(String lastName) {
         lastName_xpath.sendKeys(lastName);
     }

     public void enterPostalCode(String postalCode) {
         postalCode_xpath.sendKeys(postalCode);
     }

    public void clickContinueCheckOutButton() {
        continueCheckoutButton_xpath.click();
    }

    public void clickCancelCheckOutButton() {
        cancelcheckoutButton_xpath.click();
    }

    //add a method to verify the cancel button
    // add a method to verify the buttons
}
