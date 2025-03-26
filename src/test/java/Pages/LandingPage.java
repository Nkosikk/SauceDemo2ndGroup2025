package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {
    private By title =By.className("title");
    private By backpack =By.id("item_4_title_link");
    private By addToCartButton =By.id("add-to-cart-sauce-labs-backpack");
    //landing page inherits methods and properties from BasePage
    public LandingPage(WebDriver driver){
        super(driver);
    }
    public Boolean isTitleDisplayed(){

        return isDisplayed(title);
    }
    public void clickBackpack(){
        find(backpack).click();
        click(addToCartButton);
    }
    public String getButtonName(){

        return find(addToCartButton).getText();
    }

    }
