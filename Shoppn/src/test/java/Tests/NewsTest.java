package Tests;

import Pages.LoginPage;
import Pages.NewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsTest extends TestBase {
    NewsPage newspage;
    LoginPage loginpage ;

    @Test
    public void checkNewsTabOpen(){
    loginpage = new LoginPage(driver);
    newspage= new NewsPage(driver);
    loginpage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
    newspage.openNewsTab();
        Assert.assertTrue(newspage.newsText.getText().contains("المشتركين في النشره"));

    }

}
