package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finishpage {
    WebDriver driver;

    @FindBy
            (xpath = "//*[@id='checkout_complete_container']/h2")
    WebElement finish_xpath;

    public finishpage(WebDriver driver) {
        this.driver = driver;



    }
    public void verifyFinishText() {
        finish_xpath.isDisplayed();
    }
    public void clickFinish() {
        finish_xpath.click();
    }
            }





