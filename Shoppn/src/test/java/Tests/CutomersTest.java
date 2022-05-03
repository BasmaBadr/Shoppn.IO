package Tests;

import Pages.CustomersPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CutomersTest extends TestBase{
    CustomersPage customersPage;
    LoginPage loginpPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
  @Test
    public void checkCustomersTabOpen(){
      customersPage = new CustomersPage(driver);
      loginpPage = new LoginPage(driver);
      loginpPage.loginWithValidUNandPW(email , password);
      customersPage.openCustomersTab();
      Assert.assertTrue(customersPage.MessageText.getText().contains("العملاء"));
  }

}
