package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutPage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "checkout")
    WebElement checkOutInfo_id;

    public void checkOutInfo() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkOutInfo_id));
        checkOutInfo_id.getText();

        String CheckOutInfo = driver.findElement(By.xpath("(//span[@class='title'])[1]")).getText();
        Assert.assertEquals(CheckOutInfo, "Checkout: Your Information");
    }

    @FindBy(id = "first-name")
    WebElement firstName_id;

    public void enterFirstName(String firstName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }

    @FindBy(id = "last-name")
    WebElement lastName_id;

    public void lastName(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(lastName_id));
        lastName_id.sendKeys(username);
    }

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    public void postalCode(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(postalCode_id));
        postalCode_id.sendKeys(username);
    }

    @FindBy(id = "continue")
    WebElement continueButton_id;

    public void clickContinueButton() {
        continueButton_id.click();
    }
}