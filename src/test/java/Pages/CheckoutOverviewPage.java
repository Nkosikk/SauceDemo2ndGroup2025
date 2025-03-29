package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {
    WebDriver driver;

    //locate description text element in the checkout overview page
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[2]")
    WebElement DescriptionText_xpath;

    //locate finish button element in the checkout overview page
    @FindBy(id = "finish")
    WebElement finish_id;

    // locate price element in the checkout overview page
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement price_xpath;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check if the description text is displayed
    public boolean isDescriptionTextDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(DescriptionText_xpath));
        return DescriptionText_xpath.getText().contains("Description");
    }

    //Click the finish button
    public void ClickFinishButton(){
        finish_id.click();
    }

    // Calculate total price including 8% tax
    public double calculateTotalPriceWithTax() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(price_xpath));
        String priceText = price_xpath.getText().replace("$", "");
        double price = Double.parseDouble(priceText);
        double tax = price * 0.08;
        return price + tax;
    }

}
