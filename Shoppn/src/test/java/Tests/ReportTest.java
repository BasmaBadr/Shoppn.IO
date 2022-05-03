package Tests;

import Pages.LoginPage;
import Pages.ReportsPage;
import Pages.TagsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportTest extends TestBase {

    LoginPage loginPage;
    ReportsPage reportsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkReportstabOpen(){
        loginPage = new LoginPage(driver);
        reportsPage = new ReportsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        reportsPage.openReportTab();
        Assert.assertTrue(reportsPage.reportsText.getText().contains("التقارير"));
        System.out.println(reportsPage.reportsText.getText());

    }

}
