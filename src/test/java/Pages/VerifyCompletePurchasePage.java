package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class VerifyCompletePurchasePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    WebElement completePurchaseText_xpath;

    public VerifyCompletePurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackHomeButton() {
        // Locate and click the back home button
        driver.findElement(By.id("back-to-products")).click();
    }

    public void clickBurgerMenuButton() {
        // Locate and click the burger menu button
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clickLogoutButton() {
        // Locate and click the logout button
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
//    public void verifyCompletePurchaseText() {
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(completePurchaseText_xpath));
//        completePurchaseText_xpath.isDisplayed();
//    }
//    public String getCompletePurchaseText() {
//        return completePurchaseText_xpath.getText();
//    }
//}

