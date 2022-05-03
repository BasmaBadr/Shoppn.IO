package Tests;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends TestBase {

    ProductsPage productPage ;
    LoginPage loginPage ;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkProductsTabOpen()
    {
        productPage = new ProductsPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        productPage.openProductsTab();
        Assert.assertTrue(productPage.productsText.getText().contains("المنتجات"));
        System.out.println(productPage.productsText.getText());
    }
}
