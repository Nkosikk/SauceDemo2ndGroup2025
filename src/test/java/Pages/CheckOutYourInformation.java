package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutYourInformation {
    WebDriver driver;
    @FindBy(id ="first-name")
    WebElement firstName_id;

    @FindBy(id ="last-name")
    WebElement lastName_id;

    @FindBy(id ="postal-code")
    WebElement postalCode_id;

    @FindBy(id ="continue")
    WebElement continue_id;

    public  CheckOutYourInformation(WebDriver driver) {
        this.driver = driver;
    }
}
