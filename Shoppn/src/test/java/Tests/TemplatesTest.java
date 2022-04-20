package Tests;

import Pages.AffiliatesPage;
import Pages.LoginPage;
import Pages.TemplatesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemplatesTest extends TestBase {
    LoginPage loginPage;
    TemplatesPage templatesPage;

    @Test
    public void checkTemplatesOpen(){
        loginPage = new LoginPage(driver);
        templatesPage = new TemplatesPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        templatesPage.openTemplatesTab();
        Assert.assertTrue(templatesPage.templatesPage.isDisplayed());
//        Assert.assertTrue(templatesPage.templatesText.getText().contains("القوالب"));
//        System.out.println(templatesPage.templatesText.getText());
    }
    }

