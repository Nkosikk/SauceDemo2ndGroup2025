package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverview {

    @FindBy(xpath = "(//span[@class='title'])[1]")
    WebElement checkoutOverview;

    public void verifyCheckoutOverview(){
        checkoutOverview.isDisplayed();
    }

    @FindBy(id = "finish")
    WebElement finish;

    public void finish(){
        finish.click();
    }

}
