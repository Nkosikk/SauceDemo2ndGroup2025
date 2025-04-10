package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class AddToCart {
    WebDriver driver;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addToCartButton_xpath;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-lightt']")
    WebElement bikeLightButton_xpath;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement onesieButton_xpath;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartButton_xpath;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(addToCartButton_xpath));
        addToCartButton_xpath.click();
        bikeLightButton_xpath.click();
        onesieButton_xpath.click();
        cartButton_xpath.click();


    }
}
