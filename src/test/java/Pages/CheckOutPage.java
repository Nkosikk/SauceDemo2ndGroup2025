package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    WebDriver driver;
    public CheckOutPage(){
        this.driver = driver;
    }

    public void clickCheckoutButton(){
        driver.findElement(By.id("checkout")).click();
    }

}
