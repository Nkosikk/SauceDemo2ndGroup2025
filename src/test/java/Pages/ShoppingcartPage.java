package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingcartPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement shoppingcart_xpath;

    public ShoppingcartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyProductText(WebElement productText_xpath) {
        productText_xpath.isDisplayed();
    }
}


