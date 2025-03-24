package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage (WebDriver driver){
        this.driver = driver;
    }
    public void openCartPage(){
        driver.get("https://www.saucedemo.com/cart.html");
    }
    public void clickCheckoutButton(){
        driver.findElement(By.id("checkout")).click();
    }
    public void clickContinueShoppingButton(){
        driver.findElement(By.id("continue-shopping")).click();
    }
    public void clickRemoveButton(){
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
    public void clickContinueShoppingButton2(){
        driver.findElement(By.id("continue-shopping")).click();
    }
    public void clickRemoveButton2(){
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
    }
}
