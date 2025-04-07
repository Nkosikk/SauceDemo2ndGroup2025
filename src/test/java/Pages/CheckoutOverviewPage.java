package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {

     WebDriver driver;
     WebDriverWait wait;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Overview')]")
    WebElement checkoutOverviewText_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    WebElement backpackProductName_xpath;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancelButton_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton_xpath;

    @FindBy(xpath = "//div[contains(@data-test,'total-info-label')]")
    WebElement totalInfoLabel_xpath;

    @FindBy(xpath = "//div[contains(@class,'summary_subtotal_label')]")
    WebElement summaryItemTotalLabel_xpath;


    @FindBy(xpath = "//div[contains(@class,'summary_tax_label')]")
    WebElement summaryTaxLabel_xpath;

    @FindBy(xpath = "//div[contains(@class,'summary_total_label')]")
    WebElement summaryTotalLabel_xpath;


    public void verifyCheckOutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_xpath));
        checkoutOverviewText_xpath.isDisplayed();

        String checkoutOverviewText = checkoutOverviewText_xpath.getText();
        Assert.assertEquals(checkoutOverviewText, "Checkout: Overview");
    }

    public double getTheAmount (WebElement element) {
        String amountText = element.getText();
        String[] splitTex = amountText.split("\\$");
       // String amountValue = amountText.replaceAll("[^0-9.]", "");
        return Double.parseDouble(splitTex[1]);

    }

    public void validateTotalAmount() {
        double itemTotal = getTheAmount(summaryItemTotalLabel_xpath);
        double tax = getTheAmount(summaryTaxLabel_xpath);
        double total = getTheAmount(summaryTotalLabel_xpath);

        double expectedTotal = itemTotal + tax;

        Assert.assertEquals(total, expectedTotal, "Total amount is not correct");
        System.out.println("Total amount is correct : " + total + " = " +  " Actual amount :" + expectedTotal);
    }
}

