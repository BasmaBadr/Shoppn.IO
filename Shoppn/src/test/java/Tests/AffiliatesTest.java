package Tests;

import Pages.AffiliatesPage;
import Pages.LoginPage;
import Pages.SimpleProductPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AffiliatesTest extends TestBase {

    LoginPage loginPage;
    AffiliatesPage affiliatesPage;

    @Test
    public void checkAffiliteTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        affiliatesPage = new AffiliatesPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", affiliatesPage.affilliateMain);

        affiliatesPage.openAffilatesTab();
        Assert.assertTrue(affiliatesPage.affilliateText.getText().contains("المسوقين بالعمولة"));
        System.out.println(affiliatesPage.affilliateText.getText());
    }
}
