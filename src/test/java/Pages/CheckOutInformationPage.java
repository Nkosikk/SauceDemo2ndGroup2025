package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInformationPage {
    WebDriver driver;
    @FindBy(id ="first-name")
    WebElement firstName_id;

    @FindBy(id ="last-name")
    WebElement lastName_id;

    @FindBy(id ="postal-code")
    WebElement postalCode_id;

    @FindBy(id ="continue")
    WebElement continue_id;

    public CheckOutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

}
