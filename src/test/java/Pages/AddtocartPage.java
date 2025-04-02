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
    AddtocartPage addtocartPage = new AddtocartPage(driver);

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    static WebElement addtocart_xpath;

    public AddtocartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void clickAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addtocart_xpath));
        addtocart_xpath.click();


        {
        }


    }

    public void clickaddtocartButton() {AddtocartButton();
        addtocart_xpath.click();
    }

    private void AddtocartButton() {
    }
}