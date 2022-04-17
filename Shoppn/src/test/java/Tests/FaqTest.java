package Tests;

import Pages.CategoriesPage;
import Pages.FaqPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaqTest extends TestBase {
    LoginPage loginpage ;
     FaqPage faqPage;
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        faqPage= new FaqPage(driver);
        loginpage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        faqPage.openFaqTab();
        Assert.assertTrue(faqPage.faqText.getText().contains("الاسئلة الشائعة"));
        System.out.println(faqPage.faqText.getText());

    }
}
