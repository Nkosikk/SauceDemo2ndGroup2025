package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class LoggingInTests extends Base {


    public void clickUserDropdown() {
        loginPage.clickUserDropdown();
    }

    @Test(dependsOnMethods = "clickUserDropdown")
    public void enterEmailAddress() {
        loginPage.enterEmailAddress(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterEmailAddress")
    public void clickLoginLink() {
        loginPage.clickLoginLink();
    }

    @Test(dependsOnMethods = "clickLoginLink")
    public void enterInputPassword() {
        loginPage.enterInputPassword(readFromExcel.password);
    }


    @Test(dependsOnMethods = "enterInputPassword")
    public void clickLoginTests() {
        loginPage.clickLoginButton_xpath();
        takeScreenshots.takesSnapShot(driver, "Login Page");
    }


}
