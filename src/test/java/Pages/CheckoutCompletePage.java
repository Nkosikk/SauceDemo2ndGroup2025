package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckoutCompletePage {
    public static WebDriver driver;
    @FindBy(xpath = "//span[contains(@data-test,'title')]")
    static WebElement checkoutComplete_xpath;
    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    static WebElement confirmationMessage_id;
//    @FindBy(xpath = "//button[contains(@data-test,'back-to-products')]")
//    static WebElement backHome_xpath;
    @FindBy(xpath = "//button[contains(.,'Open Menu')]")
    static WebElement burgerMenuButton_xpath;
    @FindBy(xpath = "//a[contains(.,'Logout')]")
    static WebElement logoutButton_xpath;

//    public static void clickBackHome(){backHome_xpath.click();}
//
    public static void clickBurgerMenuButton(){burgerMenuButton_xpath.click();}

    public static void clickLogoutFromBurgerMenu()
    {
        logoutButton_xpath.click();
    }
}

