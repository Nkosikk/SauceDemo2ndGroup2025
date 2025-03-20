package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {

    WebDriver driver;

    //Locators
    //clicking the finish button in the Checkout Overview page
    @FindBy(id = "finish")
    WebElement finish_id;

    //constructor
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void clickFinish() {
        finish_id.click();
    }
}
