package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    //enter username
    public void enterUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(username_id));
        username_id.sendKeys(username);
    }
    //enter password
    public void enterPassword(String password){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(password_id));
        password_id.sendKeys(password);
    }

    //Click Login Button
    public void clickLoginButton() {
        loginButton_id.click();
    }
}