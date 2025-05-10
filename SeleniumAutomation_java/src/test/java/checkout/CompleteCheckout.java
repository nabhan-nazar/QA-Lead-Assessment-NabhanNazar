package checkout;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;

public class CompleteCheckout extends BaseTests {

    @Test
    public void successfulCheckout() {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        HomePage homePage = loginPage.clickLoginButton();
        homePage.selectItems();
        CheckoutPage checkoutPage = homePage.clickShoppingCart();
        checkoutPage.clickCheckoutButton();
        checkoutPage.enterUserDetails("fn", "ln", "123");
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();
    }

}
