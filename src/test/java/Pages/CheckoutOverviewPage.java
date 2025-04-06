package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {

     WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]")
    WebElement checkoutOverviewText_xpath;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    static
    WebElement SauceLabsBackpack_xpath;

    @FindBy ( xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotal_xpath;

    @FindBy ( xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement tax_xpath;

    @FindBy ( xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    WebElement totalToPay_xpath;
    @FindBy (id = "cancel")
    WebElement cancelButton_id;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifySauceLabsBackpack() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(SauceLabsBackpack_xpath));
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_xpath));
        checkoutOverviewText_xpath.isDisplayed();

    }


    public void calculations() {

        String bitemTotal = itemTotal_xpath.getText().replace("Item Total: $", "");
        double aitemTotal = Double.parseDouble(bitemTotal);

        String btax = tax_xpath.getText().replace("Tax: $", "");
        double atax = Double.parseDouble(btax);

        String bTotalToPay =  (totalToPay_xpath.getText().replace("Total: $", ""));
        double aTotalToPay = Double.parseDouble(bTotalToPay);

        DecimalFormat df = new DecimalFormat("#.00");
        double sum = aitemTotal + atax;
        double formattedSum = Double.parseDouble(df.format(sum));

        System.out.println();
        System.out.println("Item Total: " + aitemTotal);
        System.out.println("Tax: " + atax);
        System.out.println("Total to Pay: " + aTotalToPay);
        System.out.println("Sum of tax plus item total " + formattedSum);

        if (formattedSum == aTotalToPay) {
            finishButton_id.click();
        } else {
            cancelButton_id.click();
        }

    }


    public void clickFinishButton() {
        finishButton_id.click();
    }

}
