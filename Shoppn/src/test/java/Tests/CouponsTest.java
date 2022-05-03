package Tests;

import Pages.CouponsPage;
import Pages.LoginPage;
import Pages.ReportsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CouponsTest extends TestBase {
    LoginPage loginPage;
    CouponsPage couponsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkReportstabOpen(){
        loginPage = new LoginPage(driver);
        couponsPage = new CouponsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        couponsPage.openCouponsTab();
        Assert.assertTrue(couponsPage.couponsText.getText().contains("قائمة اكواد الخصم"));
        System.out.println(couponsPage.couponsText.getText());

    }

}
