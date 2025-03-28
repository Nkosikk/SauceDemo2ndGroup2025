package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourInformationPage {

    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continue_id;

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void firstName(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));

        firstName_id.sendKeys(firstname);
    }
    public void lastName(String lastname) {
        lastName_id.sendKeys(lastname);
    }

    public void postalCode(String postalcode) {
        postalCode_id.sendKeys(postalcode);
    }

    public void clickContinueButton() {
        continue_id.click();
    }


}






