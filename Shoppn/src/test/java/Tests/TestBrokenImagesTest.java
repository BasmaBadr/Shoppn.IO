package Tests;

import Pages.LoginPage;
import Pages.TestBrokenImagesPage;
import Pages.TestBrokenLinksPage;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestBrokenImagesTest extends TestBase{

     LoginPage loginPage;
     TestBrokenImagesPage testBrokenImagesPage;




      @Test
       public void testBrokenImages() throws InterruptedException {
          invalidImageCount = 0 ;
          loginPage = new LoginPage(driver);
          testBrokenImagesPage = new TestBrokenImagesPage(driver);
          loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
          Thread.sleep(20000);
          List<WebElement> imageList = driver.findElements(By.tagName("img"));
          for (WebElement imgElement : imageList)
          {
              if (imgElement != null)
              {
                  verifyActiveImage(imgElement);
              }
          }
          System.out.println("Total number of images are : "  + invalidImageCount);
      }

    public int invalidImageCount ;
    public void verifyActiveImage(WebElement imgElement) {
        // HttpClient from apache
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(imgElement.getAttribute("src"));
        try {
            // HttpResponse from apache
            HttpResponse response = client.execute(request);
            if (response.getCode() !=200)
            {
                invalidImageCount++;
            }
        }
        catch (ClientProtocolException e)
        {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
