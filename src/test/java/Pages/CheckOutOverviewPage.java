package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        //      String itemTotalPrice = itemTotalPrice_Xpath.getText().replace("$", "").trim();
        //     String tax = tax_Xpath.getText().replace("$", "").trim();
        //       String total = total_Xpath.getText().replace("$", "").trim();
//     itemTotalPrice="9.99";

        //      double itemTotalPriceDouble = Double.parseDouble(itemTotalPrice);
        //      double taxDouble = Double.parseDouble(tax);
        //       double totalDouble = Double.parseDouble(total);

        //calculate the total price
        //      double expectedTotal = itemTotalPriceDouble + taxDouble;

        //      if (totalDouble == expectedTotal) {
        //          System.out.println("Total price is correct");
        //           finishButton_id.click();
        //      } else {
//           System.out.println("Total price is incorrect");
//       }

//       System.out.println("Item Total Price: " + itemTotalPrice);
        //       System.out.println("Tax: " + tax);
//       System.out.println("Total: " + total);
    }


    public void clickFinish() {
        finishButton_id.click();
    }
}

