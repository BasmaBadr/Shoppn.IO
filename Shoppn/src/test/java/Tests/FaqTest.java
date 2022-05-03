package Tests;

import Pages.CategoriesPage;
import Pages.FaqPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaqTest extends TestBase {
    LoginPage loginpage ;
     FaqPage faqPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";
    @Test
    public void checkNewsTabOpen(){
        loginpage = new LoginPage(driver);
        faqPage= new FaqPage(driver);
        loginpage.loginWithValidUNandPW(email , password);
        faqPage.openFaqTab();
        Assert.assertTrue(faqPage.faqText.getText().contains("الاسئلة الشائعة"));
        System.out.println(faqPage.faqText.getText());

    }
}
