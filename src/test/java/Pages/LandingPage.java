package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    //Locators
    //Adding items to the cart

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productText_xpath;

    //Item 1
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement addToCartSauceLabsBackpack_xpath;

    //Item 2
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartSauceLabsBikeLight_id;

    //Item 3
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartSauceLabsBoltTShirt_id;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement shoppingCartContainer_xpath;


    //Constructor//
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Methods

    // verify product text page
    public void verifyProductText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

        //String productText = productText_xpath.getText();
        //Assert.assertEquals(productText, "Products");
    }

    //Add Item 1: add-to-cart-sauce-labs-backpack
    public void addItem1() {
        addToCartSauceLabsBackpack_xpath.click();
    }

    //Add Item 2: add-to-cart-sauce-labs-bike-light
    public void addItem2() {
        addToCartSauceLabsBikeLight_id.click();
    }

    //Add Item 3: add-to-cart-sauce-labs-bolt-t-shirt
    public void addItem3() {
        addToCartSauceLabsBoltTShirt_id.click();
    }

    //Click Shopping Cart Container
    public void clickShoppingCartContainer() {
        shoppingCartContainer_xpath.click();
    }

    //Click side menu
    public void clickSideMenu() {
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
    }

    //Click logout
    public void clickLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


}


