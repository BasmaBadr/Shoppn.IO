package Tests;

import Pages.Abandoned_cartsPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Abandoned_cartsTest extends TestBase {
    Abandoned_cartsPage abandonedCartsPage ;
    LoginPage loginPage;
    @Test
    public void checkAbandonedcartTabOpen(){
        loginPage = new LoginPage(driver);
        abandonedCartsPage = new Abandoned_cartsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        abandonedCartsPage.openAbandonedTab();
        Assert.assertTrue(abandonedCartsPage.abandonedText.getText().contains("السلات المهجورة"));
       System.out.println(abandonedCartsPage.abandonedText.getText());

    }
}
