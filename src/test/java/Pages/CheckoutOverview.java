package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverview {
    WebDriver driver;

    //@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]")
   // WebElement PaymentInformation_xpath;

    @FindBy(id = "Finish")
    WebElement Finishbutton_id;

    @FindBy(className = "complete-header")
    WebElement orderConfirmationMessage_id;

    //Constructor
    public CheckoutOverview(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    //public void AssertPaymentInfo(String PaymentInfo) {
       // PaymentInformation_xpath.getText()
   // }

    public void clickthefinishbutton() {
        Finishbutton_id.click();
    }

    public String getConfirmationMessage() {
        return orderConfirmationMessage.getText();
    }
}
