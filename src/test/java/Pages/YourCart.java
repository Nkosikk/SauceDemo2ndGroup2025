package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.text.DecimalFormat;

public class YourCart {

    WebDriver driver;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;
    //=========Temporary==========
    @FindBy(id = "first-name")
    WebElement firstName_id;

    @FindBy(id = "last-name")
    WebElement lastName_id;

    @FindBy(id = "postal-code")
    WebElement postalCode_id;

    @FindBy(id = "continue")
    WebElement continue_id;
    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[6]")
    WebElement itemTotal_xpath;
    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[7]")
    WebElement tax_xpath;
    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[8]")
    WebElement total_xpath;


    public YourCart(WebDriver driver) {
        this.driver = driver;
    }


    public void clickCheckoutButton() {
        checkoutButton_id.click();
    }

    public void enterFirstName() {
        firstName_id.sendKeys("Name one");
    }

    public void enterLastName() {
        lastName_id.sendKeys("Name two");
    }

    public void enterPostalCode() {
        postalCode_id.sendKeys("Postal code");
    }


    public void clickContueButton() {
        continue_id.click();
    }

    public double getTheAmount(WebElement element){
        String itemCostText = element.getText();
        String[] splitTex = itemCostText.split("\\$");

        return Double.parseDouble(splitTex[1]);
    }

    public void validateTotal(){
        double sum = getTheAmount(itemTotal_xpath) + getTheAmount(tax_xpath);
        double totalAmount = Math.floor(sum * 100) / 100;
        double actualTotal = getTheAmount(total_xpath);
        Assert.assertEquals(totalAmount,actualTotal);
        System.out.println("Expected amount : " +totalAmount +" = "+ " Actual amount : "+actualTotal);

    }

}






