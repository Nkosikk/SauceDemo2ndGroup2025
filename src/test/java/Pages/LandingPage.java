package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;
//locators (findby)
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement AddToCartSauceLabsBikeLight_xpath ;

    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement AddToCartSauceLabsFleeceJacket_xpath;//constructor

    @FindBy(xpath = "//a[contains(.,'2')]")
    WebElement clickCart_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver, this);


    }
    //methods (adding items to cart)
    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
    }
        //String productText = productText_xpath.getText();
        //Assert.assertEquals(productText, "Products");

      public void clickAddToCartSauceLabsFleeceJacket(){
        AddToCartSauceLabsFleeceJacket_xpath.click();

    }
    public void clickAddToCartSauceLabsBikeLight(){
        AddToCartSauceLabsBikeLight_xpath.click();

    }
    public void clickCart(){
        clickCart_xpath.click();
    }
}

