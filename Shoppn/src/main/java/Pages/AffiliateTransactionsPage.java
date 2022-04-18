package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateTransactionsPage extends PageBase {
    public AffiliateTransactionsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'نظام التسويق بالعمولة')]")
    WebElement affilliateMain;
    @FindBy(xpath = "//span[contains(text(),'التحويلات المالية')]")
    WebElement affilliateTransactionTab;
    @FindBy(xpath = "//h3[contains(text(),'تحويلات الموسوقين المالية')]")
    public   WebElement affilliateText;

    public void openAffilatesTransactionTab(){
        clickButton(affilliateMain);
        clickButton(affilliateTransactionTab);
    }
}