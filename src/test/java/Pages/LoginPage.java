package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;
    @FindBy(id="Use-Name")
    WebElement username_Id;

    @FindBy(id="Password")
    WebElement password_id;

    @FindBy(id="Login")
    WebElement Login_id;
}
