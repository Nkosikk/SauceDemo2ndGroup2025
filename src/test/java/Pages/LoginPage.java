package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="user-dropdown")
    WebElement userDropdown_id;

    @FindBy(xpath = "//*[@id='sub-inner-user']/a[2]")
    WebElement loginLink_xpath;

    @FindBy(id="EmailAddress")
    WebElement emailAddress_id;

    @FindBy( id="inputPassword")
    WebElement inputPassword_id;

    @FindBy(xpath = "//*[@id=\"login\"]/div[5]/div/button")
    WebElement loginButton_xpath;

    @FindBy(xpath = "//*[@id=\"sub-inner-user\"]/form/button")
    WebElement logoutText_xpath;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }






  //methods for login page actions

    //Click User Dropdown
    public void clickUserDropdown() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(userDropdown_id));
        userDropdown_id.click();
    }

    //Click Login Link
    public void clickLoginLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginLink_xpath));
        loginLink_xpath.click();
    }

    //Input Email Address
    public void enterEmailAddress(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(emailAddress_id));
        emailAddress_id.sendKeys(email);
    }


    //Input Password
    public void enterInputPassword(String password) {
        inputPassword_id.sendKeys(password);
    }

    //Click Login Button
    public void clickLoginButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginButton_xpath));
        loginButton_xpath.click();
    }
    //Verify Logout Text
    public void verifyLogoutText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(logoutText_xpath));
        logoutText_xpath.isDisplayed();
    }




}
