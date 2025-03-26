package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage {

    WebDriver driver;

    @FindBy(id = "back-to-products")
    WebElement backToProductsButton_id;

    public OrderConfirmationPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickBackToProductsButton(){
        backToProductsButton_id.click();
    }
}
