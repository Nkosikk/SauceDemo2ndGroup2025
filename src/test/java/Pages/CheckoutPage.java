package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "contents_wrapper")
    WebElement contents_wrapper_id;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyCheckout(){
        contents_wrapper_id.isDisplayed();
    }

}

