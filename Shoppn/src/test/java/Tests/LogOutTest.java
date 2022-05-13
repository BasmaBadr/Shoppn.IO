package Tests;

import Pages.LogOutPage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    LoginPage loginPage;
    LogOutPage logOutPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void testLogoOut() throws InterruptedException {
        loginPage=new LoginPage(driver);
        logOutPage=new LogOutPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);

        logOutPage.logoutfromshoppn();
//        WebDriverWait wait = new WebDriverWait(driver ,20);
//        wait.until(ExpectedConditions.visibilityOf(loginPage.Submit));
//
//        Assert.assertTrue(loginPage.Submit.getText().contains("تسجيل دخول"));
//        System.out.println(loginPage.Submit.getText());


    }
}
