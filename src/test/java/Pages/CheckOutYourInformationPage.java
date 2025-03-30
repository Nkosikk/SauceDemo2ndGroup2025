package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutYourInformationPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkOutYourInformationText_xpath;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    //Constructor

    public CheckOutYourInformationPage (WebDriver driver) {
        this.driver = driver;
    }


    //Verify CheckOut Your Information Page
    public void verifyCheckOutYourInformationPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkOutYourInformationText_xpath));
        checkOutYourInformationText_xpath.isDisplayed();

        //String checkOutYourInformationText = checkOutYourInformationText_xpath;.getText();
        //Assert.assertEquals(,"Checkout: Your Information");
    }

    //Input FirstName
     public void enterFirstName(String firstName){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }

    //Input LastName

    public void enterLastName(String lastName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
        lastName_id.sendKeys(lastName);
    }

    //Input Postal Code

        public void enterPostalCode(String postalCode){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
            postalCode_id.sendKeys(postalCode);
        }

    //Click Continue Button
    public void clickContinueButton() {
        continueButton_id.click();

}

}
