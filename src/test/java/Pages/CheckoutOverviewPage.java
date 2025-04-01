package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutOverviewPage {
    WebDriver driver;

    By itemName = By.className("inventory_item_name");
    By itemTotal = By.className("summary_subtotal_label");
    By tax = By.className("summary_tax_label");
    By total = By.className("summary_total_label");
    By finishBtn = By.id("finish");
    By cancelBtn = By.id("cancel");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean validateTotals() {
        double subtotal = Double.parseDouble(driver.findElement(itemTotal).getText().replace("Item total: $", ""));
        double taxAmount = Double.parseDouble(driver.findElement(tax).getText().replace("Tax: $", ""));
        double totalAmount = Double.parseDouble(driver.findElement(total).getText().replace("Total: $", ""));
        return subtotal + taxAmount == totalAmount;
    }

    public void finishOrCancel() {
        if (validateTotals()) {
            driver.findElement(finishBtn).click();
        } else {
            driver.findElement(cancelBtn).click();
        }
    }

    public String getItemName() {
        return driver.findElement(itemName).getText();
    }
}
