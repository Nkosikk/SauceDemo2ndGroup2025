package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkOutOverviewText_xpath;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    //Constructor
    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

        //Verify CheckOut Overview Page
        public void verifyCheckOutOverviewPage () {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkOutOverviewText_xpath));
            checkOutOverviewText_xpath.isDisplayed();
        }

        //Click Finish Button
        public void clickFinishButton () {
            finishButton_id.click();

        }
    }



