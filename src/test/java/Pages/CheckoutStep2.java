package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementSelectionStateToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class CheckoutStep2 {
    @FindBy(xpath = "//div[@class =\"summary_subtotal_label\"]")
    WebElement subtotal_xpath;
    @FindBy(xpath = "//div[@class =\"summary_tax_label\"]")
    WebElement tax_xpath;
    @FindBy(xpath = "//div[@class =\"summary_total_label\"]")
    WebElement total_xpath;
    @FindBy(id = "finish")
    static WebElement finishButton_id;

    public static void main(String[] args) {
        // Assuming driver is initialized elsewhere
        WebDriver driver = null; // Placeholder for the actual WebDriver initialization
        CheckoutStep2 checkoutStep2 = new CheckoutStep2(driver);

        double subtotal = Double.parseDouble(checkoutStep2.subtotal_xpath.getText().replace("$", ""));
        double tax = Double.parseDouble(checkoutStep2.tax_xpath.getText().replace("$", ""));
        double total = Double.parseDouble(checkoutStep2.total_xpath.getText().replace("$", ""));

        if (total == subtotal + tax) {
            System.out.println("Total is correct: " + total);
            finishButton_id.click();
        } else {
            System.out.println("Total is incorrect...BAD CALCULATIONS: " + total);
        }
    }



    public CheckoutStep2(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(subtotal_xpath));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(tax_xpath));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(total_xpath));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(finishButton_id));

    }

}

