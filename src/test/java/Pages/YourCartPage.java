package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class YourCartPage
{
    WebDriver driver;

    //@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    //WebElement yourCartText_xpath;
    @FindBy(id = "checkout")
    WebElement checkout_id;

    public YourCartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    /*public void verifyYourCartText()
    {
        yourCartText_xpath.isDisplayed();
    }*/
    public void clickCheckoutButton()
    {
        checkout_id.click();
    }

   // @Test(dependsOnMethods = "enterPasswordTests")
   // public void clickLoginTests() {
      //  takeScreenshots.takesSnapShot(driver, "Login Page");
      //  loginPage.clickLoginButton();
   // }

    @Test
    public void Test()
    {
        System.out.println("Test");
    }
}
