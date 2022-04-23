package Tests;

import Pages.LoginPage;
import Pages.ReviewsPage;
import Pages.SettingsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTest extends TestBase {

    LoginPage loginPage;
    SettingsPage settingsPage;

    @Test
    public void checkSettingsTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        settingsPage = new SettingsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
//        Thread.sleep(20000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", settingsPage.settingsTxt);

        settingsPage.openSettingsTab();
        Assert.assertTrue(settingsPage.settingsTxt.getText().contains("الأعدادات"));
        System.out.println(settingsPage.settingsTxt.getText());
    }
}
