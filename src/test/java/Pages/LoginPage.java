package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;
    @FindBy(id="Use-Name")
    WebElement username_Id;

    By username = By.id("username");

    @FindBy(id="Password")
    WebElement password_id;

    @FindBy(id="Login")
    WebElement Login_id;
}
