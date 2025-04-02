package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyCheckOutPage

{
@FindBy(id ="checkout_id")

WebElement checkout_id;

public void verifyCheckOutPage_id(WebElement checkout_id)

{this.checkout_id = checkout_id;}

public void clickCheckout()
{
    checkout_id.click();
}
}
        






