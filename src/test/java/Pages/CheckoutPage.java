package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutText_xpath;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutText_xpath));
      checkoutText_xpath.isDisplayed();

    }
    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy(id = "last-name")
    WebElement lastname_id;

    @FindBy(id = "postal-code")
    WebElement postalcode_id;

    @FindBy(id = "continue")
    WebElement continueButton_id;

    public void setFirstname_id(String firstName) {firstname_id.sendKeys("thabiso");
    }
    public void setLastname_id(String LastName) {lastname_id.sendKeys("ndlovu");

    }
    public void setPostalcode_id(String Postalcode) {postalcode_id.sendKeys("7441");

    }
    public void clickContinueButton() {
        continueButton_id.click();
    }


}