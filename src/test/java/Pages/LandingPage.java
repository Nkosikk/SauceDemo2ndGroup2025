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


    public LandingPage(WebDriver driver) {

        this.driver = driver;
    }

    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

//        String productText = productText_xpath.getText();
//        Assert.assertEquals(productText, "Products");
    }
    public void addToCart(){
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
    }
    public void clickCart(){
        WebElement clickCart = driver.findElement(By.id("shopping_cart_container"));
        clickCart.click();
    }




}
