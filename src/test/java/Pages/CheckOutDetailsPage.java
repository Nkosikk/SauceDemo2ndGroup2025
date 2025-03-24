package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutDetailsPage {
    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(className = "btn_primary")
    WebElement continueBtn_class;

    public void checkOutDetailsPage(WebDriver driver){
        this.driver = driver;

    }
    public void enterFirstName(String firstname){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstname);
    }

    public void enterLasttName(String lastname){
        lastName_id.sendKeys(lastname);

    }

    public void enterPostalCode(int postalcode){
        postalCode_id.sendKeys(String.valueOf(postalcode));

    }

    public void clickContinueBtn(){
        continueBtn_class.click();

    }
}
