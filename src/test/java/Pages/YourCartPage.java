package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class YourCartPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement checkoutButton_xpath;
}
