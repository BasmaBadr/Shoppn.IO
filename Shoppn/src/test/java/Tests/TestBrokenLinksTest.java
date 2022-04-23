package Tests;

import Pages.LoginPage;
import Pages.TemplatesPage;
import Pages.TestBrokenLinksPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestBrokenLinksTest extends TestBase {

    LoginPage loginPage;
    TestBrokenLinksPage testBrokenLinksPage;

    @Test
    public void testBrokenLinks() throws InterruptedException {
        loginPage = new LoginPage(driver);
        testBrokenLinksPage = new TestBrokenLinksPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        Thread.sleep(20000);
       // testBrokenLinksPage.testBrokenLinks();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are " + links.size());
        for (int i = 0 ; i < links.size() ; i++)
        {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            testBrokenLinksPage.verifyLink(url);
        }
    }
    }


