package Tests;

import Pages.LoginPage;
import Pages.ProfileDetailsPage;
import Pages.SettingsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileDetailsTest extends TestBase {

    LoginPage loginPage;
    ProfileDetailsPage profileDetailsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkSettingsTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        profileDetailsPage = new ProfileDetailsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
//        Thread.sleep(20000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", settingsPage.settingsTxt);

        profileDetailsPage.openProfileDetailsTab();
        Assert.assertTrue(profileDetailsPage.saveBtn.getText().contains("حفظ التغييرات"));
        System.out.println(profileDetailsPage.saveBtn.getText());
    }
}
