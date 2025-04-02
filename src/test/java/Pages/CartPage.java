package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement cartText_xpath;
    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCartText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(cartText_xpath));
        cartText_xpath.isDisplayed();

    }

    public void addToCart() {

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    public void clickCheckoutButton() {
        checkoutButton_id.click();
    }

}
