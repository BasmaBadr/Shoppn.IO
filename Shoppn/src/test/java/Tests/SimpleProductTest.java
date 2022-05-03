package Tests;

import Pages.Abandoned_cartsPage;
import Pages.LoginPage;
import Pages.SimpleProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleProductTest extends TestBase {

    LoginPage loginPage;
    SimpleProductPage simpleProductPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkSimpleProductTabOpen(){
        loginPage = new LoginPage(driver);
        simpleProductPage = new SimpleProductPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        simpleProductPage.openSimpleProductTab();
        Assert.assertTrue(simpleProductPage.simpleProductText.getText().contains("اضافة منتج بسيط"));
        System.out.println(simpleProductPage.simpleProductText.getText());
    }

}
