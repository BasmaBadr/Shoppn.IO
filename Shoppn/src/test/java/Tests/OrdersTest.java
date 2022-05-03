package Tests;

import Pages.LoginPage;
import Pages.OrdersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrdersTest extends TestBase{
    OrdersPage orderpage;
    LoginPage loginPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkOrdersTabOpen(){

        orderpage = new OrdersPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        orderpage.checkIfOrderTabOpen();
        Assert.assertTrue(orderpage.MessageText.getText().contains("لا يوجد محفوظات"));
    }

}
