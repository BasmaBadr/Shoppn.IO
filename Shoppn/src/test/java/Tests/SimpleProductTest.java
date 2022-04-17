package Tests;

import Pages.Abandoned_cartsPage;
import Pages.LoginPage;
import Pages.SimpleProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleProductTest extends TestBase {

    LoginPage loginPage;
    SimpleProductPage simpleProductPage;

    @Test
    public void checkSimpleProductTabOpen(){
        loginPage = new LoginPage(driver);
        simpleProductPage = new SimpleProductPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        simpleProductPage.openSimpleProductTab();
        Assert.assertTrue(simpleProductPage.simpleProductText.getText().contains("اضافة منتج بسيط"));
        System.out.println(simpleProductPage.simpleProductText.getText());
    }

}
