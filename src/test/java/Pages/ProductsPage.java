package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }
    public void openProductsPage(){
        driver.get("https://www.saucedemo.com/inventory.html");
    }
    public void clickAddToCartButton(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    public void clickCartButton(){
        driver.findElement(By.id("shopping_cart_container")).click();
    }

}
