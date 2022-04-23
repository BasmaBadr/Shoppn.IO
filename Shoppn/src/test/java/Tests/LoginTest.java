package Tests;

import Pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends TestBase{
   LoginPage loginPage;
    @Test
    public void userCanLoginwithvalidUNandPW(){
        loginPage = new LoginPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
//        loginPage.Waiits();
        WebDriverWait wait = new WebDriverWait(driver , 20);
        wait.until(ExpectedConditions.visibilityOf(loginPage.Welcommessage));
        Assert.assertTrue(loginPage.Welcommessage.getText().contains("مرحبا بك في Shoppn"));
        System.out.println(loginPage.Welcommessage.getText());
    }

    @Test
    public void checkelement()
    {
        loginPage = new LoginPage(driver);
//        loginPage.checkno();
    }


}
