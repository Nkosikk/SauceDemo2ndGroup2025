package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DeliveryInfoPage {
    WebDriver driver;

    @FindBy (id = "first-name")
    WebElement firstName_id;
    @FindBy (id = "last-name")
    WebElement lastName_id;
    @FindBy (id = "postal-code")
    WebElement postalCode_id;

    @FindBy (id= "continue")
    WebElement continueButton_id;

    public void CheckOutInfo(WebDriver driver){
        this.driver = driver;
    }
    //Enter First Name
    public void enterFirstName(String firstName){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }
    //Enter Last Name
    public void enterLastName(String lastName){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
        lastName_id.sendKeys(lastName);
    }
    //Enter Postal Code
    public void enterPostalCode(String postalCode){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
        postalCode_id.sendKeys(postalCode);
    }
    public void clickContinueButton(){
        continueButton_id.click();
    }

}
