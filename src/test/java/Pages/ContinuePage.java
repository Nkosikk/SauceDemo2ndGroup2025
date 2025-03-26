package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinuePage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "postal-code")
    WebElement zipcode_id;

    @FindBy(id = "continue")
    WebElement continue_id;

    public ContinuePage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterfirstname(WebElement firstname_id, String firstname) {
        firstname_id.sendKeys(firstname);

    }
public void enterlastname(WebElement lastname_id, String lastname) {
        lastname_id.sendKeys(lastname);

    }
    public void enterzipcode(WebElement zipcode_id, String zipcode) {
        zipcode_id.sendKeys(zipcode);

    }
    public void clickContinue(WebElement continue_id) {
        continue_id.click();
    }
}