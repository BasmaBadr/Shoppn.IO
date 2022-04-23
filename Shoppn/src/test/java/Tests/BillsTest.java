package Tests;

import Pages.BillsPage;
import Pages.EditStoreDesignPage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillsTest extends TestBase {
    LoginPage loginPage;
    BillsPage billsPage;

    @Test
    public void checkBillsTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        billsPage = new BillsPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", billsPage.billsTab);

        billsPage.openBillsTab();
        Assert.assertTrue(billsPage.billsTxt.getText().contains("فواتيري"));
        System.out.println(billsPage.billsTxt.getText());
    }
}
