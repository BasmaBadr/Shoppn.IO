package Tests;

import Pages.AffiliateSettingsPage;
import Pages.AffiliatesPage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AffiliateSettingsTest extends TestBase{
    LoginPage loginPage;
    AffiliateSettingsPage affiliateSettingsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkAffiliteSettingsTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        affiliateSettingsPage = new AffiliateSettingsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", affiliateSettingsPage.affilliateMain);
        affiliateSettingsPage.openAffilatesSettingsTab();
        Thread.sleep(20000);
        Assert.assertTrue(affiliateSettingsPage.affilliateSettingsText.getText().contains("اعدادات نظام التسويق بالعمولة"));
        System.out.println(affiliateSettingsPage.affilliateSettingsText.getText());
    }
}
