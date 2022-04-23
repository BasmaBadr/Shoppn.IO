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

    @Test
    public void testLogoOut() throws InterruptedException {
        loginPage=new LoginPage(driver);
        logOutPage=new LogOutPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logOutPage.logOut);
        WebDriverWait wait = new WebDriverWait(driver ,20);
        wait.until(ExpectedConditions.visibilityOf(loginPage.Submit));

        Assert.assertTrue(loginPage.Submit.getText().contains("تسجيل دخول"));
        System.out.println(loginPage.Submit.getText());


    }
}
