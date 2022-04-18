package Tests;

import Pages.CustomersPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CutomersTest extends TestBase{
    CustomersPage customersPage;
    LoginPage loginpPage;
  @Test
    public void checkCustomersTabOpen(){
      customersPage = new CustomersPage(driver);
      loginpPage = new LoginPage(driver);
      loginpPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
      customersPage.openCustomersTab();
      Assert.assertTrue(customersPage.MessageText.getText().contains("لا يوجد محفوظات"));

  }
}
