package Tests;

import Pages.CategoriesPage;
import Pages.LoginPage;
import Pages.NewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends TestBase {
    LoginPage loginpage ;
    CategoriesPage categoriesPage;
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        categoriesPage= new CategoriesPage(driver);
        loginpage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        categoriesPage.openCategoriesTab();
        Assert.assertTrue(categoriesPage.categoriesText.getText().contains("الاقسام"));
        System.out.println(categoriesPage.categoriesText.getText());

    }
}
