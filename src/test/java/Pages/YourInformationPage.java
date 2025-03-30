package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourInformationPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "zip/postal-code")
    WebElement postalcode_id;

    @FindBy(id = "continue-button")
    WebElement continueButton_id;

    public YourInformationPage(WebDriver driver)

    {
        this.driver = driver;
    }

    //Input Firstname
    public void enterFirstname(String firstname)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }

    //Input Lastname
    public void enterLastname(String lastname)
    {
        lastname_id.sendKeys(lastname);
    }

    //Input Postalcode
    public void enterPostalcode(String postalcode)
    {
        postalcode_id.sendKeys(postalcode);
    }

    //Click Login Button
    public void clickContinueButton()
    {
        continueButton_id.click();
    }
}