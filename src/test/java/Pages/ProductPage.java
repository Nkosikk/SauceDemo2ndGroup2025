package Pages;

import org.openqa.selenium.WebDriver;

import static Utils.BrowserFactory.driver;

public class ProductPage {  //Products page
    public void verifyProductSelection()  {
        ProductPage productPage = new ProductPage(driver);
        productPage.selectProduct();
        productPage.addToCart();
}
    public void selectProduct() {
        WebDriver driver;
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    public void addToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
