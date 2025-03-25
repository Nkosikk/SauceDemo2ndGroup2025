package Pages;

import Tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private By usernameField =By.id("use-Name");
    private By passwordField =By.id("password");
    private By loginButton =By.id("login");

    public LoginPage (WebDriver driver){
        super(driver); //this is calling the constructor of the BasePage
    }

   // WebDriver driver;
   // @FindBy(id="Use-Name")
   // WebElement username_Id;

   // By username = By.id("username");

  //  @FindBy(id="Password")
  //  WebElement password_id;

 //   @FindBy(id="Login")
    //WebElement Login_id;//
}
