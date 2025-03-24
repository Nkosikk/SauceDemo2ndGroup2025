package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement products_xpath;
    // identify element for add to cart button
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement addToCartButton_id;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement cart_xpath;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    //Check if the text PRODUCTS is displayed
   /* public boolean isProductsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(products_xpath));
        return products_xpath.getText().contains("products");
    }*/
    // same as above
    public void isProductsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(products_xpath));
        products_xpath.isDisplayed();
    }
    //Add item to cart
    public void AddToCartButton() {
        addToCartButton_id.click();
    }
    //CLick Cart
    public void ClickCart(){
        cart_xpath.click();
    }

}
