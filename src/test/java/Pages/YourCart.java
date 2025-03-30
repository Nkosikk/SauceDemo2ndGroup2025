package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourCart {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement sauceLabsBikeLight_xpath;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public YourCart(WebDriver driver) {
        this.driver = driver;
    }
    public void verifySauceLabsBikeLight() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(sauceLabsBikeLight_xpath));
        sauceLabsBikeLight_xpath.isDisplayed();
    }
    public void checkoutButton() {
        checkoutButton_id.click();
    }

}






