package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    //Dynamic method to add item to cart
    public void addItemToCart(String itemName){
        driver.findElement(By.xpath("//*[text()=' " + itemName + " ']")).click();
        driver.findElement(By.id("add-to-cart")).click();


    }
}
