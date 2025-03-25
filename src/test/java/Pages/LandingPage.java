package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Click add to cart button
    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickShoppingCart() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }
}
