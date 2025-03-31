package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "postal-code")
    WebElement postalcode_id;

    public void InformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstname(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }

    public void lastname(String lastname) {
        lastname_id.sendKeys(lastname);
    }

    public void postalcode(String postalcode) {
        postalcode_id.sendKeys(postalcode);
    }

    public void clickContinueButton() {
        continueButton_id.click();
    }



}
