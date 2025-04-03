package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class YourInformationPage
{
    static WebDriver driver;

    @FindBy(id = "first-name")
    static WebElement firstname_id;

    @FindBy(id = "last-name")
    static WebElement lastname_id;

    @FindBy(id = "postal-code")
    static WebElement postalcode_id;

    @FindBy(id = "continue-button")
    static WebElement continueButton_id;

    public YourInformationPage(WebDriver driver)
    {
        YourInformationPage.driver = driver;
    }
    //Input Firstname
    public void enterFirstname(String firstname)
    {
       // new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstname_id));
        firstname_id.sendKeys(firstname);
    }
    //Input Lastname
    public void enterLastname(String lastname)
    {
        lastname_id.sendKeys(lastname);
    }
    //Input PostalCode
    public void enterPostalcode(String postalcode)
    {
        postalcode_id.sendKeys(postalcode);
    }
    //Click Continue Button
    public void clickContinueButton()
    {
        continueButton_id.click();
    }
   /* @Test
    public void Test()
    {
        System.out.println("Test");
    }*/
}