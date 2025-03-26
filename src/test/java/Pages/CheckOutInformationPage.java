package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutInformationPage {

WebDriver driver;

@FindBy(id = "First-name")
WebElement firstname_id;

@FindBy(id = "last-name")
WebElement   lastname_id;

@FindBy(id = "postal-code")
WebElement postalcode_id;

@FindBy (id = "continue")
WebElement continue_id;

public CheckOutInformationPage(WebDriver driver) {
this.driver = driver;


    }
    //Input Username
    public void enterFirstname(String firstname){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }

    public void enterlastname(String lastname) {
        lastname_id.sendKeys(lastname);
    }

  //Input postal code
    public void enterpostalcode(String postalcode) {
        postalcode_id.sendKeys(postalcode);
    }
}



}
