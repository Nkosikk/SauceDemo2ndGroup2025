package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage {
    WebDriver driver;
    public CheckoutStepTwoPage(WebDriver driver){
        this.driver = driver;
    }
    public void openCheckoutStepTwoPage(){
        driver.get("https://www.saucedemo.com/checkout-step-two.html");
    }
    public void clickFinishButton(){
        driver.findElement(By.id("finish")).click();
    }
    public void clickCancelButton(){
        driver.findElement(By.id("cancel")).click();
    }
    public void clickFinishButton2(){
        driver.findElement(By.id("finish")).click();
    }

}
