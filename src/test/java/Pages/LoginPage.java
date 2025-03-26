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

    public LoginPage() {
        this.driver = driver;
    }

    //Input Username
    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(username_id));
        username_id.sendKeys(username);
    }

    //Input Password
    public void enterPassword(String password) {
        password_id.sendKeys(password);
    }

    //Click Login Button
    public void clickLoginButton() {
        loginButton_id.click();
    }

    //Products page
    //public void verifyProductSelection()  {
    //    ProductPage productPage = new ProductPage(driver);
      //  productPage.selectProduct();
        //productPage.addToCart();
    }

