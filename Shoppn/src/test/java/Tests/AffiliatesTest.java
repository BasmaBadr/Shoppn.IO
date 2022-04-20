package Tests;

import Pages.AffiliatesPage;
import Pages.LoginPage;
import Pages.SimpleProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AffiliatesTest extends TestBase {

    LoginPage loginPage;
     AffiliatesPage affiliatesPage;

    @Test
    public void checkAffiliteTabOpen(){
        loginPage = new LoginPage(driver);
        affiliatesPage = new AffiliatesPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        affiliatesPage.openAffilatesTab();
        Assert.assertTrue(affiliatesPage.affilliateText.getText().contains("المسوقين بالعمولة"));
        System.out.println(affiliatesPage.affilliateText.getText());
    }
}
