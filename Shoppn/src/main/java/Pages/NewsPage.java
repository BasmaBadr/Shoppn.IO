package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends PageBase {

    public NewsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'المشتركين في النشره')]")
    WebElement NewsTab;
    @FindBy(xpath = "//h3[contains(text(),'المشتركين في النشره')]")
   public WebElement newsText;


    public void openNewsTab(){
        clickButton(NewsTab);

    }

}
