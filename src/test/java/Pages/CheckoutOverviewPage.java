package Pages;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutOverviewPage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement checkoutOverview_xpath;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement sauceLabsBikeLight_xpath;

    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement itemTotal;
    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement tax;
    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement total;

    @FindBy(id = "cancel")
    WebElement cancelButton;

    @FindBy(id = "finish")
    WebElement finishButton;


    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverview_xpath));
        checkoutOverview_xpath.isDisplayed();
    }

    public void verifySauceLabsBikeLight() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(sauceLabsBikeLight_xpath));
        sauceLabsBikeLight_xpath.isDisplayed();
    }

    public void verifyTotalItem() {
        String itemTotalText = itemTotal.getText(); //get text of the element and store it in a string
        String[] expectedText = itemTotalText.split("\\$");//split the string and store it in an array
        double actualTotalItem = Double.parseDouble(expectedText[1]);//convert string to double
        System.out.println("Item total is: " + actualTotalItem);

        String taxText = tax.getText();
        String[] expectedTax1 = taxText.split("\\$");
        double actualTax = Double.parseDouble(expectedTax1[1]);
        System.out.println("Item tax is: " + actualTax);

        double expectedTotal = actualTotalItem + actualTax;
        double expectedTotalSum = Math.round(expectedTotal * 100.0) / 100.0; //round the number to 2 decimal places
        System.out.println("Expected total sum is: " + expectedTotalSum);

        String totalText = total.getText();
        String[] expectedTotal2 = totalText.split("\\$");
        double actualTotal = Double.parseDouble(expectedTotal2[1]);
        System.out.println("Total item is: " + actualTotal);

        Assert.assertEquals(actualTotal, expectedTotalSum, "Total is not correct.");

//        // Check if the actual total matches the expected total
//        if (actualTotal == expectedTotalSum) {
//            finishButton.click();
//        } else {
//            cancelButton.click();
//        }

    }

//    public void clickCancelButton() {
//        cancelButton.click();
//    }

    public void clickFinish() {
        finishButton.click();
    }
}






























