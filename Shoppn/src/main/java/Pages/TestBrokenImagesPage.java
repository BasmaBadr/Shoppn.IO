package Pages;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class TestBrokenImagesPage extends PageBase{
    public TestBrokenImagesPage (WebDriver driver){ super(driver);}

//    public int invalidImageCount ;
//
//
//
//    public void verifyActiveImage(WebElement imgElement) {
//
//       // HttpClient from apache
//        org.apache.hc.client5.http.classic.HttpClient client = HttpClientBuilder.create().build();
//
//        HttpGet request = new HttpGet(imgElement.getAttribute("src"));
//        try {
//            // HttpResponse from apache
//            HttpResponse response = client.execute(request);
//            if (response.getCode() !=200)
//            {
//                invalidImageCount++;
//            }
//        }
//        catch (ClientProtocolException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//                e.printStackTrace();
//
//       }
//
//    }
}
