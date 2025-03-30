package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutInformationPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
    WebElement yourInformationText_Xpath;

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

    public void verifyCheckOutText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourInformationText_Xpath));
        yourInformationText_Xpath.isDisplayed();

        //   String productText = productText_Xpath.getText();
        //   Assert.assertEquals(productText,"products");


    }

    //Input Firstname
    public void enterFirstname(String firstname){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }
    //Input Lastname
    public void enterLastname(String lastname) {
        lastname_id.sendKeys(lastname);
    }

    //Input Postal Code
    public void enterPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    //Click Login Button
    public void clickContinueButton() {
        continueButton_id.click();
    }
}
