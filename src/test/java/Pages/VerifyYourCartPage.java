package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyYourCartPage
{
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement Add_to_Cart_id;

    public void setYour_cart_id(WebElement your_cart_id)
    {
        this.Add_to_Cart_id = your_cart_id;

    }

    public void clickYourCart()
    {
        Add_to_Cart_id.click();

    }
}

