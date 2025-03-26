package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Utils.BrowserFactory.driver;

//WebDriver driver;

public class ProductPage {  //Products page
    public void verifyProductSelection()  {

        ProductPage productPage = new ProductPage(driver);
        productPage.selectProduct();
        productPage.addToCart();
}
    public void selectProduct() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    public void addToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
