package Tests;

import Pages.AdvancedProductPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedProductTest extends TestBase {
    LoginPage loginPage;
    AdvancedProductPage advancedProductPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkAdvancedProductOpen(){
        loginPage=new LoginPage(driver);
        advancedProductPage = new AdvancedProductPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        advancedProductPage.openAdvancedProductTab();
        Assert.assertTrue(advancedProductPage.advancedProductText.getText().contains("اضافة منتج متقدم"));
        System.out.println(advancedProductPage.advancedProductText.getText());
    }
}
