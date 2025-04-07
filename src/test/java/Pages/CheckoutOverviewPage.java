package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {
    static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    static WebElement checkoutoverviewText_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    static WebElement itemTotal_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    static WebElement tax_xpath;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    static WebElement total_xpath;

    @FindBy(xpath = "//*[@id=\"cancel\"]")
    static WebElement cancelButton_xpath;

    @FindBy(id = "finish")
    static WebElement finish_id;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutoverviewText_xpath));
        checkoutoverviewText_xpath.isDisplayed();
    }
    public static void clickFinishButton()
    {
        finish_id.click();
    }

  /*  // verify the correct amount
    public void verifyTotalAmount() {
        try {
            //Retrieve values from the web page
            double itemTotal = extractAmountFromText(itemTotal_xpath.getText());
            System.out.println("Subtotal: " + itemTotal);

            double taxAmount = extractAmountFromText(tax_xpath.getText());
            System.out.println("Tax: " + taxAmount);

            double displayedTotal = extractAmountFromText(total_xpath.getText());
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
      public void getAmount()
    {
        Assert.assertEquals(itemTotal_xpath.getText();
        Assert.assertEquals(tax_xpath.getText();
        Assert.assertEquals(total_xpath.getText();
    }
    public static void validateTotal()
    {
        String itemTotal = itemTotal_xpath.getText();
        String tax = tax_xpath.getText();
        String total = total_xpath.getText();

        double itemTotalValue = Double.parseDouble(itemTotal.replace("$", ""));
        double taxValue = Double.parseDouble(tax.replace("$", ""));
        double totalValue = Double.parseDouble(total.replace("$", ""));

        double expectedTotal = itemTotalValue + taxValue;

        Assert.assertEquals(expectedTotal, totalValue, 0.01);
    }*/
}

