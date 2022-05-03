package Tests;

import Pages.CategoriesPage;
import Pages.LoginPage;
import Pages.NewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends TestBase {
    LoginPage loginpage ;
    CategoriesPage categoriesPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        categoriesPage= new CategoriesPage(driver);
        loginpage.loginWithValidUNandPW(email , password);
        categoriesPage.openCategoriesTab();
        Assert.assertTrue(categoriesPage.categoriesText.getText().contains("الاقسام"));
        System.out.println(categoriesPage.categoriesText.getText());

    }
}
