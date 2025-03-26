package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {
    WebDriver driver;


    // Locators

    //verifying if we are in the Products Page
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productText_xpath;


    //Adding items to the cart
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCartSauceLabsBackpack_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement AddToCartSauceLabsBikeLight_id;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement AddToCartSauceLabsBoltTShirt_id;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement AddToCartSauceLabsFleeceJacket_id;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement AddToCartSauceLabsOnesie_id;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement AddToCartTestAllTheThingsTShirtRed_id;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement RemoveSauceLabsBikeLight_id;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement RemoveSauceLabsFleeceJacket_id;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement ShoppingCartContainer_xpath;

    //Constructor
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    //Methods

    //verifying if we are in the Products Page
    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        String ProductText = productText_xpath.getText();
        Assert.assertEquals(ProductText, "Products");
    }

    //Select item from the landing page

    public void selectItem() {
        AddToCartSauceLabsBackpack_id.click();
    }

    public void selectItem1() {
        AddToCartSauceLabsBikeLight_id.click();
    }

    public void selectItem2() {
        AddToCartSauceLabsBoltTShirt_id.click();
    }

    public void selectItem3() {
        AddToCartSauceLabsFleeceJacket_id.click();
    }

    public void selectItem4() {
        AddToCartSauceLabsOnesie_id.click();
    }

    public void selectItem5() {
        AddToCartTestAllTheThingsTShirtRed_id.click();
    }

    public void clickShoppingCart() {
        ShoppingCartContainer_xpath.click();
    }

    public void clickRemoveItem() {
        RemoveSauceLabsBikeLight_id.click();
    }

    public void clickRemoveItem1() {
        RemoveSauceLabsFleeceJacket_id.click();
    }
}