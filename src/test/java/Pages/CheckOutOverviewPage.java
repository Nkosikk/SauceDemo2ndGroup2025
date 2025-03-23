package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(id = "finish-button")
    WebElement finishButton_id;

    //Click Finish Button
    public void clickFinishButton() {
        finishButton_id.click();

    }

}