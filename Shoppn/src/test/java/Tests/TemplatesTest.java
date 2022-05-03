package Tests;

import Pages.AffiliatesPage;
import Pages.LoginPage;
import Pages.TemplatesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemplatesTest extends TestBase {
    LoginPage loginPage;
    TemplatesPage templatesPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkTemplatesOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        templatesPage = new TemplatesPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templatesPage.templatesPage);

        templatesPage.openTemplatesTab();

        WebDriverWait wait = new WebDriverWait(driver ,20);
        wait.until(ExpectedConditions.visibilityOf(templatesPage.templatesText));

        Assert.assertTrue(templatesPage.templatesText.getText().contains("القوالب"));
        System.out.println(templatesPage.templatesText.getText());
    }
    }

