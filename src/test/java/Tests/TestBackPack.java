package Tests;

import Pages.LandingPage;
import org.testng.Assert;

public class TestBackPack extends BaseTest{
    public void testAddBackPack(){
        LandingPage landingPage = loginPage.loginWith("standard_user", "secret_sauce");
        landingPage.clickBackpack();
        Assert.assertEquals(landingPage.getButtonName(), "REMOVE");
    }

}
