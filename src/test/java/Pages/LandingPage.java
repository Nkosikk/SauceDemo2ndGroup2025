package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement productText_xpath;

    //identifying the elements for backpack
    @FindBy(xpath = "//div[@class='inventory_item_name '][contains(.,'Sauce Labs Backpack')]")
    WebElement backPackHyperlink_xpath;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addBackpackToCartButton_xpath;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement removeBackpackFromCartButton_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_price'][contains(.,'$29.99')]")
    WebElement BackpackProductPrice_xpath;

    @FindBy(xpath = "//button[@id='add-to-cart']")
    WebElement addBackpackToCartProductLevel_xpath;
    @FindBy(xpath = "//button[@id='remove']")
    WebElement removeBackpackFromCartButtonProductLevel_xpath;

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToProductsButton_xpath;

    @FindBy(xpath = "//a[contains(@data-test,'shopping-cart-link')]")
    WebElement shoppingCartLink_xpath;


    @FindBy(xpath = "//span[@class='shopping_cart_badge'][contains(.,'1')]")
    WebElement shoppingCartBadge_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

        String productText = productText_xpath.getText();
        Assert.assertEquals(productText, "Products");
    }


    public void verifyBackPackItem(){

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backPackHyperlink_xpath));
        backPackHyperlink_xpath.isDisplayed();
        //productName_xpath.click();

        String backPackText = backPackHyperlink_xpath.getText();
        Assert.assertEquals(backPackText, "Sauce Labs Backpack");

        String backPackPrice = BackpackProductPrice_xpath.getText();
        Assert.assertEquals(backPackPrice, "$29.99");

        //WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        //addToCartButton.click();

    }
    public void addBackPackItemToCart(){
        addBackpackToCartButton_xpath.isDisplayed();
        addBackpackToCartButton_xpath.click();
        String removeBackPackText = removeBackpackFromCartButton_xpath.getText();
        Assert.assertEquals(removeBackPackText, "Remove");
        String cartButtonVerify = shoppingCartLink_xpath.getText();
        Assert.assertEquals(cartButtonVerify, "1");

    }
    public void removeBackPackItemFromCart(){
        removeBackpackFromCartButton_xpath.isDisplayed();
        removeBackpackFromCartButton_xpath.click();
        String addBackPackText = addBackpackToCartButton_xpath.getText();
        Assert.assertEquals(addBackPackText, "Add to cart");

    }

    public void accessYourCart(){
    //    shoppingCartLink_xpath.isDisplayed();
        shoppingCartLink_xpath.click();
    }

}
