package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutCompletePage {
    public WebDriver driver;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "checkout_complete_container")
    WebElement checkoutCompleteContainer;
    @FindBy(xpath = "//div[@class='complete-text'][contains(.,'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]")
    WebElement checkoutComplete;

    @FindBy(id = "back-to-products")
    WebElement backToProductsButton;

    public void checkoutComplete() {
        Assert.assertEquals(checkoutComplete.getText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }
    public void verifyCheckoutCompleteText() {
        checkoutCompleteContainer.isDisplayed();
        Assert.assertTrue(checkoutCompleteContainer.isDisplayed(), "Checkout complete container is not displayed");
    }
    public void clickBackToProducts() {
        backToProductsButton.click();
    }
}