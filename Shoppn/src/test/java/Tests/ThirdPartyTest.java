package Tests;

import Pages.LoginPage;
import Pages.ThirdPartyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdPartyTest extends TestBase {
    LoginPage loginPage;
    ThirdPartyPage thirdPartyPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkThirdPartyTabOpen(){
        loginPage = new LoginPage(driver);
        thirdPartyPage = new ThirdPartyPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        thirdPartyPage.openThirdPartyTab();
        Assert.assertTrue(thirdPartyPage.thirdPartyText.getText().contains("الربط مع طرف ثالث"));
        System.out.println(thirdPartyPage.thirdPartyText.getText());
    }
}
