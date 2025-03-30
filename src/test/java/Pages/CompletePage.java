package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CompletePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Complete!')]")
    WebElement completeText_Xpath;

    @FindBy(id = "back-to-products")
    WebElement backToProductButton_id;

    @FindBy(id = "react-burger-menu-btn")
    WebElement MenuButton_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutButton_id;

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCompleteText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(completeText_Xpath));
        completeText_Xpath.isDisplayed();
    }

    public void clickBackHome() {
        backToProductButton_id.click();
    }

    public void clickMenu() {
        MenuButton_id.click();
    }

    public void clickLogOut() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(logOutButton_id));
        logOutButton_id.isDisplayed();
        logOutButton_id.click();
    }
}

