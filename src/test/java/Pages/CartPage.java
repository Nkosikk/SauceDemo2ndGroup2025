package Pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class CartPage {
    @findBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement cartButton_xpath;
}
