package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliatesPage extends PageBase {
    public AffiliatesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[17]/a/span[2]")
    WebElement affilliateMain;
    @FindBy(xpath = "//span[contains(text(),'المسوقين بالعمولة')]")
    WebElement affilliateTab;
    @FindBy(xpath = "//h3[contains(text(),'المسوقين بالعمولة')]")
  public   WebElement affilliateText;

    public void openAffilatesTab(){
        clickButton(affilliateMain);
        clickButton(affilliateTab);
    }
}
