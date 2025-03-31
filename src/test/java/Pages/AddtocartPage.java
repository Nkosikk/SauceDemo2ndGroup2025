package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage{
    WebDriver driver;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addtocart_xpath;

    public AddtocartPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }




    public static void clickAddToCartButton() {
    }


}
