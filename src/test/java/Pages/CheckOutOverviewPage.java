package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;

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

    @FindBy(xpath = "//*[@id=\"cancel\"]")
    WebElement CancelButton_xpath;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    WebElement FinishButton_xpath;

    //Constructor to initialize the driver and web elements
    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    // Wait for an element to be visible
    private WebElement waitForElementToBeVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }


    //Verify that you are in the checkout overview page.
    public boolean verifyCheckoutOverviewText() {
        return waitForElementToBeVisible(CheckoutOverviewText_xpath).isDisplayed();
    }

    //Verify Subtotal label Text
    public boolean verifySubtotalText() {
        return waitForElementToBeVisible(SubtotalText_xpath).isDisplayed();
    }

    // Verify Tax label Text
    public boolean verifyTaxText() {
        return waitForElementToBeVisible(TaxText_xpath).isDisplayed();
    }

    // Verify Total label Text
    public boolean verifyTotalText() {
        return waitForElementToBeVisible(TotalText_xpath).isDisplayed();
    }

    // Method to verify the correct amount calculation
    public boolean verifyTotalAmount() {
        try {
            // Retrieve values from the web page

            WebElement subtotalText = waitForElementToBeVisible(SubtotalText_xpath);
            double itemTotal = extractAmountFromText(subtotalText.getText());
            System.out.println("Subtotal: " + itemTotal);

            WebElement taxAmountElement = waitForElementToBeVisible(TaxText_xpath);
            double taxAmount = extractAmountFromText(taxAmountElement.getText());
            System.out.println("Tax: " + taxAmount);

            WebElement totalAmountElement = waitForElementToBeVisible(TotalText_xpath);
            double displayedTotal = extractAmountFromText(totalAmountElement.getText());
            System.out.println("Total: " + displayedTotal);

            // Calculate expected total
            double expectedTotal = itemTotal + taxAmount;
            System.out.println("Expected Total: " + expectedTotal);

            // Compare expected and displayed total
            if (Double.compare(expectedTotal, displayedTotal) != 0) {

                // If the total amount is incorrect, click the cancel button to cancel the order
                waitForElementToBeVisible(CancelButton_xpath).click();
                return false;

            } else {
                // If the total amount is correct, click the finish button to complete the order
                waitForElementToBeVisible(FinishButton_xpath).click();
                return true;
            }

        } catch (NumberFormatException e) {
            System.out.println("Error in number format: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Unexpected error occured: " + e.getMessage());
            return false;
        }

    }

    private double extractAmountFromText(String text) {

        // Extract the amount from the text
        String amount = text.replaceAll("[^0-9.]", "");
        return Double.parseDouble(amount);
    }

}
