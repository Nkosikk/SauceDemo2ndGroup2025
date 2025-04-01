package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverview {
    WebDriver driver;
    @FindBy(id ="checkout")
    WebElement checkout_id;

    public CheckOutOverview(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCheckOut(){
        checkout_id.click();
    }
}
