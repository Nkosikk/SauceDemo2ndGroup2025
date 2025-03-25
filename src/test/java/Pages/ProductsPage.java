package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductsPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
//Validate that you in the products page.
    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
//        String productText = productText_xpath.getText();
//        Assert.assertEquals(productText, "Products");
    }

//Elements on the page.
    @FindBy(id = "Add-to-cart")
    WebElement AddToCart_id;

    @FindBy(id = "Remove")
    WebElement Remove_id;

    @FindBy(className = "shopping_cart_link")
    WebElement ShoppingCartLink_class;

    // Locate the "Add to Cart" button using its ID and click on it
    public void clickAddToCart() {
        AddToCart_id.click();
    }

    //In case you want to remove item "Remove  Cart" button using it's ID and click on it
    public void clickRemove() {
        Remove_id.click();


//Locate the "Shopping Cart Container icon" using it's Xpath and click on it
        public void clickShoppingCartLink () {
            ShoppingCartLink_class.click();
        }

    }
