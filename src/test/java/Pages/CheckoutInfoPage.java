package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutInfoPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement YourInfoText_xpath;

    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement ContinueButton_id;


    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setYourInfoText_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(YourInfoText_xpath));
        YourInfoText_xpath.isDisplayed();
    }

    public void setFirstName(String firstName) {
        firstName_id.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode) {
        postalCode_id.sendKeys(postalCode);
    }

    public void clickContinueButton_id() {
        ContinueButton_id.click();
    }
}

//}
