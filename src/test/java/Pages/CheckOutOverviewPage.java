package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverviewPage {
    WebDriver driver;

    @FindBy(id = "finish-button")
    WebElement finishButton_id;

    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickfinishButton() {
        finishButton_id.click();

    }
}
