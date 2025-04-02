package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyYourCartPage
{
    public static WebDriver driver;

    @FindBy(xpath ="//div[@id='shopping_cart_container']/a")
    static WebElement shopping_cart_container_xpath;

    public void VerifyItemsDisplayed()    {
        shopping_cart_container_xpath.click();

    }


    }


