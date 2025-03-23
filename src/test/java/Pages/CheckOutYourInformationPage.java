package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutYourInformationPage {
    WebDriver driver;

    @FindBy(id = "firstName")
    WebElement firstName_id;

    @FindBy(id = "lastName")
    WebElement lastName_id;

    @FindBy(id = "postalCode_id")
    WebElement postalCode_id;

    @FindBy(id = "continue-button")
    WebElement continueButton_id;



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
