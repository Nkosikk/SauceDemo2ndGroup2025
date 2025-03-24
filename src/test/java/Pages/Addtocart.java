package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart {

    WebDriver  driver;

    @FindBy(id ="add-to-cart-sauce-labs-bike-light")
    WebElement Addtocart_id;

    //click add to cart button
    public void clickAddtocartButton(){
        Addtocart_id.click();
    }


}
