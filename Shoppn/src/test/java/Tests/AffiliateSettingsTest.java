package Tests;

import Pages.AffiliateSettingsPage;
import Pages.AffiliatesPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AffiliateSettingsTest extends TestBase{
    LoginPage loginPage;
    AffiliateSettingsPage affiliateSettingsPage;

    @Test
    public void checkAffiliteSettingsTabOpen(){
        loginPage = new LoginPage(driver);
        affiliateSettingsPage = new AffiliateSettingsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        affiliateSettingsPage.openAffilatesSettingsTab();
        Assert.assertTrue(affiliateSettingsPage.affilliateSettingsText.getText().contains("اعدادات نظام التسويق بالعمولة"));
        System.out.println(affiliateSettingsPage.affilliateSettingsText.getText());
    }
}
