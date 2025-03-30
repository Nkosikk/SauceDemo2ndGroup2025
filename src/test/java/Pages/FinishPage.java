package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage {
    WebDriver driver;

    public FinishPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy (id = "finish")
    WebElement finishButton_id;
    @FindBy (id = "back-to-products")
    WebElement backToProductsButton_id;
    @FindBy (className = "summary_subtotal_label")
    WebElement itemTotal;
    @FindBy (className = "summary_tax_label")
    WebElement tax;
    @FindBy (className = "summary_total_label")
    WebElement total;
    @FindBy (className = "complete-header")
    WebElement confirmationMessage;

    public void clickFinishButton(){
        finishButton_id.click();
    }
    public void clickCancelButton(){
        backToProductsButton_id.click();
    }

    public void verifyTotal() {
        double itemTotalValue = Double.parseDouble(itemTotal.getText().replace("Item total: $", ""));
        double taxValue = Double.parseDouble(tax.getText().replace("Tax: $", ""));
        double totalValue = Double.parseDouble(total.getText().replace("Total: $", ""));

        if (itemTotalValue + taxValue == totalValue) {
            clickFinishButton();
            if (confirmationMessage.isDisplayed()) {
                System.out.println("Test Passed: Order is dispatched");
            } else {
                System.out.println("Test Failed: Confirmation message not displayed");
            }
        } else {
            clickCancelButton();
            System.out.println("Test Failed: Total does not match");

        }
    }
    }






