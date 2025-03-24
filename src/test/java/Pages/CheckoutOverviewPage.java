package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {
    WebDriver driver;

    //locate description text element in the checkout overview page
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[2]")
    WebElement DescriptionText_xpath;

    //locate finish button element in the checkout overview page
    @FindBy(id = "finish")
    WebElement finish_id;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check if the description text is displayed
    public boolean isDescriptionTextDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(DescriptionText_xpath));
        return DescriptionText_xpath.getText().contains("Description");
    }

    //Click the finish button
    public void ClickFinishButton(){
        finish_id.click();
    }

}
