package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutOverviewText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement SubtotalText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement TaxText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    WebElement TotalText_xpath;

    @FindBy(id = "Cancel")
    WebElement Cancel_id;

    @FindBy(id = "Finish")
    WebElement Finish_id;

    //Constructor to initialize the driver and web elements
    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify that you are in the checkout overview page.
    public boolean verifyCheckoutOverviewText() {
        return CheckoutOverviewText_xpath.isDisplayed();
    }

    //Verify Subtotal label Text
    public boolean verifySubtotalText() {
        return SubtotalText_xpath.isDisplayed();
    }

    // Verify Tax label Text
    public boolean verifyTaxText() {
        return TaxText_xpath.isDisplayed();
    }

    public boolean TotalText() {
        return TotalText_xpath.isDisplayed();
    }

    // Method to verify the correct amount calculation
    public boolean verifyTotalAmount() {
        // Retrieve values from the web page

        WebElement subtotalText = SubtotalText_xpath;
        double itemTotal = Double.parseDouble(subtotalText.getText().replace("$", ""));

        WebElement taxAmountElement = TaxText_xpath;
        double taxAmount = Double.parseDouble(taxAmountElement.getText().replace("$", ""));

        WebElement totalAmountElement = TotalText_xpath;
        double displayedTotal = Double.parseDouble(totalAmountElement.getText().replace("$", ""));

        // Calculate expected total
        double expectedTotal = itemTotal + taxAmount;

        // Compare expected and displayed total
        if (Double.compare(expectedTotal, displayedTotal) != 0) {
            // If the total amount is incorrect, click the cancel button to cancel the order
            Cancel_id.click();
            return false;

        } else {
            // If the total amount is correct, click the finish button to complete the order
            Finish_id.click();
            return true;
        }

    }

}
