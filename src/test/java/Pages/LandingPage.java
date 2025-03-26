package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    //Web Elements
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCartSauceLabsBackpack_id;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement AddToCartSauceLabsFleeceJacket_id;

    @FindBy(xpath = "//*[@id=shopping_cart_container]/a")
    WebElement ShoppingCartContainer_xpath;

    //Constructor
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void clickAddToCartSauceLabsBackPack() {
        AddToCartSauceLabsBackpack_id.click();
    }

    public void clickAddToCartSauceLabsFleeceJacket() {
        AddToCartSauceLabsFleeceJacket_id.click();
    }

    public void clickShoppingCartContainer() {
        ShoppingCartContainer_xpath.click();
    }
}
