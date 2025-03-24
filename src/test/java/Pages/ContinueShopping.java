package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinueShopping {

    @FindBy(id = "continue-shopping")
    WebElement continueShopping;

    public void continueShopping(){
        continueShopping.click();
    }
}
