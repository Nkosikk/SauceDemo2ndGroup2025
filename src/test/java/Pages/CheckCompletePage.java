package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckCompletePage {
    WebDriver driver;

    public CheckCompletePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement BackToHome_id;

    public void clickBackToHomeBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(BackToHome_id));
        BackToHome_id.click();
    }
    @FindBy( id= "react-burger-menu-btn")
    WebElement Menu_id;
    public void clickMenuBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(Menu_id));
        Menu_id.click();
    }

    @FindBy( id= "logout_sidebar_link")
    WebElement Logout_id;
    public void clickLogoutBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(Logout_id));
        Logout_id.click();
    }

}

