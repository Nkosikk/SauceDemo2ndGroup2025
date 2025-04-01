package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='summary_info_label'][contains(.,'Payment Information:')]")
    WebElement checkoutOverviewText_Xpath;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    //Elements for calculation
    @FindBy(xpath = " //*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotalPrice_Xpath;

    @FindBy(xpath = " //*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement tax_Xpath;

    @FindBy(xpath = " //*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    WebElement total_Xpath;


    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_Xpath));
        checkoutOverviewText_Xpath.isDisplayed();
    }

    //Method to calculate the total price

    public void calculateTotalPrice() {
        String itemTotalPrice = itemTotalPrice_Xpath.getText();
        double itemTotalPriceDouble = extractNumericValue(itemTotalPrice);
        System.out.println("Item Total Price: " + itemTotalPriceDouble);

        String tax = tax_Xpath.getText();
        double taxDouble = extractNumericValue(tax);
        System.out.println("Tax: " + taxDouble);

        double expectedTotal = itemTotalPriceDouble + taxDouble;
        double expectedTotalsum = Math.round(expectedTotal * 100.0) / 100.0;
        System.out.println("Expected Total: " + expectedTotalsum);

        String total = total_Xpath.getText();
        double totalDouble = extractNumericValue(total);
        System.out.println("Total: " + totalDouble);
    }

    /**
     * Helper method to extract numeric values from a string.
     */
    private double extractNumericValue(String text) {
        // Replace all non-numeric characters except dot
        String numericText = text.replaceAll("[^0-9.]", "").trim();

        // Handle empty or invalid cases
        if (numericText.isEmpty()) {
            throw new NumberFormatException("No numeric value found in: " + text);
        }

        return Double.parseDouble(numericText);

//        Assert.assertEquals(totalDouble, expectedTotalsum,"Total price is incorrect");
        //calculate the total price
//         if (totalDouble == expectedTotal) {
 //               System.out.println("Total price is correct");
//                  finishButton_id.click();
//              } else {
//          System.out.println("Total price is incorrect");
//      }

    }

    public void clickFinish() {
        finishButton_id.click();
    }
}

