package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class CheckoutComplete {

    @FindBy(xpath = "//span[@class='title']")
    WebElement checkoutCompleteText_xpath;
    @FindBy(xpath = "//button[@class='btn_secondary back_home']")
    WebElement backHomeButton_xpath;
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement completeHeader_xpath;

}
