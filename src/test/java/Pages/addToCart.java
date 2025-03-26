package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class addToCart {

    WebDriver driver;

//    @FindBy(XPath = "//button[@id='add-to-cart-sauce-labs-backpack'])") WebElement addToCartButton;


    public addToCart(WebDriver driver) {
        this.driver = driver;
    }
}
