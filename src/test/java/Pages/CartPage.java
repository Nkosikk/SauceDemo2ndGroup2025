package Pages;

import Tests.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Test
public class CartPage extends Base {
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartButton_xpath;

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
