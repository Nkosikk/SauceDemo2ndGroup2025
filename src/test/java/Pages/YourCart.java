package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


public class YourCart {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='title']")
    WebElement yourCartText_xpath;
    @FindBy(xpath = "//button[@class = 'btn btn_action btn_medium checkout_button ']")
    WebElement checkoutButton_xpath;




new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourCartText_xpath));
yourCartText_xpath.isDisplayed();

checkoutButton_xpath.click();


    }





}

