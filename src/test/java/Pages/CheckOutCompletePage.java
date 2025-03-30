package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutCompletePage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutCompleteText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement CheckoutCompleteContainer_xpath;

    @FindBy(id = "react-burger-menu-btn")
    WebElement Menu_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement Logout_id;

    public void CheckOutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify that you are in the checkout complete page.
    public boolean verifyCheckoutCompleteText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckoutCompleteText_xpath));
        return CheckoutCompleteText_xpath.isDisplayed();
    }

    //Verify that the checkout complete container is displayed.(Thank you for your order)
    public boolean verifyCheckoutCompleteContainer() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckoutCompleteContainer_xpath));
        return CheckoutCompleteContainer_xpath.isDisplayed();

    }

    // Click on the hamburger  menu to display the menu options.
    public void clickMenu() {
        Menu_id.click();
    }

    //Click on the logout button
    public void clickLogout() {
        Logout_id.click();
    }
}
