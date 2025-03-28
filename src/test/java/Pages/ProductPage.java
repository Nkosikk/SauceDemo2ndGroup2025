package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductPage {

    WebDriver driver;

     public void ClickAddToCart(String itemId)

        @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
        WebElement productText_xpath;

        @FindBy(id = "add-to-cart-sauce-labs-backpack")
        WebElement addtocartsaucelabsbackpack_id;

        @FindBy(id = "add-to-cart-sauce-labs-bike-light")
        WebElement addtocartsaucelabsbikelight_id;

        @FindBy(id = "shopping_cart_container")
        WebElement shoppingcartcontainer_id;

    public ProductPage(WebDriver driver)
        {
            this.driver = driver;
        }

        public void verifyProductText () {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
            productText_xpath.isDisplayed();
        }
        public void ClickAddToCart (String itemId)
        {
            if (itemId.equals("addtocartlabsbackpack_id"))
            {
                addtocartsaucelabsbackpack_id.click();
            } else if (itemId.equals("addtocartsaucelabsbikelight_id")) {
                addtocartsaucelabsbikelight_id.click();
            }
        }
        //Click shopping cart container
        public void ClickShoppingCartContainer ()
        {
            shoppingcartcontainer_id.click();
        }
    }

