package Tests;

import Pages.AffiliateTransactionsPage;
import Pages.AffiliatesPage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AffiliateTransactionsTest extends TestBase {
    LoginPage loginPage;
    AffiliateTransactionsPage affiliateTransactionsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkAffiliteTransactionTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        affiliateTransactionsPage = new AffiliateTransactionsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", affiliateTransactionsPage.affilliateMain);
        affiliateTransactionsPage.openAffilatesTransactionTab();
        Assert.assertTrue(affiliateTransactionsPage.affilliateText.getText().contains("تحويلات الموسوقين المالية"));
        System.out.println(affiliateTransactionsPage.affilliateText.getText());
    }
}
