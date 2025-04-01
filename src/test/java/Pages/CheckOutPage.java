package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutPage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "checkout")
    WebElement CheckOutButton_id;

    public void clickCheckOutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckOutButton_id));
        CheckOutButton_id.click();
    }

    @FindBy(id = "first-name")
    WebElement fistName_id;

    public void enterFirstName(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(fistName_id));
        fistName_id.sendKeys(firstname);

    }
    @FindBy(id = "last-name")
    WebElement lastName_id;

    public void enterLastName(String lastname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
        lastName_id.sendKeys(lastname);

    }
    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    public void enterPostalCode(String postalcode) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
        postalCode_id.sendKeys(postalcode);

    }
    @FindBy(id = "continue")
    WebElement continueButton_id;

    public void clickBtnContinue() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(continueButton_id));
        continueButton_id.click();
    }
}


//        String CheckOutInfo = driver.findElement(By.xpath("(//span[@class='title'])[1]")).getText();
//        Assert.assertEquals(CheckOutInfo, "Checkout: Your Information");
//}
//
//@FindBy(id = "first-name")
//WebElement firstName_id;
//
//public void enterFirstName(String firstName) {
//   new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
//  firstName_id.sendKeys(firstName);
//}
//
//@FindBy(id = "last-name")
//WebElement lastName_id;
//
//public void enterLastName(String lastname) {
//    new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
//    lastName_id.sendKeys(lastname);
//}
//
//@FindBy(id = "postal-code")
//WebElement postalCode_id;
//
//public void enterPostalCode(String postalCode) {
//    new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
//    postalCode_id.sendKeys(postalCode);
//}
//
//@FindBy(id = "continue")
//WebElement continueButton_id;
//
//public void clickContinueButton() {
//    continueButton_id.click();
//}
//}