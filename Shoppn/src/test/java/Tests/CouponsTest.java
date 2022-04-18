package Tests;

import Pages.CouponsPage;
import Pages.LoginPage;
import Pages.ReportsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CouponsTest extends TestBase {
    LoginPage loginPage;
    CouponsPage couponsPage;

    @Test
    public void checkReportstabOpen(){
        loginPage = new LoginPage(driver);
        couponsPage = new CouponsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        couponsPage.openCouponsTab();
        Assert.assertTrue(couponsPage.couponsText.getText().contains("قائمة اكواد الخصم"));
        System.out.println(couponsPage.couponsText.getText());

    }

}
