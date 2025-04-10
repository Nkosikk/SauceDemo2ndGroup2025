package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Checkout {

    @FindBy(id= "first-name")
    WebElement firstName_id;
    @FindBy(id= "last-name")
    WebElement lastName_id;
    @FindBy(id= "postal-code")
    WebElement postalCode_id;
    @FindBy(id = "continue")
    WebElement continueButton_id;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys("John");
        lastName_id.sendKeys("Doe");
        postalCode_id.sendKeys("12345");
        continueButton_id.click();
    }





}
