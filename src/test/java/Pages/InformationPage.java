package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage {


    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continue_id;

    public InformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        firstName_id.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    public void continue_btn() {
        continue_id.click();
    }
}
