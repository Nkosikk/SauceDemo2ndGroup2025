package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddtocartPage {
    static WebDriver driver;
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    static WebElement addtocart_xpath;

    public AddtocartPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public static void clickAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addtocart_xpath));
        addtocart_xpath.click();


        {
        }


    }
}