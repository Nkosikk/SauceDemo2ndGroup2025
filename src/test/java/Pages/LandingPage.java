package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    WebDriver driver;

    //Web Elements
    @FindBy =(id ="add-to-cart-sauce-labs-backpack")
    WebElement addtocartsaucelabsbackpack_id;

    @FindBy =(id ="add-to-cart-sauce-labs-fleece-jacket")
    WebElement addtocartsaucelabsfleecejacket_id;

    @FindBy =(xpath ="//*[@id="shopping_cart_container"]/a")
    WebElement shoppingcartcontainer_xpath;

    //Constructor
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions

}
