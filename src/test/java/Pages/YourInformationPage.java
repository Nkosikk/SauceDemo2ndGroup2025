package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourInformationPage {
    static WebDriver driver;

    @FindBy(id = "first-name")
    static WebElement firstname_id;

    @FindBy(id = "last-name")
    static WebElement lastname_id;

    @FindBy(id = "zip/postal-code")
    static WebElement postalcode_id;

    @FindBy(id = "continue-button")
    static WebElement continueButton_id;

    public YourInformationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Input Firstname
    public static void enterFirstname(String firstname)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }

    //Input Lastname
    public static void enterLastname(String lastname)
    {
        lastname_id.sendKeys(lastname);
    }

    //Input PostalCode
    public static void enterPostalCode
    (String PostalCode) {
        postalcode_id.sendKeys(PostalCode);
    }

    //Click Login Button
    public static void clickContinueButton()
    {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(continueButton_id));
        continueButton_id.click();
    }
}