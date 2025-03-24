package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplete {

    @FindBy(xpath = "//span[@class='title']")
    WebElement checkoutComplete;

    public void verifyCheckoutComplete(){
        checkoutComplete.isDisplayed();
    }
}
