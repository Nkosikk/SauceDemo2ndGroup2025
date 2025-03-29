package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement productText_Xpath;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCart_id;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement cartButton_id;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyProductText(String username){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_Xpath));
        productText_Xpath.isDisplayed();

     //   String productText = productText_Xpath.getText();
     //   Assert.assertEquals(productText,"products");


    }
    public void clickAddToCart(){
        addToCart_id.click();
    }
    public void clickCart() {
        cartButton_id.click();
    }


}
