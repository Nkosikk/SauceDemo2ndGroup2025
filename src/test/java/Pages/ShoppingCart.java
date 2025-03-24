package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartContainer;

    public void ShoppingCartContainer(){
        shoppingCartContainer.click();
    }

    @FindBy(xpath = "//span[@class='title']")
    WebElement yourCart;

    public void verifyYourCart(){
        yourCart.isDisplayed();
    }

}
