package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productText_xpath;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addtocartsaucelabsbackpack_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addtocartsaucelabsbikelight_id;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingcartcontainer_id;

    //@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    //WebElement yourCartText_xpath;

    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void verifyProductText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
    }
        /* public void clickAddToCart(String itemId) {
          if (itemId.equals("addtocartsaucelabsbackpack_id")) {
             addtocartsaucelabsbackpack_id.click();
          }  else if (itemId.equals("addtocartsaucelabsbikelight_id")) {
             addtocartsaucelabsbikelight_id.click();
          }
         }*/
    public void addToCartPack(String itemId)
    {
        addtocartsaucelabsbackpack_id.click();
    }
    public void addToCartLight(String itemId)
    {
        addtocartsaucelabsbikelight_id.click();
    }
    public void clickShoppingCartContainer()
    {
        shoppingcartcontainer_id.click();
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourCartText_xpath));
    }

    public void ClickAddToCart(String addtocartsaucelabsbackpackId) {
    }
}
