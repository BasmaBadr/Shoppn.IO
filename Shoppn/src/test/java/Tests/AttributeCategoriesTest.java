package Tests;

import Pages.AttributeCategoriesPage;
import Pages.CategoriesPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeCategoriesTest extends TestBase {

    LoginPage loginpage ;
    AttributeCategoriesPage attributeCategoriesPage;
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        attributeCategoriesPage= new AttributeCategoriesPage(driver);
        loginpage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        attributeCategoriesPage.openAttributeTab();
        Assert.assertTrue(attributeCategoriesPage.attributeText.getText().contains("الخصائص"));
        System.out.println(attributeCategoriesPage.attributeText.getText());

    }

}
