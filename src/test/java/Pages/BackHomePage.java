package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackHomePage {
    WebDriver driver;
    @FindBy
            (xpath = "//*[@id='back-to-products']")
    WebElement backhome_xpath;

    public BackHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickBackHome() {
        backhome_xpath.click();
    }
}
