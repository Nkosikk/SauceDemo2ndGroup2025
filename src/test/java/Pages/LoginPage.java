package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.Color.red;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;


    @FindBy(id ="add-to-cart-sauce-labs-t-shirt-(red)")
            WebElement addtocart_id;

    @FindBy(id = "shopping_cart_container")
            WebElement shoppingcart_id;

    @FindBy(id = "checkout")
            WebElement checkout_id;

    @FindBy(id = "first-name")
            WebElement firstname_id;

    @FindBy(id = "last-name")
            WebElement lastname_id;

    @FindBy(id = "postal-code")
            WebElement postalcode_id;

    @FindBy(id = "continue")
            WebElement continue_id;

    @FindBy(id = "finish")
            WebElement finish_id;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
            WebElement thankYouMessage_id;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
            WebElement productText_id;





    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //Input Username
    public void enterUsername(String username){
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

      //Click Add toCart
    public void clickAddtoCart() {
        addtocart_id.click();

        //Click Shopping Cart
        public void clickShoppingCart() {
            shoppingcart_id.click();
        }
        //Click Checkout
        public void clickCheckout() {
            checkout_id.click();
        }
        //Enter First Name
        public void enterFirstName(String firstname) {
            firstname_id.sendKeys(firstname);
        }
        //Enter Last Name
        public void enterLastName(String lastname) {
            lastname_id.sendKeys(lastname);
        }
        //Enter Postal Code
        public void enterPostalCode(String postalcode) {
            postalcode_id.sendKeys(postalcode);
        }
        //Click Continue
        public void clickContinue() {
            continue_id.click();
        }
        //Click Finish
        public void clickFinish() {
            finish_id.click();
        }
        //Get Thank You Message
        public String getThankYouMessage() {
            return thankYouMessage_id.getText();
        }
        //Get Product Text
        public String getProductText() {
            return productText_id.getText();
        }



}
