package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateSettingsPage extends PageBase {


    public AffiliateSettingsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[17]/a/span[2]")
   public WebElement affilliateMain;
    @FindBy(xpath = "//span[contains(text(),'اعدادات نظام التسويق بالعمولة')]")
    WebElement affilliateSettings;
    @FindBy(xpath = "//h3[contains(text(),'اعدادات نظام التسويق بالعمولة')]")
    public   WebElement affilliateSettingsText;

    public void openAffilatesSettingsTab(){
        clickButton(affilliateMain);
        clickButton(affilliateSettings);
    }
}
