package Tests;

import Pages.AdvancedProductPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedProductTest extends TestBase {
    LoginPage loginPage;
    AdvancedProductPage advancedProductPage;

    @Test
    public void checkAdvancedProductOpen(){
        loginPage=new LoginPage(driver);
        advancedProductPage = new AdvancedProductPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        advancedProductPage.openAdvancedProductTab();
        Assert.assertTrue(advancedProductPage.advancedProductText.getText().contains("اضافة منتج متقدم"));
        System.out.println(advancedProductPage.advancedProductText.getText());
    }
}
