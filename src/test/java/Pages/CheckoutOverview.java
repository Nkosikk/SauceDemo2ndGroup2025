package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutOverview {
    WebDriver driver;

    //@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]")
   // WebElement PaymentInformation_xpath;

    @FindBy(id = "finish")
    WebElement FinishButton_id;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutOverviewHeader_xpath;

    @FindBy(css = ".cart_item")
    List<WebElement> cartItems_css;

    @FindBy(className = "complete-header")
    WebElement orderConfirmationMessage_id;

    //Constructor
    public CheckoutOverview(WebDriver driver) {
        this.driver = driver;
    }

    //Verify that on the cart overview page
    public String getCheckoutOverviewHeader() {
        return CheckoutOverviewHeader_xpath.getText();
    }

    //Verify that items are still in cart
    public List<WebElement> getCartItems() {
        return cartItems_css;
    }

    //Actions
    //public void AssertPaymentInfo(String PaymentInfo) {
       // PaymentInformation_xpath.getText()
   // }

    public void clickTheFinishButton() {
        FinishButton_id.click();
    }

    public String getConfirmationMessage() {
        return orderConfirmationMessage_id.getText();
    }
}
