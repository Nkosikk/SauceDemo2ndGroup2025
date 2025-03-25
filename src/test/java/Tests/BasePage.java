package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class BasePage {

    protected WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver=driver;
    }
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void type(String text, By locator){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    protected void click(By locator){
        find(locator).click();
    }
    protected Boolean isDisplayed(By locator){
        try{
            return find(locator).isDisplayed();
        }catch (NoSuchElementException exception){
            return false;
        }
        //the objective of this BasePage is to have a common place to put all the common methods and variables that are used in the tests//
    }
}
