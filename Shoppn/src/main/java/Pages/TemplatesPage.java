package Pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TemplatesPage extends PageBase{
    public TemplatesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'القوالب')]")
   public WebElement templatesPage;
    @FindBy(xpath = "//h3[contains(text(),'القوالب')]")
   public WebElement templatesText;

    public void scrollDown(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templatesPage);

    }

    public void openTemplatesTab(){
        clickButton(templatesPage);
    }
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", ele);
}
