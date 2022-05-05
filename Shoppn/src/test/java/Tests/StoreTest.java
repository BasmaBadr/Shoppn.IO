package Tests;

import Pages.EditStoreDesignPage;
import Pages.LoginPage;
import Pages.StorePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends TestBase {

    LoginPage loginPage;
    StorePage storePage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkEditStoreTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        storePage = new StorePage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", storePage.storeTab);

        storePage.openStoreTab();
        Assert.assertTrue(storePage.storeTxt.getText().contains("تعديل تصميم المتجر"));
        System.out.println(storePage.storeTxt.getText());
    }
}
