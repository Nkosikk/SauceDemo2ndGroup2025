package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckOutCompletePage {
    WebDriver driver

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutCompleteText_xpath;

    @FindBy(id = "react-burger-menu-btn")
    WebElement Menu_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement Logout_id;

    //Verify that you are in the checkout complete page.
    public void verifyCheckoutCompleteText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CheckoutCompleteText_xpath));
        CheckoutCompleteText_xpath.isDisplayed();
//        String CheckoutCompleteText = CheckoutCompleteText_xpath.getText();
//        Assert.assertEquals(CheckoutCompleteText, "Checkout: Complete!");
    }

        // Click on the hamburger  menu

        public void clickMenu () {
            Menu_id.click();

            public void clickLogout () {
                Logout_id.click();



            }
        }
