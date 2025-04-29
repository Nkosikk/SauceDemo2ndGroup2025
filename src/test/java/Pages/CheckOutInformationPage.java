package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class CheckOutInformationPage {

    public static WebDriver driver;
    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
    static WebElement checkoutYourInformation_xpath;
    @FindBy(xpath = "//input[contains(@id,'first-name')]")
    static WebElement firstNameField_xpath;
    @FindBy(xpath = "//input[contains(@id,'last-name')]")
    static WebElement lastNameField_xpath;
    @FindBy(xpath = "//input[contains(@id,'postal-code')]")
    static WebElement postalCodeField_xpath;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    static WebElement continueButton_xpath;


    public static void verifyCheckoutYourInformationPage() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(checkoutYourInformation_xpath));
        String checkoutText = checkoutYourInformation_xpath.getText();
        Assert.assertEquals(checkoutText, "Checkout: Your Information");
    }

    public static void enterFirstName(String firstName) {

        firstNameField_xpath.sendKeys(firstName);
    }
    public static void enterLastName(String lastName) {

        lastNameField_xpath.sendKeys(lastName);
    }
    public static void enterPostalCode(String postalCode) {

        postalCodeField_xpath.sendKeys(postalCode);
    }
    public static void clickContinueButton()
    {
        continueButton_xpath.click();
    }
}
