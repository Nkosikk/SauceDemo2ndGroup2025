package Pages;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {

    public WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement overview_xpath;

    @FindBy(xpath = "//div[@data-test='subtotal-label']")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//div[@data-test='tax-label']")
    WebElement tax_xpath;

    @FindBy(xpath = "//div[@data-test='total-label']")
    WebElement totalToPay_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancelButton_xpath;


    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(overview_xpath));
        overview_xpath.isDisplayed();
    }

    public void calculations() {

        //Converting Item Total
        String bItemTotal = (itemTotal_xpath.getText()).replace("Item total: $", "");
        double aItemTotal = Double.parseDouble(bItemTotal);

        //Converting Tax
        String bTax = (tax_xpath.getText()).replace("Tax: $", "");
        double aTax = Double.parseDouble(bTax);

        //Calculating Tax
        //String bTax = (tax_xpath.getText()).replace("Tax: $", "");
        //double aTax = aItemTotal * 0.08;

        //Converting Total to Pay
        String bTotalToPay = (totalToPay_xpath.getText()).replace("Total: $", "");
        double aTotalToPay = Double.parseDouble(bTotalToPay);

        //Rounding off the sum of tax and item total to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        double sum = aItemTotal + aTax;
        double formattedSum = Double.parseDouble(df.format(sum));

        System.out.println();
        System.out.println("Item total "+aItemTotal);
        System.out.println("Tax "+aTax);
        System.out.println("Total to Pay "+aTotalToPay);
        System.out.println("Sum of tax plus item total "+formattedSum);

        //Comparing the sum of tax and item total with the total to pay
        if (formattedSum == aTotalToPay) {
            Assert.assertTrue(true);
            finishButton_xpath.click();

        } else {
            Assert.assertFalse(false);
            cancelButton_xpath.click();
        }

    }
}
























