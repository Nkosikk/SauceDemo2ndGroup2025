package Pages;

//Click Back Home Button

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage {

    WebDriver driver;

    @FindBy(id = "back-to-products")
    WebElement backtoproducts_id;

    //Click Back Home Button
    public void clickBackHomeButton() {
        backtoproducts_id.click();


    }

}




