// Created by: [Babongile Mpungose]
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {
    WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addtocartsaucelabsbackpack_id;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addtocartsaucelabsbikelight_id;
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingcartcontainer_id;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourCartText_xpath;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void AddToCartBackPack(String itemId) {
        addtocartsaucelabsbackpack_id.click();
    }
    public void AddToCartBikeLight(String itemId) {
        addtocartsaucelabsbikelight_id.click();
    }
    public void clickShoppingCartContainer() {
        shoppingcartcontainer_id.click();
    }
    public void verifyYourCartText() {
        yourCartText_xpath.isDisplayed();
    }

     /* @Test
    public void Test()
    {
        System.out.println("Test");
    }*/

}
