package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCartSauceLabsBackpack_id;

    @FindBy(xpath = "//a[contains(.,'1')]")
    WebElement ShopingCart_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

//        String productText = productText_xpath.getText();
//        Assert.assertEquals(productText, "Products");

    }

    //methods
    //adding items to cart
    public void clickAddToCartSauceLabsBackpack() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(AddToCartSauceLabsBackpack_id));
        AddToCartSauceLabsBackpack_id.click();
    }

    public void clickCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(ShopingCart_xpath));
        ShopingCart_xpath.click();
    }
}






