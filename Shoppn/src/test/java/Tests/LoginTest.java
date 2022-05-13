package Tests;

import Data.ExcelReaderLogin;
import Pages.LogOutPage;
import Pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginTest extends TestBase{
   LoginPage loginPage;
   LogOutPage logOutPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";


    @DataProvider(name = "ExcelData")
    public Object[][] userloginData() throws IOException {
        // get data from excel reader class
        ExcelReaderLogin ER = new ExcelReaderLogin();
        return ER.getExcelData();
    }

    @Test()
    public void userCanLoginwithvalidUNandPW(){
        loginPage = new LoginPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
//        loginPage.Waiits();
        WebDriverWait wait = new WebDriverWait(driver , 20);
        wait.until(ExpectedConditions.visibilityOf(loginPage.Welcommessage));
        Assert.assertTrue(loginPage.Welcommessage.getText().contains("مرحبا بك في Shoppn"));
        System.out.println(loginPage.Welcommessage.getText());
    }
    @Test(dataProvider = "ExcelData")
    public void testLoginWithDataFromExcell(String email , String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        logOutPage = new LogOutPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
//        loginPage.Waiits();
        WebDriverWait wait = new WebDriverWait(driver , 20);
        wait.until(ExpectedConditions.visibilityOf(loginPage.Welcommessage));
        Assert.assertTrue(loginPage.Welcommessage.getText().contains("مرحبا بك في Shoppn"));
        System.out.println(loginPage.Welcommessage.getText());
        Thread.sleep(20000);



    }

//    @Test
//    public void checkelement()
//    {
//        loginPage = new LoginPage(driver);
////        loginPage.checkno();
//    }


}
