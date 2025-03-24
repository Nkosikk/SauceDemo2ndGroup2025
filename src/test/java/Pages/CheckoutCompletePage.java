package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    WebDriver driver;
    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
    }
    public void openCheckoutCompletePage(){
        driver.get("https://www.saucedemo.com/checkout-complete.html");
    }
    public void clickBackHomeButton(){
        driver.findElement(By.id("back-to-products")).click();
    }

}
