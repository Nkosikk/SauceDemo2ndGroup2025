package Tests;

import Utils.DatabaseConnection;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base{



    public void enterUsernameTests(){
        DatabaseConnection.User user = DatabaseConnection.getUserById(3); // use the desired user id
        if (user != null) {
            loginPage.enterUsername(user.getUsername());
        } else {
            throw new RuntimeException("User not found in database");
        }
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
