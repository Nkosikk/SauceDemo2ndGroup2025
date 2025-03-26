package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage   {

    WebDriver driver;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFinishButton(){
        finishButton_id.click();
    }
}
