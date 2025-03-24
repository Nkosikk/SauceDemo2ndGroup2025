package Pages;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends BrowserFactory {

    WebDriver driver;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    WebElement username_id;

    public void enterUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(username_id));
        username_id.sendKeys(username);
    }


    @FindBy(id = "password")
    WebElement password_id;

    public void enterPassword(String password){
        password_id.sendKeys(password);
    }

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    public void clickLoginButton(){
        loginButton_id.click();
    }

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productText;

    public void verifyProductText(){
        productText.isDisplayed();
    }


}




