package Pages;

public class LandingPage {
    public void verifyProductSelection() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
}
