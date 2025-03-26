package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {

    WebDriver driver;

    //Locators
    //verifying if we are in the Checkout Overview page

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutOverviewText_xpath;

    //clicking the finish button in the Checkout Overview page
    @FindBy(xpath = "//*[@id=\"finish\"]")
    WebElement finishButton_xpath;


    //constructor
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void verifyOverviewText()  {
        String checkoutOverviewText = checkoutOverviewText_xpath.getText();
        if (checkoutOverviewText.equals("Checkout: Overview")) {
            System.out.println("You are in the Checkout: Overview Page");
        } else {
            System.out.println("You are not in the Checkout: Overview Page");
        }
    }
    public void clickfinish() {
        finishButton_xpath.click();
    }




}
