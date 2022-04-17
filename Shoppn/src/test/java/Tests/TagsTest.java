package Tests;

import Pages.AttributeCategoriesPage;
import Pages.LoginPage;
import Pages.TagsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TagsTest extends TestBase {
    LoginPage loginpage ;
    TagsPage tagsPage;
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        tagsPage= new TagsPage(driver);
        loginpage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        tagsPage.openTagsTab();
        Assert.assertTrue(tagsPage.tagsText.getText().contains("قائمة وسوم المنتجات"));
        System.out.println(tagsPage.tagsText.getText());

    }
}
