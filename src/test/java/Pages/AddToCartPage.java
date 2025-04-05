// Created by: [Babongile Mpungose]
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddToCartPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourProductText_xpath;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addtocartsaucelabsbackpack_id;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addtocartsaucelabsbikelight_id;
    @FindBy(id = "remove-sauce-labs-backpack")
    static WebElement removesaucelabsbackpack_id;
    @FindBy(id = "remove-sauce-labs-bike-light")
    static WebElement removesaucelabsbikelight_id;
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingcartcontainer_id;

    public AddToCartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void verifyYourProductText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourProductText_xpath));
        yourProductText_xpath.isDisplayed();
    }
    public void AddToCartBackPack(String itemId)
    {
        addtocartsaucelabsbackpack_id.click();
    }
    public void AddToCartBikeLight(String itemId)
    {
        addtocartsaucelabsbikelight_id.click();
    }
    //verify item added to cart
    public static void verifyBackpackAddedCart(String itemId)
    {
        removesaucelabsbackpack_id.isDisplayed();
    }
    public static void verifyBikeLightAddedCart(String itemId)
    {
        removesaucelabsbikelight_id.isDisplayed();
    }
    public void clickShoppingCartContainer()
    {
        shoppingcartcontainer_id.click();
    }
     @Test
    public void Test()
    {
        System.out.println("Test");
    }

}
