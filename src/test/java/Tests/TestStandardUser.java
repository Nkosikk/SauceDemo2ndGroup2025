package Tests;

import Pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStandardUser extends BaseTest{
    @Test
    public void TestStandardUserCanLogin () {
       LandingPage  landingPage = loginPage.loginWith("standard_user", "secret_sauce");
        Assert.assertTrue(landingPage.isTitleDisplayed());
    }
}
