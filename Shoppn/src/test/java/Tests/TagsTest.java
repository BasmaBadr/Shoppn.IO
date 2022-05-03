package Tests;

import Pages.AttributeCategoriesPage;
import Pages.LoginPage;
import Pages.TagsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TagsTest extends TestBase {
    LoginPage loginpage ;
    TagsPage tagsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        tagsPage= new TagsPage(driver);
        loginpage.loginWithValidUNandPW(email , password);
        tagsPage.openTagsTab();
        Assert.assertTrue(tagsPage.tagsText.getText().contains("قائمة وسوم المنتجات"));
        System.out.println(tagsPage.tagsText.getText());

    }
}
