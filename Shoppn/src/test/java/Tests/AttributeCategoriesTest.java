package Tests;

import Pages.AttributeCategoriesPage;
import Pages.CategoriesPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeCategoriesTest extends TestBase {

    LoginPage loginpage ;
    AttributeCategoriesPage attributeCategoriesPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        attributeCategoriesPage= new AttributeCategoriesPage(driver);
        loginpage.loginWithValidUNandPW(email , password);

        attributeCategoriesPage.openAttributeTab();
        Assert.assertTrue(attributeCategoriesPage.attributeText.getText().contains("الخصائص"));
        System.out.println(attributeCategoriesPage.attributeText.getText());

    }

}
