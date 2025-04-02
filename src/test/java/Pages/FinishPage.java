package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
    WebDriver driver;

    @FindBy
            (xpath = "//*[@id='checkout_complete_container']/h2")
    WebElement finish_xpath;

    public FinishPage(WebDriver driver) {
        this.driver = driver;
        FinishPage finishPage = new FinishPage(driver);
        PageFactory.initElements(driver, this);




    }
    public void verifyFinishText() {
        finish_xpath.isDisplayed();
    }
    public void clickFinish() {
        finish_xpath.click();
    }

    public void clickFinishButton() {
    }
}





