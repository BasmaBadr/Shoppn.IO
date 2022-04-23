package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestBrokenLinksPage extends PageBase {
    public TestBrokenLinksPage(WebDriver driver) {
        super(driver);
    }
//    @FindBy(tagName = "a")
//
//    WebElement linkss;
//
//
//
//    public void testBrokenLinks(){
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Total links are " + links.size());
//        for (int i = 0 ; i < links.size() ; i++)
//        {
//         WebElement element = links.get(i);
//         String url = element.getAttribute("href");
//         verifyLink(url);
//
//        }
//
//    }
//
    public void verifyLink(String urlLink)
    {
        try {
            URL link = new URL(urlLink);
            // Create a connection using URL object
            HttpURLConnection htttpConn = (HttpURLConnection) link.openConnection();
            htttpConn.setConnectTimeout(2000);
            htttpConn.connect();

            // use getResponseCode() to get response code
            if (htttpConn.getResponseCode() == 200) {
                System.out.println(urlLink + " - " + htttpConn.getResponseMessage());
            }
            if (htttpConn.getResponseCode() == 404) {
                System.out.println(urlLink + " - " + htttpConn.getResponseMessage());
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
    }
}
