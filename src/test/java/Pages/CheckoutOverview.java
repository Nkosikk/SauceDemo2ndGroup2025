package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverview {
    WebDriver driver;

//@FindBy(id = "continue")
//WebElement continueButton_id;
    @FindBy(id = "finish")
    WebElement finishButton_id;

public CheckoutOverview(WebDriver driver){
    this.driver = driver;
}

//public void clickContinueButton_id(){
   // continueButton_id.click();
//}

    public void clickFinishButton(){
        finishButton_id.click();

}
}

