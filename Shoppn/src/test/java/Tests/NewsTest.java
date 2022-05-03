package Tests;

import Pages.LoginPage;
import Pages.NewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsTest extends TestBase {
    NewsPage newspage;
    LoginPage loginpage ;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkNewsTabOpen(){
    loginpage = new LoginPage(driver);
    newspage= new NewsPage(driver);
    loginpage.loginWithValidUNandPW(email , password);
    newspage.openNewsTab();
        Assert.assertTrue(newspage.newsText.getText().contains("المشتركين في النشره"));

    }

}
