package Tests;

import Pages.AffiliateTransactionsPage;
import Pages.AffiliatesPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AffiliateTransactionsTest extends TestBase {
    LoginPage loginPage;
    AffiliateTransactionsPage affiliateTransactionsPage;

    @Test
    public void checkSimpleProductTabOpen(){
        loginPage = new LoginPage(driver);
        affiliateTransactionsPage = new AffiliateTransactionsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        affiliateTransactionsPage.openAffilatesTransactionTab();
        Assert.assertTrue(affiliateTransactionsPage.affilliateText.getText().contains("تحويلات الموسوقين المالية"));
        System.out.println(affiliateTransactionsPage.affilliateText.getText());
    }
}
