package Pages;

//Click Back Home Button

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage {

    WebDriver driver;

    @FindBy (xpath ="//*[@id=\"header_container\"]/div[2]/span" )
    WebElement checkOutCompleteText_xpath;
    @FindBy(id = "back-to-products")
    WebElement backtoproducts_id;

    //verify CheckOut Complete Page
    public void verifyCheckOutCompletePage() {
        checkOutCompleteText_xpath.isDisplayed();
    }

    //Click Back Home Button
    public void clickBackHomeButton() {
        backtoproducts_id.click();


    }

}




