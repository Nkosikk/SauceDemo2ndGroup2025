package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpack;

    public void addToCartBackpack(){
        addToCartBackpack.click();
    }
     @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBikeLight;

    public void addTocCartBikeLight(){
        addToCartBikeLight.click();
    }

   // @FindBy(id = "shopping_cart_container")

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeBikeLight;

    public void removeBikeLight(){
        removeBikeLight.click();
    }

   // @FindBy(id = "continue-shopping")

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartBoltTShirt;

    public void addToCartBoltTShirt(){
        addToCartBoltTShirt.click();
    }

    // @FindBy(id = "checkout")

}



