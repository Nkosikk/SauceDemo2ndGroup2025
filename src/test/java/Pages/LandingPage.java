package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    WebDriver driver;

    @FindBy(id ="add-to-cart-sauce-labs-backpack")
    WebElement addtocart_id;

    //Click Add to Cart Button
    public void clickAddtoCartButton(){
        addtocart_id.click();
    }
}


