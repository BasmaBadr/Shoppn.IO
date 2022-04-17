package Tests;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends TestBase {

    ProductsPage productPage ;
    LoginPage loginPage ;
    @Test
    public void checkProductsTabOpen()
    {
        productPage = new ProductsPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        productPage.openProductsTab();
        Assert.assertTrue(productPage.productsText.getText().contains("المنتجات"));
        System.out.println(productPage.productsText.getText());
    }
}
