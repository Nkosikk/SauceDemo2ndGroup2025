package Pages;

import Tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By usernameField =By.id("use-Name");
    private By passwordField =By.id("password");
    private By loginButton =By.id("login");

    public LoginPage (WebDriver driver){
        super(driver); //this is calling the constructor of the BasePage
    }

    public void setUsernameField(String username) {
        type(username, usernameField);
    }
    public void setPasswordField(String password) {
        type(password, passwordField);
    }

    public LandingPage clickLoginButton(){
        click(loginButton);
        return new LandingPage(driver);
    }
    public LandingPage loginWith(String username, String password){
        setUsernameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }
    public String getErrorMessage(){
        return find(By.id("errorMessage")).getText();

    }
}




